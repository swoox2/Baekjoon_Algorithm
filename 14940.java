import java.io.*;
import java.util.*;

class Node {
    int x,y;

    Node(int x, int y){
        this.x=x;
        this.y=y;
    }
}

public class Main {
    static final int MAX=1000+100;
    static int n,m,x,y;
    static int[][] map;
    static int[][] answer;
    static boolean[][] visited;
    static Queue<Node> q = new LinkedList<>();

    static int[] c1 = {-1, 0, 1, 0};
    static int[] c2 = {0, 1, 0, -1};

    public static void bfs(int x, int y) {
        q.offer(new Node(x,y));
        visited[x][y]=true;

        while (!q.isEmpty()) {
            int size = q.size();

            for(int i=0; i<size; i++){
                Node cur = q.poll();

                for(int j=0; j<4; j++){
                    int nx=cur.x+c1[j];
                    int ny=cur.y+c2[j];

                    if(map[nx][ny]==1 && !visited[nx][ny]){
                        visited[nx][ny]=true;
                        answer[nx][ny]=answer[cur.x][cur.y]+1;
                        q.offer(new Node(nx,ny));
                    }
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); //세로
        m = Integer.parseInt(st.nextToken()); //가로

        map=new int[MAX][MAX];
        visited=new boolean[MAX][MAX];
        answer=new int[MAX][MAX];

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==2){
                    x=i;
                    y=j;
                }
            }
        }

        bfs(x,y);

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(!visited[i][j] && map[i][j]!=0) answer[i][j]=-1;
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                bw.write(String.valueOf(answer[i][j]+" "));
            }
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
