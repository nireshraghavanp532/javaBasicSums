import java.util.Scanner;

public class a1b10String {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s= in.nextLine();
        char [] A=s.toCharArray();
        char c='0';
        int count=0;
        for(int i=0;i<A.length;i++){
            if(A[i]>='0'&& A[i]<='9'){
                count=(count*10)+A[i]-'0';
            }
            else if(count>0){
                count--;
                for(int j=0;j<count;j++){
                    System.out.print(c);
                }
                count=0;
            }
            if(A[i]>'9'){
                c=A[i];
                System.out.print(c);
            }
            if(i==A.length-1){
                count--;
                for(int j=0;j<count;j++){
                    System.out.print(c);
                }
            }


        }
    }
}
