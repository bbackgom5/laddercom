import pymysql
conn=pymysql.connect(host='127.0.0.1',user='root',password='1234',db='hanbitDB',charset='utf8')

cur= conn.cursor()

cur.execute("CREATE TABLE IF NOT EXISTS usertbl(id char(4),userName char(15),email char(20),birthYear int)")

cur.execute("INSERT INTO usertbl VALUES('john','John Bann','john@naver.com',1990)")
cur.execute("INSERT INTO usertbl VALUES('kim','Kim Chi','kim@daum.net',1992)")
cur.execute("INSERT INTO usertbl VALUES('lee','Lee Pal','lee@paran.com',1988)")
cur.execute("INSERT INTO usertbl VALUES('park','Park Su','park@gmail.com',1980)")

conn.commit()
conn.close()


