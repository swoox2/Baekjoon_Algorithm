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
            String s = br.readLine();
            int index = s.indexOf('.');
            String str=s.substring(index+1);
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (String key : map.keySet()) {
            arr.add(key);
        }

        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {
            bw.write(arr.get(i)+" "+map.get(arr.get(i)));
            bw.newLine();
        }

        br.close();
        bw.close();

    }

}
