start , end = map(int, input("Enter start and end values :").split())
list = []
for i in range(start,end+1,2):
    list.append(i)
print("list in a particular order of elements:")
print(list)
print("Elements of list in reverse order:")
for i in range(len(list)-1,-1,-1):
    print(list[i], end = ' ')
