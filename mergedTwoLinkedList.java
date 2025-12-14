package LinkedList;

public class mergedTwoLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node mergeLL(Node head1,Node head2){
            Node temp1=head1;
            Node temp2=head2;
            Node head=new Node(4);
            Node temp=head;
            while(temp1!=null && temp2!=null){
                if(temp1.data<temp2.data){
                    temp.next=temp1;
                    temp=temp1;
                    temp1=temp1.next;
                }
                else{
                    temp.next=temp2;
                    temp=temp2;
                    temp2=temp2.next;
                }
                if(temp1==null){
                    temp.next=temp2;
                }
                else{
                    temp.next=temp1;
                }

            }
            return head.next;
        }

        public static void main(String[] args) {
            Node a=new Node(1);
            Node b=new Node(3);
            Node c=new Node(5);
            Node d=new Node(8);
            Node e=new Node(9);
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            Node a1=new Node(2);
            Node b1=new Node(4);
            Node c1=new Node(6);
            Node d1=new Node(7);
            a1.next=b1;
            b1.next=c1;
            c1.next=d1;
            Node merge=mergeLL(a,a1);
            System.out.print(merge.data + " ");

        }
    }
}
