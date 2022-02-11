#사업성 분석
#자본의 현재가치
import numpy as np
discount=.05
cashflow=100

def presentvalue(n):
    return (cashflow/((1+discount)**n))
print(presentvalue(1))
print(presentvalue(2))

#20년동안 발생할 현재가치
for i in range(20):
    print(presentvalue(i))


