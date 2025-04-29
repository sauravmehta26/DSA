class reverse:
    def rev(s):
        s=s[::-1]
        for i in s:
            print(i,end='')
s=input("enter the string:\n")
reverse.rev(s)