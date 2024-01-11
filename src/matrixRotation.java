import java.util.Scanner;

public class matrixRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of 2D array");
        int n= in.nextInt();
        System.out.println("Enter the degree of rotation");
        int m=in.nextInt();
        m=m/90;
        int [][] A= new int[n][n];
        int [][] ans=new int[n][n];
        System.out.println("Enter the elements of 2D array");
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j]=in.nextInt();
                // System.out.print(A[i][j]);
            }
            //System.out.println();
        }
        for(int k=0; k<m;k++){
            for(int i=0;i<n;i++){
                for(int j=0; j<n;j++){
                    ans[i][j]= A[n-1-j][i]; // for left rotation ans[j][i]=A[j][n-1-i];
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    A[i][j]=ans [i][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

    }
}
