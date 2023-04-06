"""
###### MongoDB x SQL ######

Documento      |  Instância (linha)
Campo (field)  |  Coluna (atributo)
Coleção        |  Tabela

é preciso criar a instância na nuvem para conexão, seguir o passo a passo do link:
https://pymongo.readthedocs.io/en/stable/atlas.html

depois é preciso ter instalado build-essential:
sudo apt install build-essential python3-dev

precisa acessar o mongo atlas-> Network Access para liberar o ip da maquina para inserir dados no banco
"""

import pprint
import pymongo as pym
import datetime

client = pym.MongoClient("mongodb+srv://ronaldo:ronaldo@cluster0.u6y9agk.mongodb.net/?retryWrites=true&w=majority")
db = client.test
collection = db.test_collection


post = {
    "author": "teste",
    "text": "super teste",
    "tags": ["mongodb", "python3", "pymongo"],
    "date": datetime.datetime.now()
}

#preparando para submeter as informações, nome da coleção é post
posts = db.posts 
# result = posts.insert_one(post)

# if result.acknowledged:
#     print("Inserido com sucesso. Id do registro:", result.inserted_id)
# else:
#     print("Ocorreu um erro ao inserir os dados.")

print(db.list_collection_names()) #imprime [post]

#recuperando informações com exibição identada
pprint.pprint(db.posts.find_one())


# buck insert / inserir mais de um; é passando o dicionario dentro de uma lista
new_post = [{
    "author": "um",
    "text": "primeira inserção",
    "tags": ["mongodb", "python3", "pymongo"],
    "date": datetime.datetime.now()
    },
    {
    "author": "dois",
    "text": "segunda inserção",
    "tags": ["mongodb", "python3", "pymongo"],
    "date": datetime.datetime.now()
    }
]

# result = posts.insert_many(new_post)

# if result.acknowledged:
#     print("Inserido com sucesso. Id do registro:", result.inserted_ids)
# else:
#     print("Ocorreu um erro ao inserir os dados.")

print('\n Todos os documentos salvos')
for i in posts.find():
    pprint.pprint(i)
    print('\n')

print(f'quantidade de registros {posts.count_documents({})}')


#um parametro para 'count_documents()' pode ser um dicionario
print(f'quantidade de author mike é {posts.count_documents({"author": "mike"})}\n')


#pode ser usado para buscar um registro expecifico.
print('busca precisa')
pprint.pprint(posts.find_one({"author": "um"}))


print('\nRecuperando todos os registros pela ordem da data:')
for i in posts.find({}).sort("author"):
    pprint.pprint(i)


print("""
Criando uma colection nova
            para usuarios.
""")
#definindo um indice para elemento author
result = db.profile_user.create_index([('author', pym.ASCENDING)], unique=True)
print(f'\n\n{result}\n\n')
print(sorted(list(db.profile_user.index_information())))
