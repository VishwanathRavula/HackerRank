import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n;i++)
            {
            int arr=a[i];
            int ts=0;
            for(int j=i+1;j<n;j++)
                {
                 ts=arr+a[j];
                if(ts%k==0)
                    cnt++;
                ts=0;
            }
        }
        System.out.println(cnt);
    }
}
