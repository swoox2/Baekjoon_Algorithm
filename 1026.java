import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        Integer[] b = new Integer[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(b,Collections.reverseOrder());

        int answer=0;
        for(int i=0; i<n; i++) answer+=a[i]*b[i];

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();

    }

}
