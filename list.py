list = []
n=int(input("Enter no. of elements to enter in a list:"))
s=0
for i in range(n):
    print("Enter element at {} index :".format(i),end=" ")
    ip = int(input(" "))
    list.append(ip)
    s=s+ip
avg=s/n
print(list)
print("Sum of elements of list is : {}".format(s))
print("Avarage of elements of list : {}".format(avg))
