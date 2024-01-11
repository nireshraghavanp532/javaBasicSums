import java.util.Scanner;

public class reverseUsingRecursion {
    public static String reverse(String s){
        int k=s.indexOf(" ");
        if(k==-1){
            return s;
        }
        else{
            return reverse(s.substring(k+1))+" "+s.substring(0,k);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count =in.nextInt();
        for(int i=0;i<count;i++){

            String s= in.next();
            System.out.println(reverse(s));
        }
    }
}
