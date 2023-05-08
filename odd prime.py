odd = set()
prime = set()
n = int(input())
for i in range(n):
  if i%2!=0:
    odd.add(i)
for i in range(2,n):
  c=0
  for j in range(1,n):
    if i%j==0:
      c+=1
  if c==2:
    prime.add(i)
print(odd)
print(prime)
    
