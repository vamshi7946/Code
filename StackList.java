public class StackList
{
    StackNode root;
    class StackNode
    {
        int data;
        StackNode next;
        StackNode(int data)
        {
            this.data=data;
        }
    }
    public boolean isEmpty()
    {
        if(root==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void push(int data)
    {
        StackNode new_node = new StackNode(data);
        if(root==null)
        {
            root = new_node;
            System.out.println(root.data+" is pushed into stack");
        }
        else
        {
            StackNode temp = root;
            root = new_node;
            new_node.next = temp;
            System.out.println(root.data+" is pushed into stack");
        }
    }
    public void pop()
    {
        if(root==null)
        {
            System.out.println("Stack UnderFlow");
        }
        else
        {
            int x = root.data;
            System.out.println(x+" is popped");
            root = root.next;
        }
    }
    public void peak()
    {
        if(root==null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println(root.data+" is peak element");
        }
    }
    void print()
    {
        while(root!=null)
        {
            System.out.print(root.data+" ");
            root=root.next;
        }
    }
    public static void main(String[] args)
    {
        StackList sl = new StackList();
        sl.push(10);
        sl.push(15);
        sl.push(20);
        sl.push(25);
        sl.pop();
        sl.peak();
        System.out.print("Stack elements are : ");
        sl.print();
    }
}
