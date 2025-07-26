class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
    }
}
class LList
{
    Node head,tail;
    //insert at begining
    public void insertbeg(int data)
    {
        Node start=new Node(data);
        start.next=head;
        head=start;
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
class SinglyLListInsertionAtBegining
{
    public static void main(String[] args)
    {
        LList l=new LList();
        l.insertbeg(10);
        l.insertbeg(20);
        l.insertbeg(30);
        l.insertbeg(40);
        l.insertbeg(50);
        l.display();
    }
}

