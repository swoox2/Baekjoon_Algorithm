import java.io.*;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;
public class Main {
    static int n,m,v;
    static boolean graph[][];
    static boolean[] visited;
    static ArrayList<Integer> queue;

    static public void dfs(int idx){
        visited[idx]=true;
        System.out.print(idx+" ");
        for(int i=1; i<=n; i++){
            if(visited[i]==false && graph[idx][i]==true){
                dfs(i);
            }
        }
    }

    static public void bfs(){
        queue=new ArrayList<>();
        visited=new boolean[n+1];

        queue.add(v);
        visited[v]=true;

        while(!queue.isEmpty()){
            int idx=queue.remove(0);
            System.out.print(idx+" ");
            for(int i=1; i<=n; i++){
                if(visited[i]==false && graph[idx][i]){
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        graph=new boolean[n+1][n+1];
        visited=new boolean[n+1];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y]=true;
            graph[y][x]=true;
        }

        dfs(v);
        System.out.println();
        bfs();

        br.close();
        bw.close();
    }
}
