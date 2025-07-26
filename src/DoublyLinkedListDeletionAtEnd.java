class Node17
{
    int data;
    Node17 prev;
    Node17 next;
    Node17(int d)
    {
        data=d;
    }
}
class DLL5<T>                  //class DLL5
{
    Node17 head,tail;
    public void insert(int data)
    {
        Node17 start=new Node17(data);
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
    public void deleteend()
    {
        tail=tail.prev;
        tail.next=null;
    }
    public void display()
    {
        Node17 tptr=head;
        while(tptr!=null)
        {
            System.out.println(tptr.data);
            tptr=tptr.next;
        }
    }
    public void displayrev()
    {
        Node17 tptr=tail;
        while(tptr!=null)
        {
            System.out.println(tptr.data);
            tptr=tptr.prev;
        }
    }
}
public class DoublyLinkedListDeletionAtEnd
{
    public static void main(String[] args)
    {
        //DLL5 l=new DLL5();
        DLL5<Integer> l=new DLL5<>();
        System.out.println("Before Deletion");
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);
        l.display();
        System.out.println("After Deletion");
        l.deleteend();
        l.display();
        System.out.println("Forward");
        l.display();
        System.out.println("Backward");
        l.displayrev();
    }
}


