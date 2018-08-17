import sys


class FindSymbols(object):
    def __init__(self):
        self.englishCharCount = 0
        self.blankCharCount = 0
        self.numberCharCount = 0
        self.otherCharCount = 0

    def getEnglishCharCount(self):
        return self.englishCharCount

    def getBlankCharCount(self):
        return self.blankCharCount

    def getNumberCharCount(self):
        return self.numberCharCount

    def getOtherCharCount(self):
        return self.otherCharCount

    def count(self, line):
        l = list(line)
        for x in l:
            if x.isalpha():
                self.englishCharCount = self.englishCharCount + 1
            elif x.isdigit():
                self.numberCharCount = self.numberCharCount + 1
            elif x.isspace():
                self.blankCharCount = self.blankCharCount+1
            else:
                self.otherCharCount = self.otherCharCount + 1



while True:
    line = sys.stdin.readline().strip()

    if len(line) == 0:
        break
    x = FindSymbols()
    x.count(line)
    print(x.getEnglishCharCount())
    print(x.getBlankCharCount())
    print(x.getNumberCharCount())
    print(x.getOtherCharCount())

