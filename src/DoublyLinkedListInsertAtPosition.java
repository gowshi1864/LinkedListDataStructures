class Node14
{
    int data;
    Node14 prev;
    Node14 next;
    Node14(int d)
    {
        data=d;
    }
}
class DLL2
{
    Node14 head,tail;
    public void insert(int data)
    {
        Node14 start=new Node14(data);
        if(head==null)
        {
            head=start;
            tail=start;
        }
        else
        {
            tail.next=start;
            start.prev=tail;
            tail=start;
        }
    }
    public void insertatpos(int pos,int data)
    {
        Node14 start=new Node14(data);
        Node14 tptr=head;
        for(int i=0;i<pos-1;i++)
        {
            tptr=tptr.next;
        }
        start.next=tptr.next;
        tptr.next=start;
        start.next.prev=start;
        start.prev=tptr;
    }
    public void display()
    {
        Node14 tptr=head;
        while(tptr!=null)
        {
            System.out.println(tptr.data);
            tptr=tptr.next;
        }
    }
    public void displayrev()
    {
        Node14 tptr=tail;
        while(tptr!=null)
        {
            System.out.println(tptr.data);
            tptr=tptr.prev;
        }
    }
}
public class DoublyLinkedListInsertAtPosition
{
    public static void main(String[] args)
    {
        DLL2 l=new DLL2();
        System.out.println("Before Insertion");
        l.insert(10);
        l.insert(20);
        l.insert(40);
        l.insert(50);
        l.display();
        System.out.println("After insertion");
        l.insertatpos(2,30);
        l.display();
        System.out.println("Forward");
        l.display();
        System.out.println("Backward");
        l.displayrev();
    }
}
