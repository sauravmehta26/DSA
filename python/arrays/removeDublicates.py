class RemoveDublicates:
    def remove(n):
        b=set(n)
        return b
n=list(map(int,input("enter the element seperated by spaces:").split()))
print(RemoveDublicates.remove(n))

class DistinctElements:
    def get_distinct(numbers):
        distinct = []
        for num in numbers:
            if num not in distinct:
                distinct.append(num)
        return distinct

print(DistinctElements.get_distinct(n))

