# boolean 다중 구문 같은 경우 왼쪽순으로 처리. and 와 or중에 and의 우선순위가 더 높다.
print(True and True or False)
print(True and False or False)
print(True or True and False)