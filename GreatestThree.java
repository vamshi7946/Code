import java.util.*;
public class GreatestThree
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no.s to compare:");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if(a>b && a>c)
{
System.out.print(a+" is the greatest no.");
}
else if(b>c)
{
System.out.println(b+" is greatest no.");
}
else
{
System.out.println(c+ " is greatest no.");
}
sc.close();
}
}