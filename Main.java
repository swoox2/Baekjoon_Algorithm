import java.io.*;
import java.util.*;
public class Main {
    static int n,m,r;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] answer;
    static int order;

    public static void dfs(int start){
        visited[start]=true;
        answer[start]=order;
        order++;

        for(int i=0; i< graph[start].size(); i++){
            int next=graph[start].get(i);
            if(visited[next]==false){
                dfs(next);
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

        graph=new ArrayList[n+1];
        for(int i=1; i<=n; i++) graph[i]=new ArrayList<>();
        visited=new boolean[n+1];
        answer=new int[n+1];
        order=1;

        for(int i=0; i<m; i++){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        for(int i=1; i<=n; i++) Collections.sort(graph[i]);

        dfs(r);

        for(int i=1; i<=n; i++){
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}