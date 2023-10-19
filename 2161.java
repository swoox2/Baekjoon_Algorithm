import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=1; i<=n; i++) q.add(i);

        while(q.size()!=1){
            arr.add(q.poll());
            q.add(q.poll());
        }

        for(int x : arr) bw.write(String.valueOf(x+" "));
        
        bw.write(String.valueOf(q.poll()));

        br.close();
        bw.close();
    }
}
