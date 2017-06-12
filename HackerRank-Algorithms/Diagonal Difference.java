import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int sum=0;
        int sum1=0;
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
                {
                arr[i][j]=sc.nextInt();
            }
 
        }
        int k=n-1;
           for(int i=0;i<n;i++)
               {

            sum=sum+arr[i][i];
            sum1=sum1+arr[k-i][i];
                   

           }
        int temp=sum-sum1;
        if(temp<0)
            {
            temp=-1*temp;
        }
        System.out.println(temp);
        
    }
}