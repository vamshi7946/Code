public class LinkedListDel
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int new_data)
        {
            data = new_data;
            next = null;
        }
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void insertAfter(int key,int new_data)
    {
        Node new_node = new Node(new_data);
        if(key==head.data)
        {
            new_node.next = head.next;
            head.next = new_node;
        }
        else
        {
            Node temp=head;
            while(temp.data!=key)
            {
                temp=temp.next;
                if(temp==null)
                {
                    return;
                }
            }
            new_node.next=temp.next;
            temp.next=new_node;
        }
    }
    public void append(int new_data)
    {
        Node new_node = new Node(new_data);
        if(head==null)
        {
            head = new Node(new_data);
        }
        else
        {
            new_node.next = null;
            Node last = head;
            while(last.next!=null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
    }
    public static Node delete(Node head, int position)
    {
        Node temp = head;
        Node prev = head;
        for(int i=0;i<position;i++)
        {
            if(i==0 && position==1)
            {
                head = head.next;
            }
            else
            {
                if(i==position-1 && temp!=null)
                {
                    prev.next = temp.next;
                }
                else
                {
                    prev=temp;
                    if(prev==null)
                    {
                        break;
                    }
                    temp = temp.next;
                }
            }
        }
        return head;
    }
    public void print()
    {
        Node list = head;
        while(list.next!=null)
        {
            System.out.println(list.data);
            list = list.next;
        }
        System.out.print(list.data);
    }
    public static void main(String[] args)
    {
        LinkedList vamshi = new LinkedList();
        vamshi.append(6);
        vamshi.push(7);
        vamshi.push(8);
        vamshi.append(11);
        vamshi.insertAfter(7,10);
        vamshi.insertAfter(11,19);
        vamshi.delete(head,7);
        vamshi.print();
    }
}