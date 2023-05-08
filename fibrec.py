def fibrec(n):
    if(n==0 or n==1):
        return n
    else:
        return fibrec(n-1)+fibrec(n-2)
n =int(input("Enter n value :"))
print("Fibanocci series is :")
for i in range(0,n):
    print(fibrec(i))
