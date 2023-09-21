import java.io.*;
import java.util.*;

public class Main {
    static final int MAX=500+10;
    static int m,n,answer;
    static int map[][];
    static boolean visited[][];

    static int[] c1={-1,0,1,0};
    static int[] c2={0,1,0,-1};

    public static void dfs(int x, int y) {
        visited[x][y]=true;
        if(x==m && y==n){
            answer++;
            visited=new boolean[MAX][MAX];
            return;
        }

        for(int i=0; i<4; i++){
            int new_x=x+c1[i];
            int new_y=y+c2[i];

            if(map[new_x][new_y]!=0 && map[x][y]>map[new_x][new_y] && visited[new_x][new_y]==false){
                dfs(new_x,new_y);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map=new int[MAX][MAX];
        visited=new boolean[MAX][MAX];

        for(int i=1; i<=m; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(1,1);

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }
}
