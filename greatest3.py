def great(a,b,c):
    if a>b and a>c:
        return a
    elif b>c:
        return b
    else:
        return c
a,b,c = map(int,input("Enter a,b,c values :").split())
x=great(a,b,c)
print("Greatest is {}".format(x))
    
