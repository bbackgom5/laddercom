class Test:
    def __init__(self,name):
        self.name = name
        print("{}-생성 되었습니다".format(self.name))

    def __del__(self):
        print("{}-파괴 되었습니다".format(self.name))

test = Test("A")