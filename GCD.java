import java.util.Scanner;
public class GCD
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers:");
int a = sc.nextInt();
int b = sc.nextInt();
while(a!=b)
{
if(a>b)
{
a=a-b;
}
else
{
b=b-a;
}
}
System.out.println("GCD of given no. is :"+a);
sc.close();
}
}