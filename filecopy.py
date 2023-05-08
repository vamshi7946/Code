infile,outfile=input("Enter infile and outfile names :").split()
try:
    infile = open(infile,"r")
    outfile= open(outfile, "w")
    for line in infile:
        outfile.write(line)
    print("successfully copied")
except:
    print("an error occured")
finally:
    infile.close()
    outfile.close()

