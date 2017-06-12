import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        System.out.println(grid[0]);
        for(int i=1;i<grid.length-1;i++)
            {
            for(int j=1;j<grid[i].length()-1;j++)
                {
                if(grid[i].charAt(j)>grid[i].charAt(j-1) && (grid[i].charAt(j+1)<grid[i].charAt(j)) && grid[i].charAt(j)>grid[i-1].charAt(j) && (grid[i+1].charAt(j)<grid[i].charAt(j)))
                    {
                //    System.out.println(grid[i].charAt(j)+" "+j);
                    char []ch= grid[i].toCharArray();
                    ch[j]='X';
                    //grid[i]=grid[i].replace( grid[i].charAt(j), 'X');
                    grid[i]=String.valueOf(ch);
                }
            }
            System.out.println(grid[i]);
        }
        if(n!=1)
            {
        System.out.println(grid[grid.length-1]);
    }
    }
}
