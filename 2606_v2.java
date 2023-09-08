import java.io.*;
import java.util.*;
public class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int n,m;
    static int answer;

    public static void dfs(int idx){
        visited[idx]=true;
        answer++;
        for(int i=1; i<=n; i++){
            if(visited[i]==false && graph[idx][i]){
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        n=Integer.parseInt(br.readLine());
        graph=new boolean[n+1][n+1];
        visited=new boolean[n+1];
        m=Integer.parseInt(br.readLine());
        int x,y;
        for(int i=0; i<m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x=Integer.parseInt(st.nextToken());
            y=Integer.parseInt(st.nextToken());
            graph[x][y]=true;
            graph[y][x]=true;
        }

        dfs(1);

        bw.write(String.valueOf(answer-1));

        br.close();
        bw.close();
    }
}
