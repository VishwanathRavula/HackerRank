import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int diff=(y-z);
            int diff1=(x-z);
            diff=Math.abs(diff);
            diff1=Math.abs(diff1);
            if(diff==diff1)
                System.out.println("Mouse C");
            else if(diff>diff1)
                System.out.println("Cat A");
            else
                System.out.println("Cat B");
        
           
        }
     
        
        
        
        
    }
}
