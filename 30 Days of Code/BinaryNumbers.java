import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int in=new Scanner(System.in).nextInt();
        int n=in;
        String s="";
        while(n>0)
            {
            s=s+(n%2);
            n=n/2;
        }
        String st="";
        for(int i=s.length()-1;i>=0;i--)
            {
            st=st+s.charAt(i);
        }
        checkCount(st);
//       System.out.print(st);
    }
    static void checkCount(String s)
        {
        int cnt=0,temp=0;
        for(int i=0;i<s.length();i++)
            {
            if(s.charAt(i)=='1')
                {
                cnt++;
            }
            if(s.charAt(i)=='0')
                {
                if(cnt>temp)
                      temp=cnt;
                cnt=0;
            }
            
        //    if(cnt)
        }
                if(cnt>temp)
                      temp=cnt;

        System.out.println(temp);
    }
}