import java.util.Scanner;
import java.util.Stack;

public class revUsingStack {
    public static StringBuilder revfunc(String s){
        Stack<Character>stk=new Stack<>();
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='.' ){
                stk.push(s.charAt(i));
            }
            else{
                while(!stk.isEmpty()) {
                    ans.append(stk.pop());
                }
                ans.append(s.charAt(i));
            }
        }
        while(!stk.isEmpty()){
            ans.append(stk.pop());
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        StringBuilder ans=revfunc(s);

        System.out.print(ans);

    }
}