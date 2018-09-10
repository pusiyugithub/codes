import sys
import math
while True:
    s = sys.stdin.readline().strip()
    if len(s) == 0:
        break
    t = math.modf(float(s))
    if t[0] >= 0.5:
        print (math.ceil(float(s)))
    else:
        print (math.floor(float(s)))