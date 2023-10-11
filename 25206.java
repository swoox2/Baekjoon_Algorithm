import java.io.*;
import java.util.*;
public class test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int sum=0;
        double total=0;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double score = Double.parseDouble(st.nextToken()); //학점
            String s = st.nextToken(); //등급
            if(s.equals("P"));
            else sum+=score;

            if(s.equals("A+")) total+=score*4.5;
            if(s.equals("A0")) total+=score*4.0;
            if(s.equals("B+")) total+=score*3.5;
            if(s.equals("B0")) total+=score*3.0;
            if(s.equals("C+")) total+=score*2.5;
            if(s.equals("C0")) total+=score*2.0;
            if(s.equals("D+")) total+=score*1.5;
            if(s.equals("D0")) total+=score*1.0;

        }

        bw.write(String.valueOf(total/sum));

        br.close();
        bw.close();
    }

}
