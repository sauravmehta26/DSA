class Evennumbers:
    def even(n):
        for i in n:
            if i%2==0:
                print(i, end=' ')
                
n = list(map(int, input("Enter numbers separated by spaces: ").split()))
Evennumbers.even(n)
