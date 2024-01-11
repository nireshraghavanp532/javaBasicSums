
 class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=next;
    }
}
public class revLInkedLIst {

    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Node head1=new Node(1);
       head1.next=new Node(2);
       head1.next.next=new Node(3);
       head1.next.next.next=new Node(4);
       head1.next.next.next.next=new Node(5);
       print(head1);
       Node reverse=reverse(head1);
       print(reverse);


    }
}
