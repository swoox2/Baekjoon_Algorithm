import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            int key = Integer.parseInt(st.nextToken());
            hashMap.put(key,hashMap.getOrDefault(key,0)+1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<m; i++){
            int key = Integer.parseInt(st.nextToken());

            if(hashMap.get(key)==null) bw.write("0"+" ");
            else bw.write(String.valueOf(hashMap.get(key)+" "));
        }

        br.close();
        bw.close();

    }
}
