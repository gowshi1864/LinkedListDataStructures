class Node25
{
    int data;
    Node25 prev;
    Node25 next;
    Node25(int d)
    {
        data=d;
        //prev=null;
        //next=null;
    }
}
class CLL6
{
    Node25 head,tail;
    public void insert(int data)
    {
        Node25 start=new Node25(data);
        if(head==null)
        {
            head=start;
            tail=start;
            start.prev=start;
            start.next=start;
        }
        else
        {
            start.next=head;
            start.prev=tail;
            head.prev=start;
            tail.next=start;
            tail=start;
        }
    }
    public void display()
    {
        Node25 tptr=head;
        do
        {
            System.out.println(tptr.data);
            tptr=tptr.next;
        }
        while(tptr!=head);
    }
    public void displayrev()
    {
        Node25 tptr=tail;
        do
        {
            System.out.println(tptr.data);
            tptr=tptr.prev;
        }
        while(tptr!=tail);
    }
}
class CircularDoublyListInsertionAtEnd
{
    public static void main(String[] args)
    {
        CLL6 l1=new CLL6();
        l1.insert(30);
        l1.insert(20);
        l1.insert(10);
        System.out.println("Forward");
        l1.display();
        System.out.println("Backward");
        l1.displayrev();
    }
}