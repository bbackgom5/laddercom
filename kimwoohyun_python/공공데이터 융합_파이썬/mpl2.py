from matplotlib import colors
import matplotlib.pyplot as plt

x=[1,4,9,16,25,36,49,64]
y=[i for i in range(1,9)]
# plt.plot(x,color='r') 색 지정 문자
# plt.plot(x,'oc')
plt.plot(x,color='r')
plt.plot(y,color='b')
plt.plot(x,y)
plt.xlabel('x-axis')
plt.ylabel('y-axis')
plt.title('function graph')
plt.show()


