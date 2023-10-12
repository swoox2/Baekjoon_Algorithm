import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int start=666;
        int cnt=1;

        while (cnt!=n){
            start++;

            String s=String.valueOf(start);
            if(s.contains("666")) cnt++;
        }

        bw.write(String.valueOf(start));

        br.close();
        bw.close();
    }

}
