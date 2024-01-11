import java.util.Scanner;

public class slantconePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char [] arr= new char[s.length()];
        int len=s.length();
        int c=0;
        for(int i=len/2;i<s.length();i++ ){

            arr[c]=s.charAt(i);
            c++;
        }
        for(int i=0; i<len/2;i++){
            arr[c]=s.charAt(i);
            c++;
        }

        int a= (s.length()-1)*2;
        int b=a;



        for(int i=0; i<s.length();i++){
            int k=0;
            for(int j=0;j<(s.length()*2)-1;j++){
                if(j<=b&&j>=a){

                    System.out.print(arr[k++]);

                }
                else{
                    System.out.print(" ");
                }
            }
            a-=2;
            b--;
            System.out.println();
        }


    }
}

