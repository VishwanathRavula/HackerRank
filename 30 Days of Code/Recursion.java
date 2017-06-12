import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        i=factorial(n);
        System.out.print(i);
        
    }
    static int factorial(int n)
        {
        if(n==1 || n==0)
            return 1;
        else
            return (factorial(n-1)*n);
        
    }
    
}