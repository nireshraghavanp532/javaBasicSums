/**Declare a 2-dimensional array, , of  empty arrays. All arrays are zero indexed.
 Declare an integer, , and initialize it to .

 There are  types of queries, given as an array of strings for you to parse:

 Query: 1 x y
 Let .
 Append the integer  to .
 Query: 2 x y
 Let .
 Assign the value  to .
 Store the new value of  to an answers array.
 Note:  is the bitwise XOR operation, which corresponds to the ^ operator in most languages. Learn more about it on Wikipedia.  is the modulo operator.
 Finally, size(arr[idx]) is the number of elements in arr[idx]

 Function Description

 Complete the dynamicArray function below.

 dynamicArray has the following parameters:
 - int n: the number of empty arrays to initialize in
 - string queries[q]: query strings that contain 3 space-separated integers

 Returns

 int[]: the results of each type 2 query in the order they are presented
 Input Format

 The first line contains two space-separated integers, , the size of  to create, and , the number of queries, respectively.
 Each of the  subsequent lines contains a query string, .

 Constraints

 It is guaranteed that query type  will never query an empty array or index.
 Sample Input

 2 5
 1 0 5
 1 1 7
 1 0 3
 2 1 0
 2 1 1
 Sample Output

 7
 3
 Explanation

 Initial Values:


 = [ ]
 = [ ]

 Query 0: Append  to .

 = [5]
 = [ ]

 Query 1: Append  to .
 = [5]
 = [7]

 Query 2: Append  to .

 = [5, 3]
 = [7]

 Query 3: Assign the value at index  of  to , print .

 = [5, 3]
 = [7]

 7
 Query 4: Assign the value at index  of  to , print .

 = [5, 3]
 = [7]

 3*/
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

class ResultDS3 {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        int lastAnswer =0;
        List<List<Integer>>arr=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        int id=0;
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<>());
        }
        for(int i=0;i<queries.size();i++){

            if(queries.get(i).get(0)==1){
                id=((queries.get(i).get(1))^lastAnswer)%n;
                arr.get(id).add(queries.get(i).get(2));
            }
            else {
                id=((queries.get(i).get(1))^lastAnswer)%n;
                lastAnswer=arr.get(id).get((queries.get(i).get(2))%(arr.get(id).size()));
                ans.add(lastAnswer);

            }
        }
        return ans;

    }

}

public class DS3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = ResultDS3.dynamicArray(n, queries);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
