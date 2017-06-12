import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int temp=0,sum=-100;
        for(int i=0;i<4;i++)
            {
            for(int j=0;j<4;j++)
                {
                
                int k=i,l=j;
                 temp=0;
                temp=temp+arr[k][l]+arr[k][l+1]+arr[k][l+2]+arr[k+1][l+1]+arr[k+2][l]+arr[k+2][l+1]+arr[k+2][l+2];
                

                if(temp>sum)
                {         
                    
                sum=temp;
//                temp=0;
            }
 //                System.out.println(temp);
            }
        }
        
      System.out.println(sum);
        
        
    }
}
