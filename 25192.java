import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        int answer=0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if(!str.equals("ENTER")){
                map.put(str,1);
            }

            if(str.equals("ENTER")){
                answer+= map.size();
                map.clear();
            }
        }
        answer+=map.size();

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();

    }

}
