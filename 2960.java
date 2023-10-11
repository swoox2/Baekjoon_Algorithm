import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=2; i<=n; i++) arr.add(i);

        int count=0;
        while (!arr.isEmpty()) {
            Collections.sort(arr);
            int min=arr.get(0);
            int val1=arr.remove(0);
            count++;

            if(count==k) bw.write(String.valueOf(val1));

            for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i)%min==0){
                    int val2=arr.remove(i);
                    count++;
                    if(count==k) bw.write(String.valueOf(val2));
                }
            }
        }

        br.close();
        bw.close();
    }

}
