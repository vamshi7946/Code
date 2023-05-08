import java.util.*;
public class SumOdd
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter limit :");
int n = sc.nextInt();
int s=0;
for(int i=0; i<=n;i++)
{
if(i%2!=0)
{
s=s+i;
}
}
System.out.println("Sum of odd no. upto " +n+ "are :"+s);
sc.close();
}
}