import java.io.*;
import java.util.*;
public class Main {
    static class Node{
        int idx,order;

        Node(int idx, int order ) {
            this.idx=idx;
            this.order=order;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Node> q = new LinkedList<>();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                q.offer(new Node(i,x));
            }

            int count=0;
            while (!q.isEmpty()) {
                Node cur=q.poll();
                boolean isMax=true;

                for (Node node : q) {
                    if (node.order > cur.order) {
                        isMax=false;
                        break;
                    }
                }

                if(isMax){
                    count++;
                    if(cur.idx==m) break;
                }else{
                    q.offer(cur);
                }
            }
            q.clear();

            bw.write(String.valueOf(count));
            bw.newLine();

        }

        br.close();
        bw.close();
    }

}
