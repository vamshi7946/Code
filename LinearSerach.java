
import java.util.Scanner;
public class LinearSerach {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("array elements5 are :");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"\t");
        }
        System.out.println("Enter element to search :");
        int key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(key==arr[i])
            {
                System.out.println(key+" is found at "+(i+1)+" position.");
                System.exit(0);
            }
        }
        System.out.println(key+" is not found.");
        sc.close();
    }
}
