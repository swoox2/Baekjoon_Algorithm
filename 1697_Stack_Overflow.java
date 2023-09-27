import java.io.*;
import java.util.*;

public class Main {
    static int n,k,answer;
    static Queue<Integer> q = new LinkedList<>();

    public static void bfs(){
        boolean find=false;

        while (!q.isEmpty()){
            int size=q.size();
            for(int i=0; i<size; i++){
                int n = q.poll();

                if(n==k){
                    find=true;
                    break;
                }
                q.offer(n-1);
                q.offer(n+1);
                q.offer(n*2);
            }
            answer++;
            if(find) break;

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); //시작
        k = Integer.parseInt(st.nextToken()); //도착

        q.offer(n-1);
        q.offer(n+1);
        q.offer(n*2);

        bfs();

        if(n==k) bw.write("0");
        else bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }
}
