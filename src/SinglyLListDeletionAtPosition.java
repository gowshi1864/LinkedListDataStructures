class Node6
{
    int data;
    Node next;
    Node6(int d)
    {
        data=d;
    }
}
class LList6
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
    public void deleteAtpos(int pos)
    {
        Node tptr=head;
        for(int i=0;i<pos-1;i++)
        {
            tptr=tptr.next;
        }
        tptr.next=tptr.next.next;
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
class SinglyLListDeletionAtPosition
{
    public static void main(String[] args)
    {
        LList6 l=new LList6();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);
        l.display();
        System.out.println("Deletion at pos");
        l.deleteAtpos(2);
        l.display();
    }
}