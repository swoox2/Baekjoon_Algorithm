import java.io.*;
import java.util.*;

public class Main {
    static final int MAX=100+10;
    static int m,n,k,total,count;
    static int[][] map;
    static ArrayList<Integer> arr = new ArrayList<>();
    static int[] c1={-1,0,1,0};
    static int[] c2={0,1,0,-1};

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
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        map=new int[MAX][MAX];

        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int a=m-y2; a<m-y1; a++){
                for(int b=x1; b<x2; b++){
                    map[a+1][b+1]=1;
                }
            }
        }

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(map[i][j]==1) map[i][j]=0;
                else map[i][j]=1;
            }
        }

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(map[i][j]==1){
                    dfs(i,j);
                    total++;
                    arr.add(count);
                    count=0;
                }
            }
        }

        bw.write(String.valueOf(total));
        bw.newLine();
        Collections.sort(arr);
        for(int i=0; i<arr.size(); i++){
            bw.write(String.valueOf(arr.get(i)+" "));
        }

        br.close();
        bw.close();


    }
}
