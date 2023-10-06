import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt=0;
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if(L==0 && P==0 && V==0) break;

            int answer=0;
            while (V>=P){
                V-=P;
                answer+=L;
            }
            if(V>L) answer+=L;
            else answer+=V;
            cnt++;
            bw.write(String.valueOf("Case "+cnt+": "+answer));
            bw.newLine();
        }

        br.close();
        bw.close();

    }

}
