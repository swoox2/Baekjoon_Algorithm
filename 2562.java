import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int max=Integer.MIN_VALUE;
        int idx=0;

        for(int i=0; i<9; i++){
            int n=Integer.parseInt(br.readLine());

            if(n>max){
                max=n;
                idx=i+1;
            }

        }

        System.out.println(max);
        System.out.println(idx);

        br.close();
    }
}
