import java.io.*;
import java.util.*;

public class Main {
    static final int MAX=3+100;
    static int n;
    static int[][] map;
    static String answer="Hing";

    public static void dfs(int x, int y){
        if(map[x][y]==-1){
            answer="HaruHaru";
            return;
        }
        int next=map[x][y];
        if(map[x][y+next]!=0) dfs(x,y+next);
        if(map[x+next][y]!=0) dfs(x+next,y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n=Integer.parseInt(br.readLine());
        map=new int[MAX][MAX];

        for(int i=1; i<=n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(1,1);

        bw.write(answer);

        br.close();
        bw.close();

    }
}
