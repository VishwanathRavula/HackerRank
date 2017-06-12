import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            {
            arr[i]=sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n;i++)
            {
            int a=arr[0],temp=0;
            for(int j=0;j<n;j++)
                {
                if(arr[j]==arr[i])
                    temp++;
            }
            if(temp>cnt)
                cnt=temp;
        }
        System.out.println((n-cnt));
        
        
    }
}