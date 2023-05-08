import java.util.Scanner;
public class DeleteArray
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array:");
int n = sc.nextInt();
System.out.println("Enter array elements:");
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Array elements are");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+"\t");
}
System.out.println();
System.out.println("Enter the element to delete:");
int element=sc.nextInt();
int flag=-1;
for(int i=0;i<n;i++)
{
if(arr[i]==element)
{
flag=i;
break;
}
}
if(flag==-1)
{
System.out.println("Element not found");
}
else
{
for(int i=flag;i<n-1;i++)
{
arr[i]=arr[i+1];
}
}
System.out.println("Array elements after deletion are");
for(int i=0;i<n-1;i++)
{
System.out.print(arr[i]+"\t");
}
sc.close();
}
}