import java.util.Scanner;

public class welcomeToZohoCorporation{
        public static void main(String[]args){

            Scanner in = new Scanner(System.in);
            //String s= "WELCOMETOZOHOCORPORATION";
            //char [] arr= s.toCharArray();
            String s= in.nextLine();
            String s1=in.nextLine();

            int n = (int) Math.sqrt(s.length())+1;
            int m= s1.length();

            char [] [] dim= new char[n][n];
            int a=0;
            for(int i = 0; i<n;i++){
                for(int j=0; j<n;j++){
                    if (a<s.length()) {
                        dim[i][j] = s.charAt(a);
                        a++;
                    }
                }
            }
            for(int i=0; i<n;i++){
                for(int j=0; j<n;j++){
                    System.out.print(dim[i][j]+" ");
                }
                System.out.println();
            }
            int count,sI,sJ,eI,eJ,found=0;

            outerloop1:
            for(int i=0; i<n; i++){
                for (int j=0; j<n-m;j++){
                    count=1;
                    if(s1.charAt(0)==dim[i][j]){

                        for(int k=1;k<m;k++){
                            if(s1.charAt(k)==dim[i][j+k]){
                                count++;
                            }
                            else{
                                break;
                            }
                        }
                    }
                    if (count==m){
                        sI=i;
                        eI=i;
                        sJ=j;
                        eJ=j+m-1;
                        found =1;
                        display(sI,sJ,eI,eJ);
                        break outerloop1;
                    }
                }
            }
            if (found==0){
                outerloop2:
                for(int j=0; j<n; j++){
                    for (int i=0; i<n-m;i++){
                        count=1;
                        if(s1.charAt(0)==dim[i][j]){

                            for(int k=1;k<m;k++){
                                if(s1.charAt(k)==dim[i+k][j]){
                                    count++;
                                }
                                else{
                                    break;
                                }
                            }
                        }
                        if (count==m){
                            sI=i;
                            eI=i+m-1;
                            sJ=j;
                            eJ=j;
                            found =1;
                            display(sI,sJ,eI,eJ);
                            break outerloop2;
                        }
                    }
                }

            }




        }
        public static void display(int sI,int sJ,int eI,int eJ){
            System.out.println("Start index: < "+sI+","+sJ+" >");
            System.out.println("End index: < "+eI+","+eJ+" >");


        }
}