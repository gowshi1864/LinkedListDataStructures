class Node9
{
    int data;
    Node next;
    Node9(int d)
    {
        data=d;
    }
}
class LList9<T>   //class LList9
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
    public void reverse()
    {
        Node prev=null;
        Node current=head;
        Node next=head.next;
        while(current!=null)
        {
            next=current.next; //Used for storing the info of nxt node NOT TO REVERSES A NODE
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("List Is Empty");
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
class SinglyLListReversal
{
    public static void main(String[] args)
    {
        //LList9 l = new LList9();
        LList9<Integer> l=new LList9<>();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);
        System.out.println("Before Reversal");
        l.display();
        l.reverse();
        System.out.println("After Reversal");
        l.display();
    }

}
