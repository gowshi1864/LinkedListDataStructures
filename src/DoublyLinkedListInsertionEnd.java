class Node13
{
    int data;
    Node13 prev;
    Node13 next;
    Node13(int d)
    {
        data=d;
    }
}
class DLL1
{
    Node13 head,tail;
    public void insertend(int data)
    {
        Node13 start=new Node13(data);
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
    public void display()
    {
        Node13 tptr=head;
        while(tptr!=null)
        {
            System.out.println(tptr.data);      //sop(tptr.data);   //no println
            tptr=tptr.next;
        }
    }
    public void displayrev()
    {
        Node13 tptr=tail;
        while(tptr!=null)
        {
            System.out.println(tptr.data);                   //sop(tptr.data);   //no println
            tptr=tptr.prev;
        }
    }
}
public class DoublyLinkedListInsertionEnd
{
    public static void main(String[] args)
    {
        DLL1 l = new DLL1();
        l.insertend(10);
        l.insertend(20);
        l.insertend(30);
        l.insertend(40);
        l.insertend(50);
        System.out.println("Forward");                   //l.display();
        l.display();                                     //sopln("");
        System.out.println("Backward");                  //l.displayrev();
        l.displayrev();
    }


}
