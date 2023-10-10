import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for(int i=1; i<=n; i++) q.offer(i);

        while (!q.isEmpty()) {

            for (int i = 0; i < k-1; i++) {
                int x = q.poll();
                q.offer(x);
            }
            arr.add(q.poll());
        }

        bw.write("<");
        for(int i=0; i<arr.size(); i++){
            if(i!=arr.size()-1) bw.write(arr.get(i)+", ");
            else bw.write(arr.get(i)+">");
        }

        br.close();
        bw.close();
    }

}
