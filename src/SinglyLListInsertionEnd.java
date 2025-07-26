class Node2
{
    int data;
    Node2 next;
    Node2(int d)
    {
        data=d;
    }
}
class LList2
{
    Node2 head,tail;
    public void insertend(int data)
    {
        Node2 start=new Node2(data);
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
    public void display()
    {
        if(head==null)
        {
            System.out.println("LIST IS EMPTY");
        }
        else
        {
            Node2 tptr=head;
            while(tptr!=null)
            {
                System.out.println(tptr.data);
                tptr=tptr.next;
            }
        }
    }
}
class SinglyLListInsertionEnd
{
    public static void main(String[] args)
    {
        LList2 l=new LList2();
        l.insertend(10);
        l.insertend(20);
        l.insertend(30);
        l.insertend(40);
        l.insertend(50);
        l.display();
    }
}
