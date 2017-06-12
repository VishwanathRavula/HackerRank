import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
    {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        if(v1!=v2)
            {
            if(v1>v2)
                {
                if(x1>x2)
                    {
                    System.out.println("NO");                    
                    }
                if(x1<x2)
                    {
                    float n = (x2-x1)/((v1-v2)*1.0f);
                    if(n-(int) n>0)
                        System.out.println("NO");
                    else
                        System.out.println("YES"); 
                    }
                
                }
            if(v1<v2)
                {
                if(x1<x2)
                    {
                    System.out.println("NO");                                        
                    }
                if(x1>x2)
                    {
                    float n = (x2-x1)/(v1-v2);
                    if(n-(int) n>0)
                        System.out.println("NO");
                    else
                        System.out.println("YES"); 
                    }
                }     
            }
        else
            {
            if(x1!=x2)
                {
                System.out.println("NO");
                }
            else
                {
                System.out.println("YES");
                }            
            }
        }
    }
