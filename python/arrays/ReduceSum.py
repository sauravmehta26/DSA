class sums:
    def do(lst):
        sum=0
        for i in lst:
            sum=i+sum
        return sum
    
    def secMethod(s):
        return sum(s)
    
m=list(map(int,input("enter space seperated list : ").split()))
print(sums.do(m))
print(sums.secMethod(m))