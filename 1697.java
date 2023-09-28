import java.io.*;
import java.util.*;

public class Main {
    static int n,k;
    static Queue<Integer> q = new LinkedList<>();
    static boolean[] visited=new boolean[100001];

    public static int bfs(int start) {
        visited[start]=true;
        q.offer(start);
        int L=0;

        while (!q.isEmpty()) {
            int len = q.size();

            for(int i=0; i<len; i++){
                int x=q.poll();

                if(x==k) return L;
                for(int j=0; j<3; j++){
                    int nx=0;
                    if(j==0) nx=x+1;
                    if(j==1) nx=x-1;
                    if(j==2) nx=x*2;

                    if(0<=nx && nx<=100000 && visited[nx]==false){
                        visited[nx]=true;
                        q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); //시작
        k = Integer.parseInt(st.nextToken()); //도착

        bw.write(String.valueOf(bfs(n)));

        br.close();
        bw.close();
    }
}
