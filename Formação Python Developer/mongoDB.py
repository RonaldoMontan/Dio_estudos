"""
###### MongoDB x SQL ######

Documento      |  Instância (linha)
Campo (field)  |  Coluna (atributo)
Coleção        |  Tabela

é preciso criar a instância na nuvem para conexão, seguir o passo a passo do link:
https://pymongo.readthedocs.io/en/stable/atlas.html

depois é preciso ter instalado build-essential:
sudo apt install build-essential python3-dev


"""

import pymongo as pym
from pymongo import collation
import datetime

client = pym.MongoClient("mongodb+srv://momo:momo@cluster0.u6y9agk.mongodb.net/?retryWrites=true&w=majority")
db = client.test
collection = db.test_collection


post = {
    "author": "mike",
    "text": "my first mongoDB application based on python",
    "tags": ["mongodb", "python3", "pymongo"],
    "date": datetime.datetime.now()
}

#preparando para submeter as informações
posts = db.posts
result = posts.insert_one(post)

if result.acknowledged:
    print("Inserido com sucesso. Id do registro:", result.inserted_id)
else:
    print("Ocorreu um erro ao inserir os dados.")