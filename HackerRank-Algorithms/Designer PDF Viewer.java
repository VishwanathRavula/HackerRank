import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int brd=word.length();
        int len=0;
        int j=0;
        for(int i=0;i<word.length();i++){
            for(char c='a';c<=word.charAt(i);c++){
                j++;
            }
            if(h[j-1]>=len)
                {
                len=h[j-1];
            }
            j=0;
        }
        int area=len*brd;
        System.out.println(area);
    }
}
