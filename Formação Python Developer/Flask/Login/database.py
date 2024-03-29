#python -m pip install pymongo==3.12
from pymongo.mongo_client import MongoClient
from pymongo.server_api import ServerApi
import datetime



class Database:

    def __init__(self) -> None:
        
        bloco = open("credenciais.txt", "r").read()
        self.uri = f"mongodb+srv://{bloco}:{bloco}@cluster0.u6y9agk.mongodb.net/?retryWrites=true&w=majority"

        # Create a new client and connect to the server
        self.client = MongoClient(self.uri, server_api=ServerApi('1'))

        try: # Send a ping to confirm a successful connection
            self.client.admin.command('ping')
            print("Pinged your deployment. You successfully connected to MongoDB!")

        except Exception as e:
            print(e)


        self.collection = self.client["My_page"]["Login"]


    def insert_credential(self, username, password, ):
        
        result_consult = self.consult_credential(username)

        if result_consult == None:
            insert={
                "username": username,
                "password": password,
                "data": datetime.datetime.now()
            }

            result_insert = self.collection.insert_one(insert)

            if result_insert.acknowledged:
                print("Inserted successfully")
                return True
            else:
                print("Error occurred")
                return False

        else:
            return False
            
        

    def consult_credential(self, username):
        
        consult={
            "username": username
        }
        result = self.collection.find_one(consult)
        
        return result

