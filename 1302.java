import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();


        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String key = br.readLine();

            map.put(key,map.getOrDefault(key,0)+1);
        }

        int max=0;
        for (String key : map.keySet()) {
            max=Math.max(max, map.get(key));
        }

        for(String key : map.keySet()){
            if(map.get(key)==max) arr.add(key);
        }

        Collections.sort(arr);

        bw.write(String.valueOf(arr.get(0)));

        br.close();
        bw.close();

    }

}
