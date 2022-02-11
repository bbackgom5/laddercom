#선언
dictionary = {
    "name" : "7D 건조망고",
    "type" : "당절임"
}

#이전
print("요소 제거 이전 : ", dictionary)

#요소 제거
del dictionary["name"]
del dictionary["type"]

#출력
print("요소 제거 이후 : ", dictionary)