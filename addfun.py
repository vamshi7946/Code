def add(a,b):
    c=a+b
    return c
a,b = map(int,input("Enter a,b values :").split())
print("Sum of {} and {} is {}".format(a,b,add(a,b)))
