import java.util.Scanner;
public class Fibanocci {
    public static void main(String args[])
    {
        int n;
        int f1=0,f2=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements in series:");
        n=sc.nextInt();
        int i=0;
        System.out.println("Fibanocci series:");
        while(i<n)
        {
            int f3=f1+f2;
            System.out.println(f1);
            f1=f2;
            f2=f3;
            i=i+1;
        }
        sc.close();
    }
}
