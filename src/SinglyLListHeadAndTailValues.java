class Node8
{
    int data;
    Node next;
    Node8(int d)
    {
        data=d;
    }
}
class LList8
{
    Node head,tail;
    public void insert(int data)
    {
        Node start=new Node(data);
        if(head==null)
        {
            head=start;
            tail=start;
        }
        else
        {
            tail.next=start;
            tail=start;
        }
    }
    public void toknowhead()
    {
        System.out.println(head.data);
    }
    public void toknowtail()
    {
        System.out.println(tail.data);
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("LIST IS EMPTY");
        }
        else
        {
            Node tptr=head;
            while(tptr!=null)
            {
                System.out.println(tptr.data);
                tptr=tptr.next;
            }
        }
    }
}
class SinglyLListHeadAndTailValues
{
    public static void main(String[] args)
    {
        LList8 l=new LList8();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);
        l.display();
        System.out.println("Head Value");
        l.toknowhead();
        System.out.println("Tail Value");
        l.toknowtail();
    }
}