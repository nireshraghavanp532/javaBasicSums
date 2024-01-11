import java.util.Scanner;

public class substringindex {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
        String s1=in.nextLine();
        int count;
        int a=0;
        for(int i=0;i<=s.length()-s1.length();i++){
            count=0;
            if(s.charAt(i)==s1.charAt(0)){
                count=1;
                for(int k=1;k<s1.length();k++){
                    if(s.charAt(i+k)==s1.charAt(k)){
                        count++;
                    }
                    else{
                        break;
                    }
                }

            }
            if(count==s1.length()){
                a++;
                System.out.println(i);

            }
        }
        if(a==0){
            System.out.print(-1);
        }

    }
}
