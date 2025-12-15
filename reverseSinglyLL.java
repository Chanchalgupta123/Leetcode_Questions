package LinkedList;

public class reverseSinglyLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        public static void reverse(Node head){
            if(head==null) return;
            Node temp=head;
            Node Next;
            Node prev=null;
            if(temp!=null){
                Next=temp.next;
                temp.next=prev;
                prev=temp;
                Next=temp;

            }
        }
        public static void display(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
        }

        public static void main(String[] args) {
            Node a=new Node(4);
            Node b=new Node(13);
            Node c=new Node(15);
            Node d=new Node(16);
            Node e=new Node(18);
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=null;
            reverse(e);
            display(a);
        }
    }
}
