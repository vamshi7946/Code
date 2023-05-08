m1,m2,m3=map(int,input("Enter 3 subject marks:").split())
tot=m1+m2+m3
avg=tot/3
if m1<40 or m2<40 or m3<40:
    print("Student failed")
elif avg>80:
    print("First class")
elif avg>65 and avg<=80:
    print("Second class")
elif avg >55 and avg<=65:
    print("Third class")
else:
    print("Passed")
