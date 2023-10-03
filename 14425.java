import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] str=new String[n];

        for (int i = 0; i < n; i++) str[i] = br.readLine();

        for(int i=0; i<m; i++){
            String key = br.readLine();

            map.put(key,map.getOrDefault(key,0)+1);
        }
        int answer=0;
        for(int i=0; i<n; i++){
            if(map.get(str[i])!=null) answer+=map.get(str[i]);
        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();

    }

}
