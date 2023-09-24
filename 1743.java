import java.io.*;
import java.util.*;
public class Main {
    static final int MAX=100+10;
    static int n,m,k,count;
    static boolean[][] map;
    static boolean[][] visited;
    static int c1[]={-1,0,1,0};
    static int c2[]={0,1,0,-1};

    public static void dfs(int x, int y) {
        visited[x][y]=true;
        count++;

        for(int i=0; i<4; i++){
            int new_x=x+c1[i];
            int new_y=y+c2[i];

            if(map[new_x][new_y] && visited[new_x][new_y]==false){
                dfs(new_x,new_y);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        map=new boolean[MAX][MAX];
        visited=new boolean[MAX][MAX];

        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            map[r][c]=true;
        }

        int max=Integer.MIN_VALUE;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(map[i][j] && visited[i][j]==false){
                    dfs(i,j);
                    max=Math.max(max,count);
                    count=0;
                }
            }
        }

        bw.write(String.valueOf(max));

        br.close();
        bw.close();


    }
}
