class GroupByEvenOdd:
    def group(numbers):
        even = []
        odd = []
        for i in numbers:
            if i % 2 == 0:
                even.append(i)
            else:
                odd.append(i)
        return even, odd

numbers = [1, 2, 3, 4, 5, 6, 7, 8]
even, odd = GroupByEvenOdd.group(numbers)
print(*even, *odd)

class GroupByEvenOdd:
    def group(numbers):
        even = []
        odd = []
        for i in numbers:
            if i % 2 == 0:
                even.append(i)
            else:
                odd.append(i)
        return even, odd

numbers = [1, 2, 3, 4, 5, 6, 7, 8]
even, odd = GroupByEvenOdd.group(numbers)
print(*even, *odd)
