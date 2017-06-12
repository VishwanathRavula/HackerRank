//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap h=new HashMap(n);
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            h.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            
            if(h.containsKey(s))
                {
                System.out.println(s+"="+h.get(s));
            }
            else
                {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
