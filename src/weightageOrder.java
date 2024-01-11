import java.util.Scanner;

public class weightageOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of list");
        int n=in.nextInt();
        int []A= new int[n];
        int result[]=new int[n];

        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            A[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            int value=(int)Math.sqrt(A[i]);
            if((A[i])==value*value){
                count+=5;
            }
            if(A[i]%4==0 && A[i]%6==0){
                count+=4;
            }
            if(A[i]%2==0){
                count+=3;
            }
            result[i]=count;
        }
        int c,d;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(result[j]<=result[j+1]){
                    c=result[j];
                    result[j]=result[j+1];
                    result[j+1]=c;

                    d=A[j];
                    A[j]=A[j+1];
                    A[j+1]=d;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print("< "+A[i]+","+result[i]+" >");
        }
    }
}
