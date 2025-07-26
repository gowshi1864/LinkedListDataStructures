class Node23
{
    int data;
    Node23 next;
    Node23(int d)
    {
        data=d;
        //prev=null;
        //next=null;
    }
}
class CLL4
{
    Node23 last;
    public void insert(int data)
    {
        Node23 start=new Node23(data);
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
    public boolean search(int key)
    {
        Node23 tptr=last.next;
        do
        {
            if(tptr.data==key)
            {
                return true;
            }
            tptr=tptr.next;
        }
        while(tptr.next!=last);
        return false;
    }
    public void display()
    {
        Node23 tptr=last.next;
        do
        {
            System.out.println(tptr.data);
            tptr=tptr.next;
        }
        while(tptr!=last.next);
    }
}
class CircularSinglyListSearching
{
    public static void main(String[] args)
    {
        CLL4 l1=new CLL4();
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
        l1.display();
        System.out.println(l1.search(30));
        System.out.println(l1.search(45));
    }
}

