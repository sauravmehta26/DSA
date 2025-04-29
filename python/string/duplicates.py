class duplicates:
    def find(s):
        dist={}
        dup=[]
        for char in s:
            dist[char]=dist.get(char,0)+1
        for char, count in dist.items():
            if count>1:
                dup.append(char)
        return dup
s=input("enter element: ")
print(*duplicates.find(s))