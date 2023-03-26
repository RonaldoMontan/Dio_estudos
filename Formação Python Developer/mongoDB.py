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

client = pym.MongoClient("mongodb+srv://ronaldo:<password>@cluster0.cg7kybh.mongodb.net/?retryWrites=true&w=majority")
print(type(client))
print('===')
print(client)