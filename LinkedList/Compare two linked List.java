import java.io.*;
import java.util.*;
public class Main {
    static class Node
    {
        int val;
        Node next;
    }
    public static class LinkedList
    {
        Node head;
        public void insert(int x)
        {
            Node n=new Node();
            n.val=x;
            n.next=null;
            if(head==null)
            {
                head=n;
                return ;
            }
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
            return;
        }
        public void print()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        boolean areIdentical(LinkedList listb)
    {
        Node a = this.head, b = listb.head;
        while (a != null && b != null)
        {
            if (a.val != b.val)
                return false;
            a = a.next;
            b = b.next;
        }
        return (a == null && b == null);
    }
    }
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       LinkedList ll=new LinkedList();
       LinkedList ll2 =new LinkedList();
       for(int i=0;i<n;i++)
       {
           int x=sc.nextInt();
           ll.insert(x);
       }
       for(int i=0;i<m;i++)
       {
           int x=sc.nextInt();
           ll2.insert(x);
       }
    //    ll.print();
    if (ll.areIdentical(ll2) == true)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
