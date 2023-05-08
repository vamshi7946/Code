def fact(n):
    f=1
    while n>0:
        f=f*n
        n=n-1
    return f
n,r = map(int,input("Enter n and r value:").split())
if n>r:
    c = fact(n)/(fact(n-r)*fact(r))
    print("ncr value for n: {} and r: {} is {}".format(n,r,c))
else:
    print("ncr is not possible")
