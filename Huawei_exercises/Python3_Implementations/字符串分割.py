import sys


def func(l):
    for line in l:
        while len(line) > 8:
            out = line[0:8]
            print(out)
            line = line[8:]
        line = line[::-1].zfill(8)[::-1]
        print(line)


while True:
    a = sys.stdin.readline().strip()
    if len(a) == 0:
        break
    l = list()
    for x in range(int(a)):
        line = sys.stdin.readline().strip()
        l.append(line)
    func(l)



