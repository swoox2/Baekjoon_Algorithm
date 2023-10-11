import java.io.*;
import java.util.*;
public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int answer=0;
        int count=1;
        int x=10;
        for (int i = 1; i <= n; i++) {

            if(i%x==0){
                count++;
                x*=10;

            }
            answer+=count;
        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }

}
