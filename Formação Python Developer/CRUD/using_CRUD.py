from CRUD_pymongo import CRUD_Mongo

import json

action = CRUD_Mongo()


def read_json():
        
    with open('new.json', 'r') as file:
        data_json = json.load(file)
        return data_json


def checked_and_update():
    result_json = read_json()
    result_mongo = action.find_all_mongo()

    for position, (item_j, item_m) in enumerate(itertools.zip_longest(result_json, result_mongo)):
    # for position, (item_j, item_m) in enumerate(itertools.zip_longest(result_json, result_mongo)):
        """
        Itera sobre os elementos das duas listas, tendo como banse uma variavel para posição
        """
        
        print(position)
        print(item_j)
        print(item_m)
        
        if item_j != item_m:
            print(f'position {position}: {item_j} not equal {item_m}')
            filter = {"_id": item_j['_id']}
            document = {"$set": {"qt": item_j['qt']}}
            action.up_mongo(id=filter, up=document)
        



# action.insert_many_mongo(read_json())

# action.insert_many_mongo(document)
# action.find_all_mongo()
# action.del_all_mongo()

checked_and_update()
