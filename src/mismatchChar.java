import java.util.Scanner;
public class mismatchChar {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of the array1");
        int a=in.nextInt();
        char[] arr1= new char[a];
        System.out.println("Enter the elements of array1 ");
        for (int i=0;i<a;i++){
            arr1[i]=in.next().charAt(0);
        }
        System.out.println("Enter the size of the array2 as same as array1");
        int b=in.nextInt();
        char [] arr2= new char[b];
        System.out.println("Enter the elements of array2 ");
        for (int i=0;i<b;i++){
            arr2[i]=in.next().charAt(0);
        }


        if(a==b){
            for(int i=0;i<a;i++){
                if(arr1[i]!=arr2[i]){
                    System.out.print(arr1[i]+""+arr2[i]+",");
                }
            }
        }


    }
}
