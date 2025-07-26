class Node24
{
    int data;
    Node24 prev;
    Node24 next;
    Node24(int d)
    {
        data=d;
        //prev=null;
        //next=null;
    }
}
class CLL5
{
    Node24 head,tail;
    public void insert(int data)
    {
        Node24 start=new Node24(data);
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
            head=start;
        }
    }
    public void display()
    {
        Node24 tptr=head;
        do
        {
            System.out.println(tptr.data);
            tptr=tptr.next;
        }
        while(tptr!=head);
    }
    public void displayrev()
    {
        Node24 tptr=tail;
        do
        {
            System.out.println(tptr.data);
            tptr=tptr.prev;
        }
        while(tptr!=tail);
    }
}
class CircularDoublyListInsertionAtBegining
{
    public static void main(String[] args)
    {
        CLL5 l1=new CLL5();
        l1.insert(30);
        l1.insert(20);
        l1.insert(10);
        System.out.println("Forward");
        l1.display();
        System.out.println("Backward");
        l1.displayrev();
    }
}