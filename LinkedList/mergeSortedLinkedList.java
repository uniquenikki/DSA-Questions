import java.util.*;
public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       LinkedList l1 = new LinkedList();
       for (int i = 0; i< n; i++){
           l1.insert(sc.nextInt());
       }
       int m = sc.nextInt();
       LinkedList l2 = new LinkedList();
       for (int i = 0; i< m; i++){
        //   System.out.println("Hello");
           l2.insert(sc.nextInt());
       }

      LinkedList.mergeSort(l1.head, l2.head);
    }
}
class Node{
        int val;
        Node next;
    }
class LinkedList {

    Node head;
    public void insert(int x){
        Node nn = new Node();
        nn.val = x;
        if (head == null){
            head = nn;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = nn;
    }
    public void print(){
        Node temp = this.head;
        while (temp!= null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public static void mergeSort(Node a, Node b){
        Node dummy = new Node();
        Node temp = dummy;
        while (a!= null && b!= null){
            if (a.val <= b.val){
                temp.next = a;
                temp = a;
                a = a.next;
            }else {
                temp.next = b;
                temp = b;
                b= b.next;
            }


        }
        if (a==null){
            temp.next = b;
        }else if (b==null){
                temp.next = a;
        }
        Node temp1 = dummy.next;
        while (temp1 != null){
            System.out.print(temp1.val + " ");
            temp1 = temp1.next;
        }
    }
}
