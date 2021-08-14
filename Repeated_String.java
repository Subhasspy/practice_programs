// There is a string,s , of lowercase English letters that is repeated infinitely many times. Given an integer,n, 
//find and print the number of letter a's in the first a letters of the n infinite string.
// For  of the test cases, .
// Sample Input
// aba
// 10
// Sample Output 0
// 7
// Explanation 0
// The first  letters of the infinite string are abaabaabaa. Because there are  a's, we return .


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

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    // Write your code here
        int size=s.length();
        long total=n/size;
        ArrayList<Integer> Alist = new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            if(s.charAt(i)=='a')
            Alist.add(i+1);
        }
        total*=Alist.size();
        for(int j:Alist)
        {
            if(j<=n%size)
            total++;
        }
        //System.out.println(Alist);
        return total;
    }

}

public class Repeated_String {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}