class Node5
{
    int data;
    Node next;
    Node5(int d)
    {
        data=d;
    }
}
class LList5
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
    public void deletebeg()
    {
        Node tptr=head;
        head=head.next;
        //tptr.next=null;
        tptr=null;
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
class SinglyLListDeletionAtBegining
{
    public static void main(String[] args)
    {
        LList5 l=new LList5();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(50);
        l.display();
        System.out.println("Deletion at beg");
        l.deletebeg();
        l.display();
    }
}
