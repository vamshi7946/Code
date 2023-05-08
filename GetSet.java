import java.util.Scanner;
class Student
{
private int no;
private String name,address;
public void setData(int no, String name, String address)
{
this.no=no;
this.name=name;
this.address=address;
}
public int getNo()
{
return no;
}
public String getName()
{
return name;
}
public String getAddress()
{
return address;
}
public void display()
{
System.out.println("Student details are :");
System.out.println("Student roll no. is :"+getNo());
System.out.println("Student name is :"+getName());
System.out.println("Student address is :"+getAddress());
}
}
public class GetSet
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Student s = new Student();
System.out.println("Enter student no,name and address:");
int no=sc.nextInt();
String name=sc.next();
String address=sc.next();
s.setData(no,name,address);
s.display();
sc.close();
}
}