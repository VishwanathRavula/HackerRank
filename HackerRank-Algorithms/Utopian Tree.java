import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int a=1,h=1;
            while(a<=n)
                {
                if(a%2==1)
                    {
                    h=2*h;
                }
                else
                    {
                    h=h+1;
                }
                a++;
            }
            System.out.println(h);
        }
    }
}
