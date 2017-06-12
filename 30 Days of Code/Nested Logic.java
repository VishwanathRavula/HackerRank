import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int d1,m1,y1,d2,m2,y2,fine=0;
        d1=sc.nextInt();
        m1=sc.nextInt();
        y1=sc.nextInt();
        d2=sc.nextInt();
        m2=sc.nextInt();
        y2=sc.nextInt();
        int dd=d1-d2;
        int dm=m1-m2;
        int dy=y1-y2;
        if(dy>0)
            fine=10000;
        if(dy==0 && dm>0)
            fine=500*dm;
        if(dy==0 && dm==0 && dd>0)
             fine=15*dd;
        
        System.out.println(fine);
    }
}