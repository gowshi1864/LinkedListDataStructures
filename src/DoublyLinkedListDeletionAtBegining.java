class Node15
{
    int data;
    Node15 prev;
    Node15 next;
    Node15(int d)
    {
        data=d;
    }
}
class DLL3
{
    Node15 head,tail;
    public void insert(int data)
    {
        Node15 start=new Node15(data);
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
    public void deletebeg()
    {
        Node15 tptr=head;
        head=head.next;
        head.prev=null;
        tptr=null;
    }
    public void display()
    {
        Node15 tptr=head;
        while(tptr!=null)
        {
            System.out.println(tptr.data);
            tptr=tptr.next;
        }
    }
    public void displayrev()
    {
        Node15 tptr=tail;
        while(tptr!=null)
        {
            System.out.println(tptr.data);
            tptr=tptr.prev;
        }
    }
}
public class DoublyLinkedListDeletionAtBegining
{
    public static void main(String[] args)
    {
        DLL3 l=new DLL3();
        System.out.println("Before Deletion");
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);
        l.display();
        System.out.println("After Deletion");
        l.deletebeg();
        l.display();
        System.out.println("Forward");
        l.display();
        System.out.println("Backward");
        l.displayrev();
    }
}
