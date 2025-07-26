class Node12
{
    int data;
    Node12 prev;
    Node12 next;
    Node12(int d)
    {
        data=d;
        //prev=null;
        //next=null;
    }
}
class DLL
{
    Node12 head,tail;
    public void insert(int data)
    {
        Node12 start=new Node12(data);
        if(head==null)
        {
            head=start;
            tail=start;
        }
        else
        {
            head.prev=start;
            start.next=head;
            head=start;
        }
    }
    public void display()
    {
        Node12 tptr=head;
        while(tptr!=null)
        {
            System.out.println(tptr.data);
            tptr=tptr.next;
        }
    }
    public void displayrev()
    {
        Node12 tptr=tail;
        while(tptr!=null)
        {
            System.out.println(tptr.data);
            tptr=tptr.prev;
        }
    }
}
class DoublyLinkedListInsertionBegining
{
    public static void main(String[] args)
    {
        DLL l1=new DLL();
        l1.insert(30);
        l1.insert(20);
        l1.insert(10);
        System.out.println("Forward");
        l1.display();
        System.out.println("Backward");
        l1.displayrev();
    }
}