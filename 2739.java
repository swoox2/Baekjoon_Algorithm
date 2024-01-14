import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());

        for(int i=1; i<=9; i++){
            System.out.println(n+" "+"*"+" "+i+" "+"="+" "+n*i);
        }
        
        br.close();
        bw.close();
    }
}
