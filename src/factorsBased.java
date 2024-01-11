import java.util.Scanner;

public class factorsBased {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        int []A=new int[n];
        int []value=new int[n];
        System.out.println("Enter the elements ");
        for(int i=0;i<n;i++){
            A[i]=in.nextInt();
        }

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=1;j<=A[i];j++){
                if(A[i]%j==0){
                    count+=1;
                }
                value[i]=count;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(value[j]<value[j+1]){
                    int c=A[j];
                    A[j]=A[j+1];
                    A[j+1]=c;

                    c=value[j];
                    value[j]=value[j+1];
                    value[j+1]=c;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print("("+A[i]+","+value[i]+")");
        }
    }
}
