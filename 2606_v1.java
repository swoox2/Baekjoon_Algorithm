import java.util.*;
public class Main {
    static int[][] graph;
    static int ch[];
    static int com,l,answer=0;

    public void DFS(int n){
            for(int i=1; i<=com; i++){
                if(ch[i]==0 && graph[n][i]==1){
                    ch[i]=1;
                    DFS(i);
                }
            }

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scan =new Scanner(System.in);
        com = scan.nextInt();
        l = scan.nextInt();
        graph = new int[com+1][com+1];
        for(int i=0; i<l; i++){
            int index1 = scan.nextInt();
            int index2 = scan.nextInt();
            graph[index1][index2]=1;
            graph[index2][index1]=1;
        }
        ch = new int[com+1];
        ch[1]=1;
        T.DFS(1);
        for(int i=2; i<=com; i++){
            if(ch[i]==1) answer++;
        }
        System.out.println(answer);

    }

}
