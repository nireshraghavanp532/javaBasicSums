/**A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. Given an integer, , rotate the array that many steps left and return the result.

 Example


 After  rotations, .

 Function Description

 Complete the rotateLeft function in the editor below.

 rotateLeft has the following parameters:

 int d: the amount to rotate by
 int arr[n]: the array to rotate
 Returns

 int[n]: the rotated array
 Input Format

 The first line contains two space-separated integers that denote , the number of integers, and , the number of left rotations to perform.
 The second line contains  space-separated integers that describe .

 Constraints

 Sample Input

 5 4
 1 2 3 4 5
 Sample Output

 5 1 2 3 4
 Explanation

 To perform  left rotations, the array undergoes the following sequence of changes:

 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultDS4 {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> ans=new ArrayList<>();
        int s=d;
        for(int i=0;i<arr.size();i++){
            if(s<arr.size()){
                ans.add(arr.get(s));
                s++;
            }
            else{
                ans.add(arr.get(i-(arr.size()-d)));
            }
        }
        return ans;
    }

}

public class DS4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = ResultDS4.rotateLeft(d, arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
