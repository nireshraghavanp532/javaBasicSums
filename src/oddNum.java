import java.util.Scanner;

public class oddNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the starting range value");
        int a= in.nextInt();
        System.out.println("Enter the end range value");
        int b=in.nextInt();
        for(int i=a;i<b;i++){
            if(i%2!=0){
                System.out.print(i+",");
            }
        }
    }
}
