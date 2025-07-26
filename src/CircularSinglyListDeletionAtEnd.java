class Node22
{
    int data;
    Node22 next;
    Node22(int d)
    {
        data=d;
    }
}
class CLL3
{
    Node22 last;
    public void insert(int data)
    {
        Node22 start=new Node22(data);
        if(last==null)
        {
            start.next=start;
            last=start;
        }
        else
        {
            start.next=last.next;
            last.next=start;
        }
    }
    public void delete()
    {
        Node22 tptr=last.next;
        while(tptr.next!=last)
        {
            tptr.next=last.next;
            last=tptr;
        }
    }
    public void display()
    {
        Node22 tptr=last.next;
        do
        {
            System.out.println(tptr.data);
            tptr=tptr.next;
        }
        while(tptr!=last.next);
    }
}
class CircularSinglyListDeletionAtEnd
{
    public static void main(String[] args)
    {
        CLL3 l=new CLL3();
        System.out.println("Before Deletion");
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);
        l.display();
        System.out.println("After Deletion");
        l.delete();
        l.display();
    }
}

