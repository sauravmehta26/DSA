class Rotation:
    def check(s1,s2):
        if len(s1)!=len(s2):
            return False
        if s2  in (s1+s1):
            return True
s1=input("enter s1 : ") #abcd
s2=input("enter s2 to be checked in s1 : ")#cdab
print(Rotation.check(s1,s2))#true