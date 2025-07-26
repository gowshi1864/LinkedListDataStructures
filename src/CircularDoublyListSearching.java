class Node28
{
    int data;
    Node28 prev;
    Node28 next;
    Node28(int d)
    {
        data=d;
        //prev=null;
        //next=null;
    }
}
class CLL9
{
    Node28 head,tail;
    public void insert(int data)
    {
        Node28 start=new Node28(data);
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
    public boolean search(int key)
    {
        Node28 tptr=head;
        do
        {
            if(tptr.data==key)
            {
                return true;
            }
            tptr=tptr.next;
        }
        while(tptr.next!=head);
        return false;
    }
    public void display()
    {
        Node28 tptr=head;
        do
        {
            System.out.println(tptr.data);
            tptr=tptr.next;
        }
        while(tptr!=head);
    }
    public void displayrev()
    {
        Node28 tptr=tail;
        do
        {
            System.out.println(tptr.data);
            tptr=tptr.prev;
        }
        while(tptr!=tail);
    }
}
class CircularDoublyListSearching
{
    public static void main(String[] args)
    {
        CLL9 l1=new CLL9();
        l1.insert(30);
        l1.insert(20);
        l1.insert(10);
        System.out.println("Forward");
        l1.display();
        System.out.println("Backward");
        l1.displayrev();
        System.out.println(l1.search(20));
        System.out.println(l1.search(35));
    }
}