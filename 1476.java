import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int find_e=0, find_s=0, find_m=0;
        int year=0;

        while (true) {
            find_e++;
            find_s++;
            find_m++;
            year++;

            if(find_e==16) find_e=1;
            if(find_s==29) find_s=1;
            if(find_m==20) find_m=1;


            if(find_e==e && find_s==s && find_m==m) break;
        }

        bw.write(String.valueOf(year));

        br.close();
        bw.close();
    }

}
