import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int saveThePrisoner(int n, int m, int s){
        // Complete this function
    
        int a=s,cnt=0;
        return (m-1+s-1)%n+1;
        /*  
       int temp=s+m;
        if(temp<n)
            return temp;
        else if(temp==n)
            return n;
        else
            return temp%n;
//      return a-1;
    */
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }
    
    
}
