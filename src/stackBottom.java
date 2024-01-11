
import java.util.Scanner;
import java.util.Stack;


public class stackBottom {
    public static Stack<Integer> insertAtBottom(int x,Stack<Integer> stk){
       // Stack<Integer>ansStk=new Stack<>();
        Stack<Integer>tempstk=new Stack<>();

        for(int i=stk.size();i>0;i--){
                tempstk.push(stk.pop());
        }
        for(int i=tempstk.size()+1;i>0;i--){
            if(stk.empty()){
                stk.push(x);
            }
           else{
               stk.push(tempstk.pop());
            }
        }
       // ansStk.addAll(stk);
        return stk;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       // System.out.println("Enter the size of the Stack");
        int n=in.nextInt();
        Stack<Integer>stk=new Stack<>();
        //System.out.println("Enter the element");
        int x=in.nextInt();
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            stk.push(a);
        }
        System.out.println(insertAtBottom(x,stk));

    }
}
