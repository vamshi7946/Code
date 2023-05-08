def main():
    i=1
    infile = input("Enter input file name :")
    outfile = input("Enter output file name : ")
    try:
        infile = open(infile, "r")
        outfile = open(outfile, "w+")
        for line in infile:
            outfile.write(line)
        print("Successfully copied")
    except IOError:
        print("Error occured")
    except:
        print("An error occured")
    finally:  
        infile.close()
        outfile.close()
main()
v = outfile.readline()
while v!='':
    print(v)

