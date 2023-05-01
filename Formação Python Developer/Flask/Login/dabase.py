#python -m pip install pymongo==3.12
from pymongo.mongo_client import MongoClient
from pymongo.server_api import ServerApi
import datetime



bloco = open("credenciais.txt", "r").read()

uri = f"mongodb+srv://{bloco}:{bloco}@cluster0.u6y9agk.mongodb.net/?retryWrites=true&w=majority"

# Create a new client and connect to the server
client = MongoClient(uri, server_api=ServerApi('1'))

try: # Send a ping to confirm a successful connection
    client.admin.command('ping')
    print("Pinged your deployment. You successfully connected to MongoDB!")

except Exception as e:
    print(e)


collection = client["My_page"]["Login"]

insert={
    "username": "ronaldo",
    "password": "123",
    "data": datetime.datetime.now()
}

result = collection.insert_one(insert)

if result.acknowledged:
    print("inserido com sucesso")
else:
    print('ocorreu um erro!')


