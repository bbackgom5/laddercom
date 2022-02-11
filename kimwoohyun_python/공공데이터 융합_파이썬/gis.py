import pymysql
from tkinter import *
from tkinter import messagebox
from tkinter.simpledialog import *
import random

def connectMySQL():
    global conn, curr, window, canvas
    conn=pymysql.connect(host='127.0.0.1',user='root',password='1234',db='kinghotdb',charset='utf8')
    curr=conn.cursor()

def closeMySQL():
    global conn,curr,window,canvas
    curr.close()
    conn.close()
    curr,conn=None,None

def randomColor():
    COLORS=["black","red","green","blue","magenta","orange","brown","maroon","coral"]
    return random.choice(COLORS)

def clearMap():
    global conn,curr,window,canvas
    canvas.destroy()
    canvas=Canvas(window,height=SCR_HEIGHT,width=SCR_WIDTH)
    canvas.pack()

def displayRestaurant():
    global conn,curr,window,canvas
    connectMySQL()

    sql="SELECT restName, ST_AsText((ST_Buffer(restLocation,3))) from restaurant"
    curr.execute(sql)

    while True:
        row=curr.fetchone()
        if not row:
            break
        restName,gisStr=row
        start=gisStr.index('(')
        start=gisStr.index('(',start+1)
        start+=1
        end=gisStr.index(')')
        gisStr=gisStr[start:end]
        gisList=gisStr.split(',')
        newGisList=[]

        for xyStr in gisList :
            x,y=xyStr.split(' ') # xy를 x와 y로 분리
            x,y=float(x),float(y)
            xyList=[(x+90)*2,SCR_HEIGHT-(y+90)*2] #[x,y] :화면 좌표(90,90) 추가 및 2배 확대
            newGisList.append(xyList)
        
        myColor=randomColor()
        canvas.create_line(newGisList,fill=myColor,width=3)
        # 해당 위치에 글자 쓰기
        tx,ty=xyList[0],xyList[1]+15 #오른쪽 아래에 쓰기
        canvas.create_text([tx,ty],fill=myColor,text=restName.split(' ')[2]) #0호점만 쓰기

    closeMySQL()

def displayManager():
    global conn,curr,window,canvas
    connectMySQL()

    sql="select ManagerName,ST_AsText(Area) from manager order by ManagerName"
    curr.execute(sql)

    while True:
        row=curr.fetchone()
        if not row:
            break
        managerName,gisStr=row
        start=gisStr.index('(')
        start=gisStr.index('(',start+1)
        start+=1
        end=gisStr.index(')')
        gisStr=gisStr[start:end]
        gisList=gisStr.split(',')
        newGisList=[]
        for xyStr in gisList:
            x,y=xyStr.split(' ')
            x,y=float(x),float(y)
            xyList=[(x+90)*2,SCR_HEIGHT-(y+90)*2]
            newGisList.append(xyList)
        canvas.create_polygon(newGisList,fill=randomColor())
    closeMySQL()

def displayRoad():
    global conn,curr,window,canvas
    connectMySQL()

    sql="select RoadName, ST_AsText(ST_buffer(RoadLine,2)) from Road"
    curr.execute(sql)

    while True:
        row=curr.fetchone()
        if not row:
            break
        managerName,gisStr=row
        start=gisStr.index('(')
        start=gisStr.index('(',start+1)
        start+=1
        end= gisStr.index(')')
        gisStr=gisStr[start:end]
        gisList=gisStr.split(',')
        newGisList=[]
        for xyStr in gisList:
            x,y=xyStr.split(' ')
            x,y=float(x),float(y)
            xyList=[(x+90)*2,SCR_HEIGHT-(y+90)*2]
            newGisList.append(xyList)
        canvas.create_polygon(newGisList,fill=randomColor())
    closeMySQL()

def showResMan():
    global conn,curr,window,canvas

    displayRestaurant() #우선 지점을 출력

    connectMySQL()
    sql="select M.ManagerName,R.restName,ST_AsText((ST_Buffer(R.restLocation,3))) from Restaurant R, Manager M"
    sql+=" where ST_Contains(M.area,R.restLocation)=1 order by R.restName" #체인점 순으로 정렬

    curr.execute(sql)

    saveRest=''
    while True:
        row=curr.fetchone()
        if not row:
            break
        managerName,restName,gisStr=row
        start=gisStr.index('(')
        start=gisStr.index('(',start+1)
        start+=1
        end=gisStr.index(')')
        gisStr=gisStr[start:end]
        gisList=gisStr.split(',')
        newGisList=[]
        for xyStr in gisList:
            x,y=xyStr.split(' ')
            x,y=float(x),float(y)
            xyList=[(x+90)*2,SCR_HEIGHT-(y+90)*2]
            newGisList.append(xyList)

        myColor=randomColor()
        if saveRest==restName: #중복 관리지역만 추가로 폴리곤으로 처리
            canvas.create_polygon(newGisList,fill=myColor)

        #해당 위치에 글자쓰기
        #관리자가 2명인 경우에는 추가 관리자 이름에 뒤에 붙여서 쓰기.

        if saveRest==restName:
            tx,ty=xyList[0],xyList[1]+45 #두번째 관리자. 아래아래에 쓰기
        else:
            tx,ty=xyList[0],xyList[1]+30 #첫번쨰 관리자. 아래에 쓰기
        
        canvas.create_text([tx,ty],fill=myColor,text=managerName)
        saveRest=restName

    closeMySQL()

def showNearest():
    global conn,curr,window,canvas

    baseRest='왕매워 짬뽕'+askstring('기준 체인점','체인점 번호를 입력하세요')+'호점'
    
    connectMySQL()
    sql="select ST_AsText(R2.restLocation),ST_Distance(R1.restLocation,R2.restLocation)"
    sql+=" from Restaurant R1, Restaurant R2"
    sql+=" where R1.restName= '" + baseRest + "' "
    sql+=" order by ST_Distance(R1.restLocation,R2.restLocation)"
    curr.execute(sql)

    row=curr.fetchone()
    gisStr,distance=row
    start=gisStr.index('(')
    start+=1
    end=gisStr.index(')')
    gisStr=gisStr[start:end]
    x,y=list(map(float,gisStr.split(' ')))
    baseXY=[(x+90)*2,SCR_HEIGHT-(y+90)*2]

    lineWidth=20
    while True:
        row=curr.fetchone()
        if not row:
            break
        gisStr,distance=row
        start=gisStr.index('(')
        start+=1
        end=gisStr.index(')')
        gisStr=gisStr[start:end]
        x,y=list(map(float,gisStr.split(' ')))
        targetXY=[(x+90)*2,SCR_HEIGHT-(y+90)*2]

        myColor=randomColor()
        if lineWidth<0:
            lineWidth=0
        canvas.create_line([baseXY,targetXY],fill=myColor,width=lineWidth)
        lineWidth -= 5

    closeMySQL()

    displayRestaurant() #지점을 출력(위쪽에 보이려 제일 나중에 출력)

conn,curr=None,None
window,canvas=None,None

SCR_WIDTH,SCR_HEIGHT=360,360

window=Tk()
window.title("왕매워 짬뽕 ver 0.1")
canvas=Canvas(window,height=SCR_HEIGHT,width=SCR_WIDTH)
canvas.pack()

mainMenu=Menu(window)
window.config(menu=mainMenu)

gis1Menu=Menu(mainMenu)
mainMenu.add_cascade(label="GIS 데이터보기",menu=gis1Menu)
gis1Menu.add_command(label="체인점 보기",command=displayRestaurant)
gis1Menu.add_command(label="관리자 보기",command=displayManager)
gis1Menu.add_command(label="도로 보기",command=displayRoad)
gis1Menu.add_separator()
gis1Menu.add_command(label="화면 지우기",command=clearMap)
gis1Menu.add_separator()

gis2Menu=Menu(mainMenu)
mainMenu.add_cascade(label="GIS 데이터 분석",menu=gis2Menu)
gis2Menu.add_command(label="관리자별 담당 체인점",command=showResMan)
gis2Menu.add_command(label="가장 가까운 체인점",command=showNearest)

window.mainloop()


