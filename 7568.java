import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] weight = new int[n];
        int[] height = new int[n];
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int count=0;
            for (int j = 0; j < n; j++) {
                if (weight[i] < weight[j] && height[i] < height[j]) {
                    count++;
                }
            }
            answer[i]=count;
        }

        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(answer[i]+1)+" ");
        }

        br.close();
        bw.close();
    }

}
