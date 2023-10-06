import java.io.*;
import java.util.*;
class Node implements Comparable<Node>{
    int x,y;

    Node(int x, int y){
       this.x=x;
       this.y=y;
    }
    @Override
    public int compareTo(Node o){
        if(this.y==o.y) return this.x-o.x;
        else return this.y-o.y;
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Node> arr = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr.add(new Node(x,y));
        }

        Collections.sort(arr);

        int cnt=1;
        Node target=arr.get(0);
        for(int i=1; i<n; i++){
            if(target.y<=arr.get(i).x){
                cnt++;
                target=arr.get(i);
            }
        }

        bw.write(String.valueOf(cnt));

        br.close();
        bw.close();

    }

}
