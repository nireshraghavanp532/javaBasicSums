
import java.util.Scanner;

public class mississippi {

    public  static void mostFirstOccurence(String a){

        char[] A=a.toCharArray();
        char [] answer= new char[26];


        for (int i=0;i<A.length;i++){
            if (Character.isLetter(A[i])) {
                A[i] = Character.toLowerCase(A[i]);
                answer[A[i]-97]++;

            }
        }
        int maxcount=0;

        char mostfirstoccuered =' ';
        for(int i=0; i<answer.length;i++){
            if(answer[i]>maxcount ) {
                maxcount=answer[i];
                mostfirstoccuered=(char)(97+i);

            }

        }
        System.out.println(mostfirstoccuered+"---->"+maxcount);



    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        mostFirstOccurence(s);

    }
}
