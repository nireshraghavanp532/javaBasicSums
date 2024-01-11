import java.util.Scanner;

public class hugeNumAdd {
    static int calSumUtil(int[]a,int[]b,int n,int m){
        int i=n-1,j=m-1,carry=0,sum;
        int[]ans =new int[n];
        while(j>=0){
            sum=a[i]+b[j]+carry;
            ans[i]=sum%10;
            carry=sum/10;
            i--;
            j--;
        }
        while(i>=0){
            sum=a[i]+carry;
            ans[i]=sum%10;
            carry=sum/10;
            i--;
        }
        int add=0;
        if(carry==1){
            add=10;
        }
        for(int k=0;k<n;k++){
            add=add+ans[k];
            add*=10;
        }
        return add/10;
    }
    static int calSum(int[]a,int[]b,int n,int m){
        if(n>=m){
            return calSumUtil(a,b,n,m);
        }
        else{
            return calSumUtil(b,a,m,n);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array1");
        int n=in.nextInt();
        System.out.println("Enter the szie of Array2");
        int m=in.nextInt();
        int A[]=new int[n];
        int B[]=new int[m];
        System.out.println("Enter the elements of array1");
        for(int i=0;i<n;i++){
            A[i]=in.nextInt();
        }
        System.out.println("Enter the elements of array2");
        for(int i=0;i<m;i++){
            B[i]=in.nextInt();
        }
        System.out.println(calSum(A,B,n,m));
    }
}
