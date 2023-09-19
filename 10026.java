import java.io.*;
import java.util.*;
public class Main {

    static final int MAX=100+10;
    static int n;
    static char[][] map;
    static boolean[][] visited;
    static int[] c1={-1,0,1,0};
    static int[] c2={0,1,0,-1};
    static int answer1, answer2;

    public static void dfs(int x, int y) {
        visited[x][y]=true;

        for(int i=0; i<4; i++){
            int new_x=x+c1[i];
            int new_y=y+c2[i];
            if(map[x][y]==map[new_x][new_y] && visited[new_x][new_y]==false){
                dfs(new_x, new_y);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        n=Integer.parseInt(br.readLine());
        map=new char[MAX][MAX];
        visited=new boolean[MAX][MAX];

        for(int i=1; i<=n; i++){
            String str=br.readLine();
            for(int j=1; j<=n; j++){
                map[i][j]=str.charAt(j-1);
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(visited[i][j]==false){
                    dfs(i,j);
                    answer1++;
                }

            }
        }

        visited=new boolean[MAX][MAX];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(map[i][j]=='G') map[i][j]='R';
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(visited[i][j]==false){
                    dfs(i,j);
                    answer2++;
                }

            }
        }

        bw.write(String.valueOf(answer1+" "));
        bw.write(String.valueOf(answer2));

        br.close();
        bw.close();

    }
}
