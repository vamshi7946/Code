import java.util.Scanner;
public class InsertionSort
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of elements of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elsemets:");
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" element:");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=1;i<n;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key<arr[j])
            {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1]=key;
        }
        System.out.print("\nArray elements after insertion sorting are : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}