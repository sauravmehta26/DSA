class SortList:
    def srt(l):
        l.sort()
        return l
l=list("35789")
m=list(map(int,input("enter space seperated no :").split()))
print((SortList.srt(l)))
print(SortList.srt(m))
k=SortList.srt(m)
for i in k:
    print(i,end=" ")
print("\t")
print(*SortList.srt(m))
