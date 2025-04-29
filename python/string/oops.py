class calculator:
    def sum(a,b):
        return a+b
    pass
    def sum(a,b,c):
        print(a+b+c)
    
    
    # def sum(a,b,d):
    #     print(d)
    #     return a+b
a=int(input("enter a"))
b=int(input("enter b"))
c=int(input("enter c"))
# d="i am diffrent"

print(calculator.sum(a,b))
print(calculator.sum(a,b,c))
# print(calculator.sum(a,b,d))