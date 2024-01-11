import java.util.HashMap;
import java.util.Scanner;

public class noofTimes {
    public void noofOccurences(int [] A,int max){
        int [] answer= new int[max+1];
        for(int i=0;i<A.length;i++){
            answer[A[i]]++;
        }
        for(int i=0;i<answer.length;i++){
            if(answer[i]>0){
                System.out.println(i+" -> "+answer[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= in.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the elements of array");
        int max=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        noofTimes o=new noofTimes();
        o.noofOccurences(arr,max);

    }
}
