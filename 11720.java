import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=(str.charAt(i)-'0');
        }

        bw.write(String.valueOf(sum));

        br.close();
        bw.close();
    }
}
