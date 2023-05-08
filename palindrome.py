n = int(input("Enter a number:"))
rev=0
t=n
while n!=0:
    rem=n%10
    rev=rev*10+rem
    n=n//10
if(t==rev):
    print("{} is a palindrome".format(t))
else:
    print("{} is not a palindrome".format(t))
