import java.io.*;
import java.util.*;
public class Main {
    static int n,cnt;
    static Queue<Integer> q=new LinkedList<>();

    public static int bfs(int start){
        q.add(start);

        while (!q.isEmpty()){
            int len=q.size();

            for(int i=0; i<len; i++){
                int cur=q.poll();

                if(cur==1) return cnt;

                if(cur%3==0) q.add(cur/3);
                if(cur%2==0) q.add(cur/2);
                q.add(cur-1);
            }
            cnt++;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        n=Integer.parseInt(br.readLine());

        bw.write(String.valueOf(bfs(n)));

        br.close();
        bw.close();
    }
}
