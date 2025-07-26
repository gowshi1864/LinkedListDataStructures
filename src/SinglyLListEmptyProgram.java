class Node7
{
    int data;
    Node next;
    Node7(int d)
    {
        data=d;
    }
}
class LList7
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
    //insert at position
    public void insertpos(int pos,int data)
    {
        Node start=new Node(data);
        Node tptr=head;
        for(int i=0;i<pos-1;i++)
        {
            start.next=tptr.next;
            tptr.next=start;
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
            Node tptr=head;
            while(tptr!=null)
            {
                System.out.println(tptr.data);
                tptr=tptr.next;
            }
        }
    }
}
class SinglyLListEmptyProgram
{
    public static void main(String[] args)
    {
        LList7 l=new LList7();
        //l.insert(10);
        //l.insert(30);
        //l.insert(40);
        //l.insert(50);
        //l.insertpos(2,20);
        l.display();
    }
}