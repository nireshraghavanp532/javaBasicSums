import java.util.Scanner;

public class checkValueinSortedArray {
    public static boolean sumInArray(int [] arr,int sum){


        for (int i=0;i<arr.length;i++){
            int value=0;
            for (int j=i+1; j<arr.length;j++){
                value=arr[i]+arr[j];
                if (value==sum){
                    return true;
                }

            }
            value=0;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        int [] arr= new int [n];
        System.out.println("Enter the elements of array in sorted format");
        for (int i=0; i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the sum value");
        int sum = in.nextInt();
       System.out.println(sumInArray(arr,sum));

    }
}
