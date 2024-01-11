import java.util.Scanner;

public class maxSumPathin2DArray {
    public static int right(int[][]A,int a,int b,int n){
        int sum=0;
        while(b<n){
            sum+=A[a][b];
            b++;
        }
        return sum;
    }
    public static int down(int[][]A,int a,int b,int n){
        int sum=0;
        while(a<n){
            sum+=A[a][b];
            a++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of 2D array");
        int n= in.nextInt();
        int [][] A= new int[n][n];
        System.out.println("Enter the elements of 2D array");
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j]=in.nextInt();
               // System.out.print(A[i][j]);
            }
            //System.out.println();
        }
        int sum1=0,sum2=0,sum=0;
        sum1=right(A,0,0,n);
        sum1+=down(A,1,n-1,n);
        sum2=down(A,0,0,n);
        sum2+=right(A,n-1,1,n);
        sum=sum1>sum2?sum1:sum2;
        System.out.println(sum);

    }
}
