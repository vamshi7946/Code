n = int(input("Enter a number :"))
s=0
c=0
for i in range(1,n):
    if n%i==0:
        s=s+i
if s==n:
    print("{} is a perfect no.".format(n))
else:
    print("{} is not a perfect no.".format(n))
