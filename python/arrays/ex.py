class MyClass:
    def ex(arr):
        # arr[:]=arr[::-1]
        # arr=arr.reverse()
        return arr[::-1]
        
arr=[2,4,6,8]
print(MyClass.ex(arr))