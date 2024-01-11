import java.util.Scanner;

public class halfSpiralPrinting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n=num;
        int size=num;
        int[][] A=new int[n][n];
        for(int k=0;k<size/2;k++){
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
