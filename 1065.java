import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int answer=0;
        for (int i = 1; i <= n; i++) {
            if(i<=99) answer++;

            if(100<=i && i<=999){
                String s=String.valueOf(i);
                int no1=s.charAt(0)-'0';
                int no2=s.charAt(1)-'0';
                int no3=s.charAt(2)-'0';

                if(no2-no1 == no3-no2) answer++;
            }
        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }

}
