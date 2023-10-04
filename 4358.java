import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();

        String s;
        while((s=br.readLine())!=null){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        int total=0;
        for (String key : map.keySet()) {
            arr.add(key);
            total+=map.get(key);
        }

        Collections.sort(arr);

        for(int i=0; i<arr.size(); i++){
            String key=arr.get(i);
            bw.write(key+" ");
            int value=map.get(key);
            double answer=(double) value/total*100;
            bw.write(String.format("%.4f", answer));
            bw.newLine();
        }

        br.close();
        bw.close();

    }

}
