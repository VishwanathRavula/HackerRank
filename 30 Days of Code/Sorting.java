import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n;
        int ns=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<temp-1;j++)
                {
                if(arr[j]>arr[j+1])
                    {
                    swap(arr,j,j+1);
                    ns++;
                }
               
            }
            temp--;
        }
        System.out.println("Array is sorted in "+ns+" swaps.");
        System.out.println("First Element: "+arr[0]);
        System.out.println("Last Element: "+arr[n-1]);
        
        
    }
    
    static void swap(int arr[],int i,int j)
        {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
    
}