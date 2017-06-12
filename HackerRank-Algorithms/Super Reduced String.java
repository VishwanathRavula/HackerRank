import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        
        while (true) {
            // Used for loop termination
            int len = s.length();
            
            // "(.)" is a capturing group that captures any character
            // "\\1" is a backreference that will match the character captured by the first capturing group (i.e. the one captured by "(.)")
            s = s.replaceAll("(.)\\1", "");
            
            // If no changes were made to string, break loop
            if( s.length() == len ){
                break;
            }
        }

        System.out.println( (s.isEmpty()) ? "Empty String" : s);
       
        
    }
    static String removeDuplicates(String s)
        {
        int cnt=0;
         String str="";
        for(int i=0;i<s.length()-1;i++)
            {
            if(s.charAt(i)==s.charAt(i+1))
                cnt++;
        }
        if(cnt>0)
            {
            char arr[]=new char[s.length()];
            arr=s.toCharArray();
            char arr1[]=new char[s.length()];
            int j=0;
            for(int i=0;i<arr.length-1;i++)
                {
                if(arr[i]!=arr[i+1])
                    {
                    arr1[j]=arr[i];
                    j++;
                  //  i++;
                    str=new String(arr1);
                 //   removeDuplicates(str);
                }
                else
                    {
                    i++;
                }
            }
            s=str;
            return s;
            
        }
        return s;
    }
}