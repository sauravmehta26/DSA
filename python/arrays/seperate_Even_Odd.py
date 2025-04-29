class Myclass:
    def seperate(arr):
        even=[]
        odd=[]
        # print(arr)
        for i in arr:
            if i%2==0:
                even.append(i)
        # for i in arr:
            else :
                odd.append(i)
        return *even,*odd
arr=list(map(int,input("ggjgvh: ").split()))
print(*Myclass.seperate(arr))
