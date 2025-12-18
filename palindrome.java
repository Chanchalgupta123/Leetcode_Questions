package LinkedList;

public class palindrome {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        public static Node reverse(Node head){
            Node temp=head;
            Node prev=null;
            Node Next=null;
            while(temp!=null){
                Next=temp.next;
                temp.next=prev;
                prev=temp;
                temp=Next;
            }
            return prev;
        }
        public static boolean isPalindrome(Node head){
            Node slow=head;
            Node fast=head;
            while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            Node temp=reverse(slow.next);
            slow.next=temp;
            Node p1=head;
            Node p2=slow.next;
            while(p2!=null){
                if(p1.data !=p2.data){
                    return false;
                }
                p1=p1.next;
                p2=p2.next;
            }
            return true;
        }

        public static void main(String[] args) {
            Node a= new Node(1);
            Node b=new Node(2);
            Node c=new Node(2);
            Node d=new Node(1);
            boolean result=isPalindrome(a);
            if(result){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}
