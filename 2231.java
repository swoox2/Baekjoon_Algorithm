import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String answer="";
        for (int i = 1; i <= 1000000; i++) {
            int sum=i;
            String s=String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                sum+=s.charAt(j)-'0';
            }

            if(sum==n) {
                answer=s;
                bw.write(answer);
                break;
            }
        }

        if(answer.equals("")) bw.write("0");

        br.close();
        bw.close();
    }

}
