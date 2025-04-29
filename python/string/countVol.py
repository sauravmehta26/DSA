class count:
    def vol(s):
        v="aeiouAEIOU"
        vc=0
        cc=0
        for i in s:
            if i in v:
                vc=vc+1
                print(i,end=" ",)
            else: cc+=1      
        return vc, cc
s=input("enter string : ")
print('\n',*count.vol(s))