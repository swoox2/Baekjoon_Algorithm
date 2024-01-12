import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t=Integer.parseInt(br.readLine());

        while(t-- >0){
            st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());

            long result=1;

            for(int i=0; i<n; i++){
                result*=(m-i);
                result/=(i+1);
            }

            System.out.println(result);
        }


        br.close();
        bw.close();
    }
}
