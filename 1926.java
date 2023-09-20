import java.io.*;
import java.util.*;

public class Main {
    static final int MAX=500+10;
    static int n,m;
    static int[][] map;
    static int[] c1={-1,0,1,0};
    static int[] c2={0,1,0,-1};
    static int total,count,max=0;

    public static void dfs(int x, int y) {
        map[x][y]=0;
        count++;

        for(int i=0; i<4; i++){
            int new_x=x+c1[i];
            int new_y=y+c2[i];

            if(map[new_x][new_y]==1){
                dfs(new_x,new_y);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        map=new int[MAX][MAX];

        for (int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(map[i][j]==1){
                    dfs(i,j);
                    total++;
                    max=Math.max(count,max);
                    count=0;
                }
            }
        }

        bw.write(String.valueOf(total));
        bw.newLine();
        bw.write(String.valueOf(max));

        br.close();
        bw.close();

    }
}
