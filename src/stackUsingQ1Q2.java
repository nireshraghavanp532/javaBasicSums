import java.util.*;

public class stackUsingQ1Q2 {
     static Queue<Integer>q1=new LinkedList<>();
      static Queue<Integer>q2=new LinkedList<>();
      static int ans=0;
    public static void push(int e){
        q2.add(e);
        while (!q1.isEmpty()){

                q2.add(q1.remove());


        }
       while (!q2.isEmpty()){
            q1.add( q2.remove());

        }
    }
    public static  int pop(){

        if(q1.size()==0){
            ans =-1;
        }
        ans =q1.remove();
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int a;
        List<Integer>list=new ArrayList<>();
        while(true){
            System.out.println("Enter 1 for push or 2 for pop or 3 for exit");
            int choice =in.nextInt();

            switch (choice){
                case 1:
                   a=in.nextInt();
                   push(a);
                   break;
                case 2:
                    list.add(pop());
                    break;
                case 3:
                    System.out.print(list);
                    System.exit(1);
                default:
                    System.out.println("invald choice");
            }
        }
    }
}
