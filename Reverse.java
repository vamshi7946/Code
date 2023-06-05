import java.util.Scanner;
public class Reverse
{
public static void main(String args[])
{
int n,rev=0,rem;
Scanner sc = new Scanner(System.in);
System.out.println("Enter n value:");
n = sc.nextInt();
while(n>0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println("reverese number is: "+rev);
sc.close();
}
}
