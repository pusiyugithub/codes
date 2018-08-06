import sys
while True:
        t = sys.stdin.readline().strip()
        if len(t) == 0:
            break
        a = bin(int(t))
        if(a.count('11111111') > 0):
            print('8')
        elif(a.count('1111111') > 0):
            print('7')
        elif(a.count('111111') > 0):
            print('6')
        elif(a.count('11111')>0):
            print('5')
        elif(a.count('1111')>0):
            print('4')
        elif(a.count('111')>0):
            print('3')
        elif(a.count('11')>0):
            print('2')
        elif(a.count('1')>0):
            print('1')
        else:
            print('0')