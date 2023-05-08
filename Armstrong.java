import java.util.Scanner;
public class Armstrong
{
    public static void main(String artgs[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        int t=n;
        int x=n;
        int c=0;
        int sum=0;
        int rem;
        while(x>0)
        {
            c=c+1;
            x=x/10;
        }
        while(n>0)
        {
            rem=n%10;
            sum+=Math.pow(rem,c);
            n=n/10;
        }
        if(sum==t)
            System.out.println(t+" is an armstrong number");
        else
            System.out.println(t+" is not an armstrong number");
        sc.close();
    }
}