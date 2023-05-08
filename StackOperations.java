import java.util.Scanner;
class Stack
{
int size;
int top;
int arr[];
Stack(int z)
{
size=z;
top=-1;
arr=new int[size];
}
public boolean isEmpty()
{
if(top==-1)
  return true;
else
  return false;
}
public boolean isFull()
{
if(top>size-1)
  return true;
return false;
}
public void push(int x)
{
if(top>=size-1)
{
System.out.println("Stack OverFlow");
}
else
{
arr[++top]=x;
System.out.println(x+" is pushed into Stack");
}
}
public void pop()
{
if(top==-1)
{
System.out.println("Stack UnderFlow");
}
else
{
System.out.println(arr[top]+" is popped out of stack");
top--;
}
}
public void peek()
{
System.out.println(arr[top]+" is the peek element");
}
public void display()
{
if(top==-1)
{
System.out.println("stack is Empty");
}
else
{
for(int i=top;i>-1;i--)
{
System.out.println(arr[i]+"\t");
}
}
}
}
class StackOperations
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter size of stack:");
int z=sc.nextInt();
Stack s = new Stack(z);
char ch='y';
while(ch=='y' || ch=='Y')
{
System.out.println("Enter your choice:");
System.out.println("1.Push\n2.Pop\n3.EmptyorNot\n4.FullorNot\n5.Peek\n6.Display\n7.Exit");
int n=sc.nextInt();
switch(n)
{
case 1:
System.out.println("Enter element to push:");
int x=sc.nextInt();
s.push(x);
break;
case 2:
s.pop();
break;
case 3:
System.out.println(s.isEmpty());
break;
case 4:
System.out.println(s.isFull());
break;
case 5:
s.peek();
break;
case 6:
s.display();
break;
case 7:
System.exit(0);
break;
default:
System.out.println("Invalid option");
}
System.out.println("Do you want to continue[y/n]: ");
ch=sc.next().charAt(0);
}
sc.close();
}
}