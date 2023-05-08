def gcd(a,b):
    while(a!=b):
        if(a>b):
            a=a-b
        else:
            b=b-a
    return a
a,b = map(int, input("Enter a,b values :").split())
print("GCD of {} and {} is {}".format(a,b,gcd(a,b)))
