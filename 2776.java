import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> map = new HashMap<>();

        int t = Integer.parseInt(br.readLine());

        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                int key = Integer.parseInt(st.nextToken());

                map.put(key,0);

            }
            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<m; i++){
                int key = Integer.parseInt(st.nextToken());

                if(map.containsKey(key)){
                    bw.write("1");
                    bw.newLine();
                }else{
                    bw.write("0");
                    bw.newLine();
                }
            }
            map.clear();
        }

        br.close();
        bw.close();

    }

}
