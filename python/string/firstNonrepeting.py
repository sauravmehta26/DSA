from collections import Counter
class nonR:
    def find(s):
        counter=Counter(s)
        for char in s:
            if counter[char]==1:
                       return char
        return None
    
s=input("enter string:")
print(nonR.find(s))