class SkipElements:
    def skip_first_element(numbers):
        result = []
        for i in range(n, len(numbers), +1):
            result.append(numbers[i])
        return result
numbers=list(map(int,input("enter element seperated by space : ").split()))
n=int(input("enter no"))
print(SkipElements.skip_first_element(numbers))
# print(SkipElements.skip_first_element(n))

