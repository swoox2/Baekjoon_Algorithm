import java.io.*;
import java.util.*;

class Node{
    int x,y;
    Node(int x, int y){
        this.x=x;
        this.y=y;
    }
}

public class Main {
    static final int MAX=1000+10;
    static int n,m;
    static int[][] map;
    static Queue<Node> q = new LinkedList<>();
    static int[] c1={-1,0,1,0};
    static int[] c2={0,1,0,-1};
    public static void bfs(){

        while(!q.isEmpty()){
            Node current=q.poll();
            int x=current.x;
            int y=current.y;

            for(int i=0; i<4; i++){
                int nx=x+c1[i];
                int ny=y+c2[i];

                if(map[nx][ny]==0 && 1<=nx && nx<=n && 1<=ny && ny<=m){
                    q.offer(new Node(nx,ny));
                    map[nx][ny]=map[x][y]+1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken()); //가로
        n = Integer.parseInt(st.nextToken()); //세로

        map=new int[MAX][MAX];

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(map[i][j]==1) q.offer(new Node(i,j));
            }
        }

        bfs();

        int max=Integer.MIN_VALUE;
        String all_x="NO";
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                max=Math.max(max,map[i][j]);
                if(map[i][j]==0){
                    all_x="YES";
                }
            }
        }

        if(all_x=="YES") bw.write("-1");
        else if(max==1) bw.write("0");
        else bw.write(String.valueOf(max-1));

        br.close();
        bw.close();
    }
}
