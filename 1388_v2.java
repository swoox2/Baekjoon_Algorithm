import java.io.*;
import java.util.*;
public class Main {
    static final int MAX=50+10;
    static int n,m,answer;
    static char[][] map;

    public static void dfs(int x, int y){
        char c=map[x][y];
        map[x][y]=0;

        if(c=='-' && map[x][y+1]=='-') dfs(x,y+1);
        if(c=='|'&& map[x+1][y]=='|') dfs(x+1,y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map=new char[MAX][MAX];


        for(int i=1; i<=n; i++){
            String str=br.readLine();
            for(int j=1; j<=m; j++){
                map[i][j]=str.charAt(j-1);
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(map[i][j]!=0) {
                    dfs(i,j);
                    answer++;
                }
            }
        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();

    }
}
