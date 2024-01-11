import java.util.Arrays;
import java.util.Scanner;

public class alternateSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of ARRAY");
        int n=in.nextInt();
        System.out.println("Enter the elements");
        int []A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=in.nextInt();
        }
        Arrays.sort(A);
        int j=A.length-1,i=0;
        while(i<j){
            System.out.print(A[i++]+" "+A[j--]+" ");
        }
        if(A.length%2!=0){
            System.out.print(A[i]);
        }
    }
}
