import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }
        if(c==0)
            System.out.println(n+" is a prime");
        else
            System.out.println(n+" is not a prime");
        sc.close();
    }   
}
