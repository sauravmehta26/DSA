class substring:
    def check(s1,s2):
        return s2 in s1
s1,s2=input("first string"),input("enter substring")
print(substring.check(s1,s2))