/*The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java
Explanation 0

String  is "hello" and  is "java".

 has a length of , and  has a length of ; the sum of their lengths is .
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore,  is not greater than  and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".*/
import java.util.*;

public class Solution1 {
    static String ans="Yes";
    public static String Lexico(String a, String b){

        if(a.charAt(0)<=b.charAt(0)){
            ans="No";
            return ans;
        }
        else{
            return ans;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner (System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        System.out.println(a.length()+b.length());
        System.out.println(Lexico(a,b));
        char[]A=a.toCharArray();
        char[]B=b.toCharArray();

        if((A[0]<='z')&&(A[0]>='a')){
            A[0]= (char) (A[0]-' ');

        }

        if((B[0]<='z')&&(B[0]>='a')){
            B[0]=(char)(B[0]-' ');
        }
        String temp1="";
        String temp2="";
        for(int i=0;i<a.length();i++){
            temp1+=A[i];
        }
        for(int i=0;i<b.length();i++){
            temp2+=B[i];
        }
        System.out.println(temp1+" "+temp2);


    }
}