import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mergeLinkedList {

    public static void main(String[] args) {
        Node head1=new Node(1);
        head1.next=new Node(2);
        head1.next.next=new Node(3);
        head1.next.next.next=new Node(4);
        head1.next.next.next.next=new Node(5);

        Node head2=new Node(7);
        head2.next=new Node(10);
        head2.next.next=new Node(11);
        head2.next.next.next=new Node(8);
        head2.next.next.next.next=new Node(13);

        List<Integer>list=new ArrayList<>();
        while(head1!=null){
            list.add(head1.data);
            head1=head1.next;
        }
        while(head2!=null){
            list.add(head2.data);
            head2=head2.next;
        }
        Collections.sort(list);
        Node result=new Node(-1);
        Node temp=result;
        for(int i=0;i< list.size();i++){
            result.next=new Node(list.get(i));
            result=result.next;
        }
        temp=temp.next;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
