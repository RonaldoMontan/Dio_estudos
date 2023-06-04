from pymongo.mongo_client import MongoClient
from pymongo.server_api import ServerApi

import json

class CRUD_Mongo:

    def __init__(self) -> None:

        with open('credenciais.json') as file:
            value = json.load(file)
        url_mongo = f'mongodb+srv://{value["user"]}:{value["pass"]}@cluster0.u6y9agk.mongodb.net/?retryWrites=true&w=majority'

        client = MongoClient(url_mongo, server_api=ServerApi('1'))

        try:
            client.admin.command('ping')
            print('Pinged your deployment. You successfully connected to MongoDB !')

        except Exception as err:
            print(err)    

        self.collection = client['db_name']['collection_name']


    def insert_mongo(self, document):
        """
        Document need to be a dictionary
        """

        action = self.collection.insert_one(document)
        print(action.acknowledged)


    def insert_many_mongo(self, document): 
        """
        Document needs to be a list
        """

        action = self.collection.insert_many(document)
        print(action.acknowledged)


    def find_mongo(self, id):

        action = self.collection.find_one(id)
        print(action)
        

    def find_all_mongo(self):

        action = self.collection.find()
        return action

    def up_mongo(self, id, up):
        
        action = self.collection.update_one(filter=id, update=up)
        print(action.modified_count)


    def del_mongo(self, id):
        action = self.collection.delete_one(id)
        print(action.acknowledged)
        

    def del_all_mongo(self):
        action = self.collection.delete_many({})
        print(f'{action.deleted_count} register was deleted the collection')

