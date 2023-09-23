import java.io.*;
import java.util.*;
public class Main {
    static final int MAX=300+10;
    static int n,m,total,year;
    static int[][] map;
    static boolean[][] visited;
    static int[][] arr;
    static int[] c1={-1,0,1,0};
    static int[] c2={0,1,0,-1};

    public static void dfs(int x, int y) {
        visited[x][y]=true;

        int count=0;
        for(int i=0; i<4; i++){
            int new_x=x+c1[i];
            int new_y=y+c2[i];

            if(map[new_x][new_y]==0) count++;

            if(map[new_x][new_y]!=0 && visited[new_x][new_y]==false){
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
        map=new int[MAX][MAX];
        visited=new boolean[MAX][MAX];
        arr=new int[MAX][MAX];

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while(true){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=m; j++){
                    if(map[i][j]!=0 && visited[i][j]==false){
                        dfs(i,j);
                        total++;
                    }
                }
            }

            for(int i=1; i<=n; i++){
                for(int j=1; j<=m; j++){
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            year++;
            if(total>=2) break;
            total=0;
            visited=new boolean[MAX][MAX];

        }

        bw.write(String.valueOf(year));

        br.close();
        bw.close();
    }
}
