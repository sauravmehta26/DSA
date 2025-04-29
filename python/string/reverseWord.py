class revwords:
    def iterate(s):
        s=s.split()
        s=s[::-1]
        for words in s:
            print(words,end=" ")
s=input("enter string")
revwords.iterate(s)