class Node29
{
    int data;
    Node29 next;
    Node29(int d)
    {
        data=d;
    }
}
class LList11
{
    Node29 head,tail;
    public void insert(int data)
    {
        Node29 start=new Node29(data);
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
    public void insertPos(int pos,int data)
    {
        Node29 start=new Node29(data);
        Node29 tptr=head;
        for(int i=0;i<pos-1;i++)
        {
            tptr=tptr.next;
        }
        start.next=tptr.next;
        tptr.next=start;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("LIST IS EMPTY");
        }
        else
        {
            Node29 tptr=head;
            while(tptr!=null)
            {
                System.out.print(tptr.data+" ");
                tptr=tptr.next;
            }
        }
    }
}
class SinglyLListInsertPosition
{
    public static void main(String[] args)
    {
        LList11 l=new LList11();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(50);
        l.display();
        System.out.println();
        l.insertPos(3,40);
        l.display();
    }
}
