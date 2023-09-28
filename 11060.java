import java.io.*;
import java.util.*;

class Node{
    int val, idx;

    Node(int val, int idx){
        this.val=val;
        this.idx=idx;
    }
}

public class Main {
    static int n;
    static int[] arr;
    static boolean[] visited;
    static Queue<Node> q = new LinkedList<>();

    public static int bfs(int start) {
        visited[start]=true;
        q.offer(new Node(arr[start],start));
        int L=0;

        while (!q.isEmpty()) {
            int size=q.size();

            for(int i=0; i<size; i++){
                Node cur=q.poll();
                int val=cur.val;
                int idx=cur.idx;

                if(idx==n) return L;

                for(int j=0; j<val; j++){
                    int nx=val-j;

                    if(1<=nx+idx && nx+idx<=1000 && visited[nx+idx]==false){
                        visited[nx+idx]=true;
                        q.offer(new Node(arr[nx+idx],nx+idx));
                    }
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        arr=new int[1000+100];
        visited=new boolean[1000+100];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) arr[i] = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(bfs(1)));

        br.close();
        bw.close();
    }
}
