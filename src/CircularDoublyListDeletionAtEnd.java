class Node27
{
    int data;
    Node27 prev;
    Node27 next;
    Node27(int d)
    {
        data=d;
        //prev=null;
        //next=null;
    }
}
class CLL8
{
    Node27 head,tail;
    public void insert(int data)
    {
        Node27 start=new Node27(data);
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
    public void delete()
    {
        tail=tail.prev;
        tail.next=head;
        head.prev=tail;
    }
    public void display()
    {
        Node27 tptr=head;
        do
        {
            System.out.println(tptr.data);
            tptr=tptr.next;
        }
        while(tptr!=head);
    }
    public void displayrev()
    {
        Node27 tptr=tail;
        do
        {
            System.out.println(tptr.data);
            tptr=tptr.prev;
        }
        while(tptr!=tail);
    }
}
class CircularDoublyListDeletionAtEnd
{
    public static void main(String[] args)
    {
        CLL8 l1=new CLL8();
        l1.insert(50);
        l1.insert(40);
        l1.insert(30);
        l1.insert(20);
        l1.insert(10);
        System.out.println("Forward");
        l1.display();
        System.out.println("Backward");
        l1.displayrev();
        System.out.println("Deletion");
        l1.delete();
        l1.display();
    }
}
