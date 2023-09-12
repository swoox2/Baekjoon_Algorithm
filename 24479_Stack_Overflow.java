import java.io.*;
import java.util.*;
public class Main {
    static int n;
    static int m;
    static int r;
    static boolean[][] graph;
    static boolean[] visited;

    public static void dfs(int start){
        visited[start]=true;
        System.out.println(start);
        for(int i=1; i<=n; i++){
            if(visited[i]==false && graph[start][i]){
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        r=Integer.parseInt(st.nextToken());
        graph=new boolean[n+1][n+1];
        visited=new boolean[n+1];
        for(int i=0; i<m; i++){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            graph[u][v]=true;
            graph[v][u]=true;
        }
        dfs(r);
        for(int i=1; i<=n; i++){
            if(visited[i]==false) bw.write(String.valueOf(0));
        }


        br.close();
        bw.close();
    }
}
