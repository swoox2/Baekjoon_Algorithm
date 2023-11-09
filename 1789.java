import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        long s=Long.parseLong(br.readLine());

        long sum=0;
        int cnt=0;
        for(int i=1; ;i++){
            sum+=i;
            cnt++;
            if(sum>s) break;
        }

        bw.write(String.valueOf(cnt-1));

        br.close();
        bw.close();

    }
}
