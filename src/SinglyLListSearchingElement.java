class Node10
{
    int data;
    Node next;
    Node10(int d)
    {
        data=d;
    }
}
class LList10
{
    Node head,tail;
    public void insertatend(int data)
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
    public boolean search(int key)
    {
        Node tptr=head;
        while(tptr!=null)
        {
            if(tptr.data==key)
            {
                return true;
            }
            tptr=tptr.next;
        }
        return false;
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
public class SinglyLListSearchingElement
{
    public static void main(String[] args)
    {
        LList10 l=new LList10();
        l.insertatend(10);
        l.insertatend(20);
        l.insertatend(30);
        l.insertatend(40);
        l.insertatend(50);
        //l.search(30);
        l.display();
        /*int key=70;
        if(l.search(key))
        {
            System.out.println("Key Found");
        }
        else
        {
            System.out.println("Key Not found");
        }*/
        System.out.println(l.search(30));
    }
}
