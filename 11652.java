import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Long, Integer> map = new HashMap<>();
        ArrayList<Long> arr = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            long num = Long.parseLong(br.readLine());

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max=0;
        for (long key : map.keySet()) {
            max=Math.max(max,map.get(key));
        }

        for (long key : map.keySet()) {
            if(map.get(key)==max) arr.add(key);
        }

        Collections.sort(arr);

        bw.write(String.valueOf(arr.get(0)));

        br.close();
        bw.close();

    }

}
