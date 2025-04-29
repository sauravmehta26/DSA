class grater:
    def find(n):
        c=0
        for i in n:
            if i>5:
                c+=1
        return c
n = list(map(int, input("Enter numbers separated by spaces: ").split()))
print(grater.find(n))

'''
n=[1 2 3 4 5]
m=4
'''