import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        int numMultiples = 10;
        for (int i = 0; i < numMultiples; i++) {
            System.out.printf("%d x %d = %d%n", N, i + 1, N * (i + 1));
        }
    }
}
