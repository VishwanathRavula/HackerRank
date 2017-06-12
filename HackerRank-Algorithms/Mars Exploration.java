import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int cnt=0;
        for(int t=0,i=0,j=1,k=2;k<S.length();t++)
            {
            if(S.charAt(i)!='S')
                cnt++; 
            if(S.charAt(j)!='O')
                cnt++; 
            if(S.charAt(k)!='S')
                cnt++; 
            i=i+3;
            j=j+3;
            k=k+3;
        }
        System.out.println(cnt);
    }
}
