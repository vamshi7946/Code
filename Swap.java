import java.util.*;
public class Swap
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers:");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("a and b values before swapping are:"+a+"\t"+b);
a=a+b;
b=a-b;
a=a-b;
System.out.print("a and b values after swapping are:"+a+"\t"+b);
sc.close();
}
}