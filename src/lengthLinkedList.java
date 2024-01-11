import java.util.Scanner;

public class lengthLinkedList {
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of linked list");
        int n=in.nextInt();
        Node result=new Node(-1);
        Node temp=result;
        for(int i=0;i< n;i++){
            result.next=new Node(in.nextInt());
            result=result.next;
        }
        System.out.println(length(temp.next));
    }
}