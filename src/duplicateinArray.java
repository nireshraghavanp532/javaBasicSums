import java.util.Arrays;
import java.util.Scanner;

public class duplicateinArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int [] arr= new int[n+1];
        System.out.println("Enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<n;){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]+" ");
                j=i+2;
                while(arr[i]==arr[j]){
                    j++;
                }
                i=j;
            }
            else{
                i++;
            }
        }
        if(j==0){
            System.out.print("-1");
        }
    }
}
