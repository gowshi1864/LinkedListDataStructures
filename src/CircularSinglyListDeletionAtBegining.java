class Node21
{
    int data;
    Node21 next;
    Node21(int d)
    {
        data=d;
    }
}
class CLL2
{
    Node21 last;
    public void insert(int data)
    {
        Node21 start=new Node21(data);
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
    public void deletebeg()
    {
        Node21 tptr=last.next;
        while(tptr.next!=last)
        {
            tptr.next=last.next.next;
        }
    }
    public void display()
    {
        Node21 tptr=last.next;
        do
        {
            System.out.println(tptr.data);
            tptr=tptr.next;
        }
        while(tptr!=last.next);
    }
}
class CircularSinglyListDeletionAtBegining
{
    public static void main(String[] args)
    {
        LList5 l=new LList5();
        System.out.println("Before Deletion");
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(30);
        l.insert(50);
        l.display();
        System.out.println("After Deletion");
        l.deletebeg();
        l.display();
    }
}

