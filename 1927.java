import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n= Integer.parseInt(br.readLine());

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
                int cur=pq.poll();
                bw.write(String.valueOf(cur));
                bw.newLine();
            }
        }


        br.close();
        bw.close();
    }
}
