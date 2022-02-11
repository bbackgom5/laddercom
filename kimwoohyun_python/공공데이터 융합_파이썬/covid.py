import requests

url="http://apis.data.go.kr/B551182/pubReliefHospService/getpubReliefHospList"
params={'serviceKey':'nCYGH3p8A%2BE9u2XJl0ohztZcoUTEdx%2F%2B%2FyxVVmSuMrpFYxkeGoKyuMfU%2FnYcK5Duw2U8UwsD1D78mdNSqawmHg%3D%3D','pageNO' : '1','numOfRows'
:'1'}

response=requests.get(url,params=params)
print(response.content)

