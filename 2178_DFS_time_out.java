import java.io.*;
import java.util.*;
public class Main {
    static final int MAX=100+10;
    static int n,m,min=Integer.MAX_VALUE,count;
    static int[][] map;
    static boolean[][] visited;
    static int[] c1={-1,0,1,0};
    static int[] c2={0,1,0,-1};

    public static void dfs(int x, int y) {
        if(x==n && y==m){
            count++;
            min=Math.min(count,min);
            return;
        }
        visited[x][y]=true;
        count++;

        for (int i=0; i<4; i++){
            int new_x=x+c1[i];
            int new_y=y+c2[i];

            if(map[new_x][new_y]==1 && visited[new_x][new_y]==false){
                dfs(new_x,new_y);
                visited[new_x][new_y]=false;
                count--;
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map=new int[MAX][MAX];
        visited=new boolean[MAX][MAX];

        for(int i=1; i<=n; i++){
            String str = br.readLine();
            for(int j=1; j<=m; j++){
                map[i][j]=str.charAt(j-1)-'0';
            }
        }

        dfs(1,1);

        bw.write(String.valueOf(min));

        br.close();
        bw.close();
    }
}
