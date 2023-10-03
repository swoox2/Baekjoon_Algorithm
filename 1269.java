import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arra = new int[a];
        int[] arrb = new int[b];
        int answer=0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) arra[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) arrb[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<a; i++){
            map.put(arra[i],map.getOrDefault(arra[i],0)+1);
        }

        for(int i=0; i<b; i++){
            if(map.containsKey(arrb[i])){
                map.remove(arrb[i]);
            }
        }

        answer+=map.size();

        map.clear();

        for(int i=0; i<b; i++){
            map.put(arrb[i],map.getOrDefault(arrb[i],0)+1);
        }

        for(int i=0; i<a; i++){
            if(map.containsKey(arra[i])){
                map.remove(arra[i]);
            }
        }

        answer+=map.size();

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();

    }

}
