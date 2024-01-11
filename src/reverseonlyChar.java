import java.util.Scanner;

public class reverseonlyChar {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s= in.nextLine();
        String temp="";
        String ans="";
        int n=s.length()-1;
        for(int i=n;i>=0;i--){
            if(Character.isLetter(s.charAt(i))){
                temp+=s.charAt(i);
            }
        }
        //System.out.print(temp);
        int count=0;
        for(int i=0;i<=n;i++){
            if(Character.isLetter(s.charAt(i))){
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
