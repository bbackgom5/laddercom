class Person:
    def __init__(self,name,birthday,id):
        self.name, self.birthday, self.id = name, birthday, id
    def __str__(self):
        return "이름: " +self.name + ", 생일 : " +self.birthday + ", 아이디 : " +self.id
    def __repr__(self):
        return "이름: " +self.name + ", 생일 : " +self.birthday + ", 아이디 : " +self.id

class Employee(Person):
    def __init__(self, name, birthday, id,salary,career_year):
        super().__init__(name, birthday, id)
        self.salary, self.career_year = salary , career_year
    def __str__(self):
        return super().__str__() + ", 연봉: " + str(self.salary) + ", 경력 연차: " +str(self.career_year)
    def __repr__(self):
        return super().__repr__() + ", 연봉: " + str(self.salary) + ", 경력 연차: "+str(self.career_year)

employee = Employee("강은희", "9월 8일", "깡그리", 2000,26)
print(str(employee))