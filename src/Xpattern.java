import java.util.Scanner;

public class Xpattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        for(int i=0;i<s.length();i++){
            int k=s.length()-i-1;
            for(int j=0;j<s.length();j++){
                if(j==i||j==k){
                    System.out.print(s.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
