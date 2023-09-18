import java.io.*;
import java.util.*;
public class Main {
    static int m,n,k,answer;
    static boolean[][] map;
    static boolean[][] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            map=new boolean[n+1][m+1];
            visited=new boolean[n+1][m+1];

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
