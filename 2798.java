import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr=new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    array.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }

        Collections.sort(array, Collections.reverseOrder());

        int answer=0;
        for(int x : array){
            if(x <= m){
                answer=x;
                break;
            }
        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }

}
