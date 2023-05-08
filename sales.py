sales = float(input("Enter sales achieved :"))
if sales<10000:
    c=500
elif sales>=10000 and sales<15000:
    c=0.15*sales
elif sales>=15000 and sales<25000:
    c=0.2*sales
else:
    c=0.3*sales
print("Commission is {} for sales of {}".format(c,sales))
        
