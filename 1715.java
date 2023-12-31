import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        int n=Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }

        int answer=0;
        while(pq.size()!=1){
            int first=pq.poll();
            int second=pq.poll();

            answer+=first+second;
            pq.add(first+second);
        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }
}
