def fib(n):
    a=0
    b=1
    while(n>0):
        print(a)
        c=a+b
        a=b
        b=c
        n=n-1
n = int(input("Enter a number:"))
print("Fibanocci series :")
fib(n)
