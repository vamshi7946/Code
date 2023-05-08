import java.util.Scanner;
public class MinMax3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,max,min;
        System.out.print("Enter a,b,c values:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        max=a;
        min=a;
        if(b>max)
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        if(b<min)
        {
            min=b;
        }
        if(c<min)
        {
            min=c;
        }
        System.out.println(max+" is the maximum");
        System.out.println(min+" is the minimum");
        sc.close();
    }
}