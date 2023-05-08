import java.util.Scanner;
public class PrimeRange {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range as m to n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Prime no.s in range are :");
        for(int i=m;i<n;i++)
        {
            int c=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    c=c+1;
                }
            }
            if(c==0)
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
