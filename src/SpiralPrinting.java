import java.util.Scanner;

public class SpiralPrinting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a=num;
        int size= num*2-1;
        int n=size;
        int[][] A=new int[n][n];
        for(int k=0;k<a;k++){
            int i=k;
            int j=k;
            while(j<n){
                A[i][j]=num;
                j++;
            }
            j--;
            while(i<n){
                A[i][j]=num;
                i++;
            }
            i--;
            while(j>k){
                A[i][j]=num;
                j--;
            }
            while(i>k){
                A[i][j]=num;
                i--;
            }
            num--;
            n--;
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }
}
