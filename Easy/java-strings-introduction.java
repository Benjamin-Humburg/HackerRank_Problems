import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int sum = A.length() + B.length();
        String isLexico = A.compareTo(B) > 0 ? "Yes" : "No";
        String capitalA = A.substring(0, 1).toUpperCase();
        String Alower = A.substring(1, A.length());
        String capitalB = B.substring(0, 1).toUpperCase();
        String Blower = B.substring(1, B.length());
        
        System.out.println(sum);
        System.out.println(isLexico);
        System.out.println(capitalA + Alower + " " + capitalB + Blower);
    }
}
