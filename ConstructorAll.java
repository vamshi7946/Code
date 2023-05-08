import java.util.Scanner;
class Box
{
private double length;
private double width;
private double height;
Box() //default constructor.
{
length=0.0;
width=0.0;
height=0.0;
}
Box(double length, double width, double height)  //parameterized constructor.
{
this.length=length;
this.width=width;
this.height=height;
}
Box(Box obj)  //Copy constructor.
{
this.length=obj.length;
this.width=obj.width;
this.height=obj.height;
}
public double volume()
{
return length*width*height;
}
}
class ConstructorAll
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Box b = new Box(); //calling default constructor.
System.out.println("Volume of box1 is: "+b.volume());
System.out.println("enter dimensions of box as length,width and height:");
double lenght=sc.nextDouble();
double width=sc.nextDouble();
double height=sc.nextDouble();
Box b1 = new Box(lenght, width, height);  // calling parameterized constructor.
System.out.println("Volume of box2 is: "+b1.volume());
Box b2;
b2=b;
System.out.println("Volume of box3 is: "+b2.volume());
Box b3 = new Box(b1);    // calling Copy constructor.
System.out.println("Volume of box4 is: "+b3.volume());
sc.close();
}
}
