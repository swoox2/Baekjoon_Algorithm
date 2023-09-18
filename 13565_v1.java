import java.io.*;
import java.util.*;
public class Main {
    static final int MAX=1000+10;
    static int m,n;
    static boolean map[][];
    static boolean visited[][];
    static int[] c1={1,0,-1,0};
    static int[] c2={0,1,0,-1};
    static boolean answer;

    static public void dfs(int x, int y){
        if(x==m){
            answer=true;
            return;
        }
        visited[x][y]=true;
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

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        map=new boolean[MAX][MAX];
        visited=new boolean[MAX][MAX];

        for (int i=1; i<=m; i++){
            String str=br.readLine();
            for(int j=1; j<=n; j++){
                if(str.charAt(j-1)=='0'){
                    map[i][j]=true;
                }
            }
        }

        for(int i=1; i<=n; i++){
            if(map[1][i] && visited[1][i]==false) dfs(1,i);
        }

        if(answer) bw.write("YES");
        else bw.write("NO");

        br.close();
        bw.close();
    }
}
