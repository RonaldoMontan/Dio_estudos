from faker import Faker

def criadados():
    fake = Faker()
    dados = {}
    linhas =[]

    for _ in range(100):
        # linha = [fake.name(), fake.address(), fake.random_int(0, 100), fake.job(), fake.email(), fake.phone_number()]
        dados={
            "name": fake.name(),
            "address": fake.address(),
            "age": fake.random_int(0, 100),
            "job": fake.job(),
            "email": fake.email(),
            "phone": fake.phone_number()
        }
        linhas.append(dados)

    return {"dados": linhas}