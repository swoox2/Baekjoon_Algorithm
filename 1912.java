import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        int[] dp=new int[n];

        st=new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());

        dp[0]=arr[0];
        for(int i=1; i<n; i++){
            dp[i]=Math.max(dp[i-1]+arr[i], arr[i]);
        }

        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max=Math.max(max,dp[i]);
        }

        bw.write(String.valueOf(max));

        br.close();
        bw.close();
    }
}
