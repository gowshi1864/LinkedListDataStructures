class Node1
{
    int data;
    Node next;
    Node1(int d)
    {
        data=d;
    }
}
class LList1
{
    Node head,tail;
    public void insertend(int data)
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
class SinglyLListInsertionAtEnd
{
    public static void main(String[] args)
    {
        LList1 l=new LList1();
        l.insertend(10);
        l.insertend(20);
        l.insertend(30);
        l.insertend(40);
        l.insertend(50);
        //l.search(30);
        l.display();
    }
}