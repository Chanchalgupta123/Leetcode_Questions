package LinkedList;

public class cycle {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        public static boolean isCycle(Node head){
            Node slow=head;
            Node fast=head;
            if(head==null) return false;
            if(head.next==null) return false;
            while(fast!=null ){
                slow=slow.next;
                fast=fast.next.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            Node a=new Node(87);
            Node b=new Node(100);
            Node c=new Node(13);
            Node d=new Node(4);
            Node e=new Node(5);
            Node f=new Node(12);
            Node g=new Node(10);
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=f;
            f.next=g;
            g.next=d;
            boolean result=   isCycle(a);
            if(result) System.out.println("true");
            else System.out.println("false");

        }
    }
}
