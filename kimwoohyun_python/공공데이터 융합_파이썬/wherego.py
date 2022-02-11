from urllib import request
from bs4 import BeautifulSoup

target=request.urlopen("http://api.visitkorea.or.kr/openapi/service/rest/KorService/searchStay?serviceKey=nCYGH3p8A%2BE9u2XJl0ohztZcoUTEdx%2F%2B%2FyxVVmSuMrpFYxkeGoKyuMfU%2FnYcK5Duw2U8UwsD1D78mdNSqawmHg%3D%3D&numOfRows=10&pageSize=10&pageNo=1&MobileOS=ETC&MobileApp=AppTest&arrange=A&listYN=Y&goodStay=1")

soup=BeautifulSoup(target,"html.parser")

for item in soup.select("item"):
    try:
        print("숙박업소명:",item.select_one("title").text)
        print("주소:",item.select_one("addr1").text)
        print("조회수:",item.select_one("readcount").text)
        print("전화번호:",item.select_one("tel").text)
    
    except:
        print("전화번호 : 없음")
        pass
    
    finally:
        print()