import java.util.Scanner;
public class SelectionSort
{
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no.of elements in array:");
    int n=sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
        System.out.print("Enter "+i+1+" elements:");
        arr[i]=sc.nextInt();
    }
    System.out.print("Array elements before selection sorting are : ");
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    for(int i=0;i<n-1;i++)
    {
        int index = i;
        for(int j=i+1;j<n;j++)
        {
            if(arr[j]<arr[index])
            {
                index=j;
            }
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
        }
    }
    System.out.print("\nArray elements after selection sorting are : ");
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    sc.close();
   }
}