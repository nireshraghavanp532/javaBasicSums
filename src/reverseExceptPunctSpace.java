import java.util.Scanner;

public class reverseExceptPunctSpace {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String temp="";
        String ans="";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if(Character.isLetter(s.charAt(i))||(s.charAt(i)>='0')&&(s.charAt(i)<='9')){
                temp+=s.charAt(i);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(Character.isLetter(s.charAt(i))||(s.charAt(i)>='0')&&(s.charAt(i)<='9') ){
                ans+=temp.charAt(count);
                count++;
            }
            else{
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
