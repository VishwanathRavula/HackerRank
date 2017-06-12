import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
            {
            int cnt=0;
            int a=sc.nextInt();
             if(a==1)
                    {
                    System.out.println("Not prime");                    
                   continue;
                } 
            if(a==2)
                {
                System.out.println("Prime");
                continue;
            }
            int k=a%10;
            if(k==0 || k==2||k==4||k==6||k==8)
                {
                    System.out.println("Not prime");                    
                    continue;
            }
            
            for(int j=3;j<=Math.sqrt(a);j++)
                {
                 
                 if(a%j==0)
                    cnt++;
                 j++;
            }
            int j=a/2;
            if(a%j==0)
                cnt++;
            if(cnt>0)
                System.out.println("Not prime");
            else
                System.out.println("Prime");
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}