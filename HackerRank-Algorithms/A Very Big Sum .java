import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long sum=0,val=0;
        for(int i=0;i<n;i++){
            val=s.nextLong();
         sum=sum+val;
        }
        System.out.print(sum+"");
    }
}