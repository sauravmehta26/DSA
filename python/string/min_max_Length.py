class Myclass:
    def find(s):
        maxx=-1
        minn=99999
        mans=""
        nans=""
        words=s.split()
        for word in words:
            if len(word)>maxx:
                maxx=len(word)
                mans=word
            if len(word)<minn:
                minn=len(word)
                nans=word
        return nans,mans
a = "GeeksforGeeks A Computer Science portal for Geeks"
minWord,maxWord=Myclass.find(a)
print("Minimum length word: ", minWord)
print ("Maximum length word: ", maxWord)