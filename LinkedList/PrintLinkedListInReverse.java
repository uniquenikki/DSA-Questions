
import java.util.*;
import java.io.*;

public class Main {
    static class Node
    {
        int val;
        Node next;
    }
    public static class LinkedList
    {
        Node head;
        int size;
        void insert(int x)
        {
            Node n=new Node();
            n.val=x;
            n.next=null;
            if(head==null)
            {
                head=n;
             return;
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
        while (temp != null)
         {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    }
   
    public static Node reverseList(Node head)
    {
if(head == null || head.next == null)
            return head;
        
        Node prev = null, curr = head, forward = head.next;
        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = forward;
            if(forward != null)
                forward = curr.next;
        }
        head=prev;
        return prev;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList ll =new LinkedList();
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            ll.insert(x);
        }
        Node head=reverseList(ll.head);
        // ll.print();
        Node temp=head;
        while (temp != null)
         {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
