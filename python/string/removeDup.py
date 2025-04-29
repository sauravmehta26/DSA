class remove:
    def doo(s):
        seen=set()
        ans=[]
        for c in s:
            if c not in seen:
                seen.add(c)
                ans.append(c)
        return ''.join(ans)
print(remove.doo("appppple hhhhhh jnkj"))
