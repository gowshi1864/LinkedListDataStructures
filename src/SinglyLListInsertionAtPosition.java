class Node3
{
    int data;
    Node next;
    Node3(int d)
    {
        data=d;
    }
}
class LList3
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
    //insert at position
    public void insertpos(int pos,int data)
    {
        Node start=new Node(data);
        Node tptr=head;
        for(int i=0;i<pos-1;i++)
        {
            tptr=tptr.next;
        }
        start.next=tptr.next;
        tptr.next=start;
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
class SinglyLListInsertionAtPosition
{
    public static void main(String[] args)
    {
        LList3 l=new LList3();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(50);
        l.insertpos(3,40);
        l.display();
    }
}