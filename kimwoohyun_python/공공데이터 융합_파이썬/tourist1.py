import json
with open('서울특별시_관광지입장정보_2020_2020.json',encoding='utf-8') as json_file:
    miso=json.load(json_file)
print(miso)