import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();

        int t = Integer.parseInt(br.readLine());

        while(t-- >0){
            int n = Integer.parseInt(br.readLine());

            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String key=st.nextToken();

                map.put(key, map.getOrDefault(key,0)+1);
            }

            int answer=1;
            for (String key : map.keySet()) {
                answer*=(map.get(key)+1);
            }

            map.clear();

            if(n==0){
                bw.write("0");
                bw.newLine();
            }else{
                bw.write(String.valueOf(answer-1));
                bw.newLine();
            }

        }

        br.close();
        bw.close();

    }

}
