import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n+1];
        int[] dp=new int[n+1];

        st=new StringTokenizer(br.readLine());

        for(int i=1; i<=n; i++) arr[i]=Integer.parseInt(st.nextToken());

        for(int i=1; i<=n; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[i]>arr[j]) dp[i]=Math.max(dp[i],dp[j]);
            }
            dp[i]++;
        }

        int max=0;
        for(int i=0; i<=n; i++) max=Math.max(max,dp[i]);

        bw.write(String.valueOf(max));

        br.close();
        bw.close();
    }
}
