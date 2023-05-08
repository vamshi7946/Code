n=int(input("Enter a number:"))
print("Prime numbers in range are:")
for i in range(2,n+1):
    c=0
    for j in range(1,i):
        if(i%j==0):
            c=c+1
    if(c==1):
        print(i)
    
