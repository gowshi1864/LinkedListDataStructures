class Node16
{
    int data;
    Node16 prev;
    Node16 next;
    Node16(int d)
    {
        data=d;
    }
}
class DLL4
{
    Node16 head,tail;
    public void insert(int data)
    {
        Node16 start=new Node16(data);
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
    public void deleteatpos(int pos)
    {
        Node16 tptr=head;
        for(int i=0;i<pos;i++)
        {
            tptr=tptr.next;
        }
        tptr.prev.next=tptr.next;
        tptr.next=tptr.prev;
    }
    public void display()
    {
        Node16 tptr=head;
        while(tptr!=null)
        {
            System.out.println(tptr.data);
            tptr=tptr.next;
        }
    }
    public void displayrev()
    {
        Node16 tptr=tail;
        while(tptr!=null)
        {
            System.out.println(tptr.data);
            tptr=tptr.prev;
        }
    }
}
public class DoublyLinkedListDeletionAtPos
{
    public static void main(String[] args)
    {
        DLL4 l=new DLL4();
        System.out.println("Before Deletion");
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);
        l.display();
        System.out.println("After Deletion");
        l.deleteatpos(3);
        l.display();
        System.out.println("Forward");
        l.display();
        System.out.println("Backward");
        l.displayrev();
    }
}
