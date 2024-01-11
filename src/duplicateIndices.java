import java.util.Scanner;

public class duplicateIndices {
    public static void  find(int a,int []arr){

        int start =-1,end=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                start=i;
                break;
            }
        }
        for(int j=arr.length-1;j>-1;j--){
            if(arr[j]==a){
                end=j;
                break;
            }
        }
        System.out.print(start+" "+end);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a=in.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        find(a,arr);

    }
}
