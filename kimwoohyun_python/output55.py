#시간
import time

#5초동안 반복
output = 0
target_tick = time.time() + 5
while time.time() < target_tick:
    output += 1

print("5초 동안 반복한 횟수 : " , output)