def fact(n):
    f=1
    while n>0:
        f=f*n
        n=n-1
    return f
n,r = map(int,input("Enter n and r value:").split())
if n>r:
    p = fact(n)/fact(n-r)
    print("npr value for n: {} and r: {} is {}".format(n,r,p))
else:
    print("npr is not possible")
