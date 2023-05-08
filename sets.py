odd = set()
prime = set()
n = int(input("enter range :"))
for i in range(n):
    if i%2!=0:
        odd.add(i)
for i in range(2,n):
    c=0
    for j in range(1,i):
        if i%j==0:
            c=c+1
    if c==1:
        prime.add(i)
print(odd)
print(prime)
print("Union:", odd.union(prime))
print("Intersection : ",odd.intersection(prime))
print("Difference :", odd.difference(prime))
print("Symmetric Difference :", odd.symmetric_difference(prime))


