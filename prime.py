n=int(input("Enter a number:"))
c=0
for i in range(1,n):
    if n%i==0:
        c=c+1
if c==1:
    print("{} is a prime".format(n))
else:
    print("{} is not a prime".format(n))
        
