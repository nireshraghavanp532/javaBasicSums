import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size of pascal triangle");
    int n= in.nextInt();
    int size=n,b=0;
    for(int i=0;i<n-1;i++){
        int j=0;
        int count=0;
        while(j<size-1){
            count++;
            j++;
        }
        size--;
        b+=(i+1)*count;
    }
    System.out.println(b);

    }
}
