class Node20
{
    int data;
    Node20 next;
    Node20(int d)
    {
        data=d;
        //prev=null;
        //next=null;
    }
}
class CLL1
{
    Node20 last;
    public void insert(int data)
    {
        Node20 start=new Node20(data);
        if(last==null)
        {
            start.next=start;
            last=start;
        }
        else
        {
            start.next=last.next;
            last.next=start;
            last=start;
        }
    }
    public void display()
    {
        Node20 tptr=last.next;
        do
        {
            System.out.println(tptr.data);
            tptr=tptr.next;
        }
        while(tptr!=last.next);
    }
}
class CircularSinglyListInsertionAtEnd
{
    public static void main(String[] args)
    {
        CLL l1=new CLL();
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
        l1.display();
    }
}

