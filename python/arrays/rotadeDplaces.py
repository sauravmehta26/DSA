class Myclass:
    def rotate(arr,d):
        arr[:d]=arr[:d][::-1]
        arr[d:]=arr[d:][::-1]
        arr.reverse()
        return arr
    def simple(arr,d):
        return arr[:d]+arr[d:]
arr=[1,2,3,4,5]
d=2
print(*Myclass.rotate(arr,d))
print(Myclass.simple(arr,d))