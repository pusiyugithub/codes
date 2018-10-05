import sys
while True:
    s = sys.stdin.readline().strip()
    if len(s) == 0:
        break
    d = {}
    for x in s:
        if d.get(x) is None:
            d.setdefault(x, 1)
        else:
            d.update({x:d.get(x)+1})
    minValue = sorted(d.items(), key=lambda item: item[1])[0][1]
    l = []
    for k, v in d.items():
        if v == minValue:
            l.append(k)
    for x in l:
        s = s.replace(x, '')
    print(s)