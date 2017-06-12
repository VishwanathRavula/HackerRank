import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int max=score[0],mc=0,mnc=0;
        int min=score[0];     
        for(int i:score)
            {
            if(i>max)
                {
                mc++;
                    max=i;
            }
            if(i<min)
                {
                mnc++;
                min=i;
            }
        }
        System.out.println(mc+" "+mnc);
        // your code goes here
    }
}
