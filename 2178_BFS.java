import java.io.*;
import java.util.*;

class Node {
    int x, y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static final int MAX = 100 + 10;
    static int n, m;
    static Queue<Node> q = new LinkedList<>();
    static int[][] map;
    static boolean[][] visited;
    static int[] c1 = {-1, 0, 1, 0};
    static int[] c2 = {0, 1, 0, -1};

    public static void bfs() {
        while (!q.isEmpty()) {
            Node current = q.poll();
            int x = current.x;
            int y = current.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + c1[i];
                int ny = y + c2[i];

                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        q.offer(new Node(nx, ny));
                        visited[nx][ny] = true;
                        map[nx][ny] = map[x][y] + 1;
                    }

            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[MAX][MAX];
        visited = new boolean[MAX][MAX];

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            for (int j = 1; j <= m; j++) {
                map[i][j] = str.charAt(j - 1) - '0';
            }
        }

        q.offer(new Node(1, 1));
        visited[1][1] = true;

        bfs();

        int min = map[n][m];
        bw.write(String.valueOf(min));

        br.close();
        bw.close();
    }
}
