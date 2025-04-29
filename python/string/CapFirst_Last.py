class Myclass:
    def cap(s):
        result=""
        words=s.split()
        for word in words:
            newword=word[0].upper()+word[1:-1]+word[-1].upper()+" "
            #newword=words[len(word)].upper()
            result+=newword

        return result[:-1]
s=input("enter string")
print(Myclass.cap(s))