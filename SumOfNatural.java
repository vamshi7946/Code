import java.util.Scanner;
public class SumOfNatural
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter upto which sum is required:");
int n=sc.nextInt();
int s=0;
for(int i=1;i<=n;i++)
{
s=s+i;
}
System.out.println("Sum of "+n+" no. is : "+s);
sc.close();
}
}