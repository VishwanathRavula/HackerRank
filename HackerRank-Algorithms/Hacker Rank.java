import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean containsHackerRank(String s) {
        // Check if string contains 'hackerrank' with 
        // 0 or more other chars spaced around each char
        Pattern p = Pattern.compile(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*");
        Matcher m = p.matcher(s);

        return m.matches();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            System.out.println((containsHackerRank(s)) ? "YES" : "NO");
        }
        in.close();
    }
}
