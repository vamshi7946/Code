import java.util.Scanner;
public class Duplicate
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array:");
int n= sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements into the array:");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Array elements are:");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+"\t");
}
System.out.println();
for(int i=0;i<n;i++)
{
for(int j=0;j<n-i-1;j++)
{
if(arr[j]>arr[j+1])
{
int t= arr[j];
arr[j]=arr[j+1];
arr[j+1]=t;
}
}
}
System.out.println("Array elements are:");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+"\t");
}
System.out.println();
int c=0;
for(int i=0;i<n;i++)
{
if(i==n-1)
{
if(c>0)
{
System.out.println(arr[i]+" occured "+c+" times.");
}
break;
}
else if(arr[i]==arr[i+1])
{
c=c+1;
}
if(arr[i]!=arr[i+1])
{
System.out.println(arr[i]+" is repaeted "+c+" times.");
c=0;
}
sc.close();
}
}
}