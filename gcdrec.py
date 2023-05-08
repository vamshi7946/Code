def gcd(a,b):
    if(a%b==0):
        return b
    else:
        return gcd(b,a%b)
a,b = map(int, input("Enter a,b values :").split())
if a>b:
    c=gcd(a,b)
else:
    c=gcd(b,a)
print("GCD of {} and {} is {}".format(a,b,c))
