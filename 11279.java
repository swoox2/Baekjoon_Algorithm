import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            int x=Integer.parseInt(br.readLine());

            if(x!=0){
                pq.add(x);
                continue;
            }

            if(pq.isEmpty()){
                bw.write("0");
                bw.newLine();
            }else{
                int out=pq.poll();
                bw.write(String.valueOf(out));
                bw.newLine();
            }
        }


        br.close();
        bw.close();
    }
}
