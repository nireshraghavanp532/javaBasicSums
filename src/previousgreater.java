import java.util.Scanner;

public class previousgreater {
    public static void previousGreater(int[]arr){

        for(int i=0;i<arr.length-1;i++){
            int max=arr[i];
            if(arr[i+1]>max){
                System.out.print(arr[i+1]+" ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        previousGreater(arr);
    }
}
