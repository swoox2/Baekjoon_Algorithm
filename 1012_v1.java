import java.io.*;
import java.util.*;
public class Main {
    final static int MAX=50+10;
    static int m,n,k,answer;
    static boolean[][] map;
    static boolean[][] visited;
    static int[] c1={-1,0,1,0};
    static int[] c2={0,1,0,-1};


    public static void dfs(int i, int j) {
        visited[i][j] = true;
        for(int n=0; n<4; n++){
            int new_i=i+c1[n];
            int new_j=j+c2[n];

            if(map[new_i][new_j] && visited[new_i][new_j]==false) dfs(new_i, new_j);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            map=new boolean[MAX][MAX];
            visited=new boolean[MAX][MAX];

            for(int j=0; j<k; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y+1][x+1]=true;
            }

            int answer=0;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=m; j++){
                    if(map[i][j] && visited[i][j]==false){
                        answer++;
                        dfs(i, j);
                    }
                }
            }

            bw.write(String.valueOf(answer));
            bw.newLine();

        }
        br.close();
        bw.close();

    }
}
