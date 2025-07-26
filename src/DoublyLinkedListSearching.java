class Node18
{
    int data;
    Node18 prev;
    Node18 next;
    Node18(int d)
    {
        data=d;
    }
}
class DLL6
{
    Node18 head,tail;
    public void insertend(int data)
    {
        Node18 start=new Node18(data);
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
    public boolean search(int key)
    {
        Node18 tptr=head;
        while(tptr!=null)
        {
            if(tptr.data==key)
            {
                return true;
            }
            tptr=tptr.next;
        }
        return false;
    }
    public void display()
    {
        Node18 tptr=head;
        while(tptr!=null)
        {
            System.out.println(tptr.data);
            tptr=tptr.next;
        }
    }
    public void displayrev()
    {
        Node18 tptr=tail;
        while(tptr!=null)
        {
            System.out.println(tptr.data);
            tptr=tptr.prev;
        }
    }
}
public class DoublyLinkedListSearching
{
    public static void main(String[] args)
    {
        DLL6 l=new DLL6();
        System.out.println("Forward");
        l.insertend(10);
        l.insertend(20);
        l.insertend(30);
        l.insertend(40);
        l.insertend(50);
        l.display();
        System.out.println("Backward");
        l.displayrev();
        System.out.println(l.search(10));
    }
}
