
import java.util.Scanner;
public class PalindromeOrNot {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any umber:");
        int n = sc.nextInt();
        int rem,rev=0;
        int t=n;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==t)
            System.out.println(t+" is a palindrome");
        else
            System.out.println(t+" is not a palindrome");
        sc.close();
    }
    
}
