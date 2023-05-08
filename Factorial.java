import java.util.Scanner;
public class Factorial
{
    public static void main(String args[])
    {
        int n,i,f=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        n=sc.nextInt();
        i=1;
        while(i<=n)
        {
            f=f*i;
            i=i+1;
        }
        sc.close();
        System.out.println("Factorial of "+n+" is: "+f );
    }
}
