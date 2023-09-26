import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            String answer="";
            for(int i=0; i<s.length(); i++){
                for(int j=0; j<r; j++){
                    answer+=s.charAt(i);
                }
            }
            bw.write(answer);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
