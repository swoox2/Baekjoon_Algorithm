import java.io.*;
import java.util.*;
public class Main {
    static final int MAX=50+10;
    static int w,h;
    static boolean[][] map;
    static int[] c1={-1,-1,0,1,1,1,0,-1};
    static int[] c2={0,1,1,1,0,-1,-1,-1};

    public static void dfs(int x, int y) {
        map[x][y]=false;
        for(int i=0; i<8; i++){
            int new_x=x+c1[i];
            int new_y=y+c2[i];
            if(map[new_x][new_y]==true){
                dfs(new_x,new_y);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            w=Integer.parseInt(st.nextToken());
            h=Integer.parseInt(st.nextToken());

            if(w==0 && h==0) break;

            map=new boolean[MAX][MAX];
            for(int i=1; i<=h; i++){
                st=new StringTokenizer(br.readLine());
                for(int j=1; j<=w; j++){
                    if(Integer.parseInt(st.nextToken())==1) map[i][j]=true;
                }
            }

            int answer=0;
            for(int i=1; i<=h; i++){
                for(int j=1; j<=w; j++){
                    if(map[i][j]){
                        answer++;
                        dfs(i,j);
                    }
                }
            }

            bw.write(String.valueOf(answer));
            bw.newLine();

        }
        br.close();
        bw.close();

    }
}
