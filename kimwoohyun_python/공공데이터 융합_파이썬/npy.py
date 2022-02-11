import numpy as np
'''a=np.array([[2,3],[5,2]]) #배열 정의
print(a)

d=np.array([[1,2,3,4,5],[2,4,5,6,7],[5,7,8,9,9]])
print(d)

print(d[1][2])
print(d[1,2])
print(d[1:,3:])

d=np.array([2,3,4,5,6])
print(d)
print(d.shape) #배열 크기 알아내기

e=np.array([[1,2,3,4],[3,4,5,6]])
print(e)
print(e.shape)

print(d.dtype) #배열의 원소 유형 확인하기

data=np.arange(1,5)
print(data.dtype)
print(data.astype('float64'))  #배열의 유형바꾸기
print(data.astype('int32'))

print(np.zeros((2,10))) #0으로 이루어진 배열
print(np.ones((2,10)))  #1로 이루어진 배열

print(np.arange(2,10))  #연속형 정수 생성

a=np.ones((2,3))
print(a)
b=np.transpose(a)       #행열 바꾸기
print(b)'''

arr1=np.array([[2,3,4],[6,7,8]])
arr2=np.array([[12,23,14],[36,47,58]])

print(arr1+arr2)
print(arr1*arr2)
print(arr1/arr2)

arr3=np.array([100,200,300])

print(arr1.shape)
print(arr3.shape)
print(arr1+arr3)

arr4=np.array([1,2,3,4,5,6,7,8,9,10])

print(arr4.shape)
print(arr1.shape)
print(arr1+arr4)

arr5=np.array([[9],[3]])

print(arr5.shape)
print(arr1)
print(arr5+arr1)

d=np.array([[1,2,3,4,5],[2,4,5,6,7],[5,7,8,9,9]])
d_list=[[1,2,3,4,5],[2,4,5,6,7],[5,7,8,9,9]]
print(d_list[:2])=0
print(d[:2])=0
print(d)