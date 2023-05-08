import java.util.*;
public class Greatest
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no.s to compare:");
int a = sc.nextInt();
int b = sc.nextInt();
if(a>b)
{
System.out.print(a+" is the greatest no.");
}
else
{
System.out.println(b+" is greatest no.");
}
sc.close();
}
}