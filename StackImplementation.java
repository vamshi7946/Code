public class StackImplementation
{
    int max=100;
    int top;
    int arr[] = new int[max];
    boolean isEmpty()
    {
        return (top<0);
    }
    StackImplementation()
    {
        top = -1;
    }
    void push(int x)
    {
        if(top>(max-1))
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            arr[++top]=x;
            System.out.println(x+" is pushed into stack");
        }
    }
    public void pop()
    {
        if(top<0)
        {
            System.out.println("Stack UnderFlow");
        }
        else
        {
            int x = arr[top];
            System.out.println(x+" is popped from stack");
            top--;
        }
    }
    public void ispeak()
    {
        if(top<0)
        {
            System.out.println("Stack UnderFlow");
        }
        else
        {
            System.out.println(arr[top]+" is peak element");
        }
    }
    public void print()
    {
        for(int i=top; i<-1;i--)
        {
            System.out.println(" "+arr[i]);
        }
    }
    public static void main(String[] args)
    {
        StackImplementation S = new StackImplementation();
        S.push(9);
        S.push(10);
        S.push(11);
        S.push(12);
        S.push(13);
        S.pop();
        S.ispeak();
        S.print();
    }
}