import java.io.*;
import java.util.*;

public class Main {
    static long a,b;
    static int L;
    static Queue<Long> q = new LinkedList<>();
    public static int bfs(long start) {
        q.offer(start);

        while (!q.isEmpty()) {
            int size = q.size();

            for(int i=0; i<size; i++){
                long cur=q.poll();

                if(cur==b) return L+1;

                if(cur*2<=b) q.offer(cur*2);
                if(cur*10+1<=b) q.offer(cur*10+1);

            }
            L++;
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(bfs(a)));

        br.close();
        bw.close();
    }
}
