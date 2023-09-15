import java.io.*;
import java.util.*;
public class Main {
    static int n;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] answer;

    public static void dfs(int idx, int prev){
        visited[idx]=true;
        answer[idx]=prev;
        for(int i=0; i<graph[idx].size(); i++){
            int next=graph[idx].get(i);
            if(visited[next]==false){
                dfs(next,idx);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        graph=new ArrayList[n+1];
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();
        visited=new boolean[n+1];
        answer=new int[n+1];
        for(int i=0; i<n-1; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        dfs(1,0);

        for(int i=2; i<=n; i++){
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}
