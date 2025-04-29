class MyClss:
    def done(arr,K):
        ans=[]
        for i in range(len(arr)-(K-1)):
            ans.append(max(arr[i:i+K]))
        return ans
K=int(input("enter K: \n"))
arr=list(map(int,input("enter arr space seperated: \t").split()))
print(*MyClss.done(arr,K))