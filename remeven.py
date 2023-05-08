start , end = map(int, input("Enter start and end values :").split())
list=[]
ans = []
for i in range(start,end+1):
    list.append(i)
print(list)
for i in list:
    if i%2==0:
        list.remove(i)
print("After removing even elements new lis is :")
print(list)
        
