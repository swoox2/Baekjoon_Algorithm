import java.io.*;
import java.util.*;

public class Main{
    public static int palindrome(String s){
        int len=s.length();

        for(int i=0; i<len/2; i++){
            if(s.charAt(i)==s.charAt(len-1-i)) continue;

            return 0;
        }
        return 1;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s=br.readLine();

        System.out.println(palindrome(s));


        br.close();
    }
}
