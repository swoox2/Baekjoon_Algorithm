import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> name = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=0; i<n+m; i++){
            String key = br.readLine();

            map.put(key,map.getOrDefault(key,0)+1);
        }

        for(String key : map.keySet()){
            if(map.get(key)==2) name.add(key);
        }

        Collections.sort(name);

        bw.write(String.valueOf(name.size()));
        bw.newLine();
        for(int i=0; i<name.size(); i++){
            bw.write(name.get(i));
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}
