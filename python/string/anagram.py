class anagram:
    def check(s,t):
        return sorted(s)==sorted(t)
s,t=input("enter string 1 : "),input("enter string 2 : ")
print(anagram.check(s,t))