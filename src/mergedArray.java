import java.util.Arrays;
import java.util.Scanner;

public class mergedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of the array1");
        int a=in.nextInt();
        System.out.println("Enter the size of the array2");
        int b=in.nextInt();
        int [] arr1= new int[a];
        int [] arr2= new int[b];
        int answer[] = new int[a+b];
        System.out.println("Enter the elements of array1 ");
        int x=0;
        for (int i=0;i<a;i++){
            arr1[i]=in.nextInt();
            answer[x]=arr1[i];
            x++;
        }

        System.out.println("Enter the elements of array2 ");

        for (int i=0;i<b;i++) {
            arr2[i] = in.nextInt();
            answer[x]=arr2[i];
            x++;
        }


        Arrays.sort(answer);
        int check=answer[0];
        System.out.print(check);
        for(int i=1;i<a+b;i++){
            if(check!=answer[i]){
                System.out.print(" "+answer[i]);
                check=answer[i];
            }

        }
    }
}
