n=int(input("Enter no. of circles:"))
dict={}
for i in range(n):
    r=float(input("Enter radius of {} circle :".format(i)))
    circum = 2*3.148*r
    dict[r]=circum
print("Dictonary of radius and circumfereence :")
print(dict)
