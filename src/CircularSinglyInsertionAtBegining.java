class Node19
{
    int data;
    Node19 next;
    Node19(int d)
    {
        data=d;
        //prev=null;
        //next=null;
    }
}
class CLL
{
    Node19 last;
    public void insert(int data)
    {
        Node19 start=new Node19(data);
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
    public void display()
    {
        Node19 tptr=last.next;
        do
        {
            System.out.println(tptr.data);
            tptr=tptr.next;
        }
        while(tptr!=last.next);
    }
}
class CircularSinglyInsertionAtBegining
{
    public static void main(String[] args)
    {
        CLL l1=new CLL();
        l1.insert(30);
        l1.insert(20);
        l1.insert(10);
        l1.display();
    }
}