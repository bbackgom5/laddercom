#선언
list_a = [1,2,3]

#연결 연산자로 리스트 연결
output = list_a+list_a
print("#연결 연산자 사용")
print("#원본 리스트 : ", list_a)
print("#연산 결과: ", list_a+list_a)
print()

#extend() 함수로 연결
output = list_a.extend([1,2,3])
print("#extend() 함수 사용")
print("#원본 리스트 : ", list_a)
print("#연산 결과 : ",output)