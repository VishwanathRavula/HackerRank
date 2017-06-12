import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        int cnt=0,pairs=0;
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        for(int i=0;i<c.length;i++){
            cnt=0;
            for(int j=0;j<c.length;j++){
                if(c[i]==c[j] && c[j]!=-1){
                    cnt++;
                   
                    if(i!=j){
                        c[j]=-1;
                    }
                }
            }
            cnt=cnt/2;
            c[i]=-1;
            pairs=pairs+cnt;
        }
//        pairs=pairs;
        System.out.println(pairs);
    }
}
