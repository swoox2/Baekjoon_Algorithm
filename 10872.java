import java.io.*;
import java.util.*;

public class Main{
    public static int fac(int n){
        if(n==0 || n==1) return 1;

        return n*fac(n-1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());

        System.out.println(fac(n));


        br.close();
    }
}
