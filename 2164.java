import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());

        Queue<Integer> q=new LinkedList<>();

        for(int i=1; i<=n; i++) q.add(i);

        while(q.size()!=1){
            q.poll();
            q.add(q.poll());
        }

        bw.write(String.valueOf(q.poll()));

        br.close();
        bw.close();
    }
}
