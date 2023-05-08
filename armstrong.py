n = int(input('Enter a number :'))
t=n
t2=n
c=0
s=0
while n!=0:
    c=c+1
    n=n//10
while t!=0:
    rem=t%10
    s=s+rem**c
    t=t//10
if s==t2:
    print("{} is armstrong".format(t2))
else:
    print("{} is not armstrong".format(t2))
