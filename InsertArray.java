import java.util.Scanner;
public class InsertArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println("\nEnter index and element to be inserted: ");
        int index=sc.nextInt();
        int ele=sc.nextInt();
        int a2[]=new int[n+1];
        if(index==n)
        {
            for(int i=0;i<n;i++)
            {
                a2[i]=a[i];
            }
            a2[n]=ele;
        }
        else
        {
        for(int i=0;i<n;i++)
        {
            if(i==index)
            {
                a2[i]=ele;
                break;
            }
            a2[i]=a[i];
        }
        for(int i=index+1;i<n+1;i++)
        {
            a2[i]=a[i-1];
        }
        }
        System.out.println("Array elements are:");
        for(int i=0;i<n+1;i++)
        {
            System.out.print(a2[i]+"\t");
        }
        sc.close();
    }
}