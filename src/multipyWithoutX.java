import java.util.Scanner;

public class multipyWithoutX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        if(b>a){
            int c=b;
            b=a;
            a=c;
        }

            int ans=0;
            for(int i=0;i<b;i++){
                ans=ans+a;
            }
            System.out.println(ans);

    }
}
