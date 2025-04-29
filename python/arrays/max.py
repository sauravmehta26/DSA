class Max_Val:
    def find(n):
        m=-1
        for i in n:
            if i>m:
                m=i
        return m
n=list(map(int,input("enter the numbers separated by space").split()))
print(Max_Val.find(n))