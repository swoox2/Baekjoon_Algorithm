import java.io.*;
import java.util.*;
public class Main {

    static final int MAX=100+10;
    static int n,answer,t=100;
    static int[][] map;
    static boolean[][] visited;
    static int[] c1={-1,0,1,0};
    static int[] c2={0,1,0,-1};

    public static void dfs(int x, int y) {
        visited[x][y]=true;

        for(int i=0; i<4; i++){
            int new_x=x+c1[i];
            int new_y=y+c2[i];

            if(map[new_x][new_y]>t && visited[new_x][new_y]==false){
                dfs(new_x, new_y);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        map=new int[MAX][MAX];

            for(int i=1; i<=n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=1; j<=n; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int max=Integer.MIN_VALUE;
            while(t >= 0){
                answer=0;
                visited=new boolean[MAX][MAX];
                for(int i=1; i<=n; i++){
                    for(int j=1; j<=n; j++){
                        if(map[i][j]>t && visited[i][j]==false){
                            dfs(i,j);
                            answer++;
                        }
                    }
                }
                t--;
                max=Math.max(answer,max);
            }

        bw.write(String.valueOf(max));

        br.close();
        bw.close();
    }
}
