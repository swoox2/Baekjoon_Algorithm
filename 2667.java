import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static int n;
    static final int MAX=25+10;
    static boolean[][] map;
    static boolean[][] visited;
    static int answer,count;
    static int[] c1={-1,0,1,0};
    static int[] c2={0,1,0,-1};
    static ArrayList<Integer> arr=new ArrayList<>();

    public static void dfs(int x, int y) {
        visited[x][y]=true;
        count++;

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
        n = Integer.parseInt(br.readLine());
        map=new boolean[MAX][MAX];
        visited=new boolean[MAX][MAX];

        for(int i=1; i<=n; i++){
            String str=br.readLine();
            for(int j=1; j<=n; j++){
                if(str.charAt(j-1)=='1') map[i][j]=true;
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(map[i][j] && visited[i][j]==false){
                    answer++;
                    dfs(i,j);
                    arr.add(count);
                    count=0;
                }
            }
        }

        bw.write(String.valueOf(answer));
        bw.newLine();

        Collections.sort(arr);

        for(int i=0; i<arr.size(); i++){
            bw.write(String.valueOf(arr.get(i)));
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}
