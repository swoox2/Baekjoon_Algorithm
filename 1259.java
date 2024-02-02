import java.io.*;
import java.util.*;

public class Main{
    public static boolean palindrome(String s){
        if (s.length()==1) return true;

        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            String s=br.readLine();

            if(s.equals("0")) break;
            else{
                if(palindrome(s)) System.out.println("yes");
                else System.out.println("no");
            }
        }


        br.close();
    }
}
