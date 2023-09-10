import java.io.*;
import java.util.*;
public class Main {
    static boolean graph[][];
    static boolean visted[];
    static int n,m;
    static int answer;

    static void dfs(int idx){
        visted[idx]=true;
        for(int i=1; i<=n; i++){
            if(visted[i]==false && graph[idx][i]==true){
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
        graph=new boolean[n+1][n+1];
        visted=new boolean[n+1];
        for(int i=0; i<m; i++){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            graph[u][v]=true;
            graph[v][u]=true;
        }
        for(int i=1; i<=n; i++){
            if(visted[i]==false){
                dfs(i);
                answer++;
            }
        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();


    }
}
