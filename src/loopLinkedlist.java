

public class loopLinkedlist {
    public static boolean detectLoop(Node head){
        if(head==null || head.next==null){
            return false;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
            Node head=new Node(1);
            head.next=new Node(2);
            head.next.next=new Node(3);
            head.next.next.next=head.next;
           System.out.println(detectLoop(head));

        Node head1=new Node(1);
        head1.next=new Node(2);
        head1.next.next=new Node(3);
        head1.next.next.next=new Node(4);
        System.out.println(detectLoop(head1));
    }
}
