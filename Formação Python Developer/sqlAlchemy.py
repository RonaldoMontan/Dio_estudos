from sqlalchemy import Column, Integer,String, ForeignKey, create_engine, inspect, func
from sqlalchemy.orm import declarative_base, Session
from sqlalchemy.orm import relationship
from sqlalchemy.sql import select

Base  = declarative_base()

class User(Base):
    __tablename__ = 'users_account'

    # atributos
    id = Column(Integer, primary_key=True)
    name =Column(String)
    fullname = Column(String)

    address = relationship(
        "Address", back_populates="user", cascade="all, delete-orphan")

    def __repr__(self):
        return f"User(id={self.id}, name={self.name}, fullname={self.fullname})"

class Address(Base):
    __tablename__ = 'address'

    # atributos
    id = Column(Integer, primary_key=True, autoincrement=True)
    email_address = Column(String(30), nullable=False)
    user_id = Column(Integer, ForeignKey("users_account.id"), nullable=False)

    user = relationship(
        "User", back_populates="address")

    def __repr__(self):
        return f"Address(id={self.id}, email_address={self.email_address})"
    

#Conexão com o banco de dados
engine = create_engine("sqlite://")

#criando as classes como tabelas no banco de dados
Base.metadata.create_all(engine)

#insvestiga o esquema do banco de dados
inspetor_engine = inspect(engine)


# print(inspetor_engine.has_table("users_account"))
# print(inspetor_engine.get_table_names())
# print(inspetor_engine.get_columns("users_account"))
# print('===')
# print(inspetor_engine.get_columns("address"))
# print(inspetor_engine.default_schema_name)


with Session(engine) as session:
    
    ronaldo = User(
        name= 'Ronaldo',
        fullname= 'Montan',
        address= [Address(email_address='ronaldo.roanldo@email.com')]
    )

    gol = User(
        name= 'GTS',
        fullname= 'Volkswagem',
        address= [Address(email_address='golgts@email.com'),
                  Address(email_address='outro@email.com') ]
    )

    outro_user = User(
        name= 'Anonimo',
        fullname= '',
        #address= [Address(email_address= '')]
    )

    # enviado para o BD (persistencia de dados)
    session.add_all([ronaldo, gol, outro_user])

    session.commit()

print('for1 ===\n')
stmt = select(User).where(User.name.in_(["Ronaldo", "GTS"]))
for user in session.scalars(stmt):
    print(user)

print('for2 ===\n')

stmt_address = select(Address).where(Address.user_id.in_([1]))
for address in session.scalars(stmt_address):
    print(address)

print('for3 ===\n')

ordenado = select(User).order_by(User.fullname.desc())
for o in session.scalars(ordenado):
    print(o)

print('for4 ===\n')

stmt_join = select(User.fullname, Address.email_address).join_from(Address, User)
for result in session.scalars(stmt_join):
    print(result)


print('\n=========================================================\n')
connection = engine.connect()
results = connection.execute(stmt_join).fetchall()
print(results)

stmt_count = select(func.count("*")).select_from(User)
for result in session.scalars(stmt_count):
    print(result)

