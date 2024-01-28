import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main{

    public static long fac(int num){
        if(num==0) return 1;

        return num*fac(num-1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());

        System.out.println(fac(n));

        br.close();
    }
}
