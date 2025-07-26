class Node4
{
    int data;
    Node next;
    Node4(int d)
    {
        data=d;
    }
}
class LList4
{
    Node head,tail;
    public void insert(int data)
    {
        Node start=new Node(data);
        if(head==null)
        {
            head=start;
            tail=start;
        }
        else
        {
            tail.next=start;
            tail=start;
        }
    }
    public void deleteEnd()
    {
        Node tptr=head;
        while(tptr.next!=tail)
        {
            tptr=tptr.next;
        }
        tptr.next=null;
        tail=tptr;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("LIST IS EMPTY");
        }
        else
        {
            Node tptr=head;
            while(tptr!=null)
            {
                System.out.println(tptr.data);
                tptr=tptr.next;
            }
        }
    }
}
class SinglyLListDeletionAtEnd
{
    public static void main(String[] args)
    {
        LList4 l=new LList4();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);
        l.display();
        System.out.println("Deletion at end");
        l.deleteEnd();
        l.display();
    }
}
