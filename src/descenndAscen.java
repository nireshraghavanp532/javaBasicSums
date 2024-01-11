import java.util.Scanner;

public class descenndAscen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n= in.nextInt();
        System.out.println("Enter the elements");
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=in.nextInt();
        }
        int c,d;
       for(int i=0;i<n;i+=2){
            for(int j=i+2;j<n;j+=2){
                if(A[i]<A[j]){
                    c=A[i];
                    A[i]=A[j];
                    A[j]=c;
                }
            }
       }
       for(int i=1;i<n;i+=2){
           for(int k=i+2;k<n;k+=2){
               if(A[i]>A[k]){
                   d=A[i];
                   A[i]=A[k];
                   A[k]=d;

               }
           }
       }
        for(int i=0;i<n;i++){
            System.out.print(A[i]+",");
        }
    }
}
