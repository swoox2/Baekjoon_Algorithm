import java.io.*;
import java.util.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());
        int[][] matrix=new int[n+1][n+1];
        int[][] dp=new int[n+1][n+1];

        for(int i=0; i<n; i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0; j<=i; j++){
                matrix[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0]=matrix[0][0];

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                dp[i+1][j]=Math.max(dp[i+1][j], dp[i][j]+matrix[i+1][j]);
                dp[i+1][j+1]=Math.max(dp[i+1][j+1],dp[i][j]+matrix[i+1][j+1]);
            }
        }

        int max=0;
        for(int i=0; i<n; i++){
            max=Math.max(max,dp[n-1][i]);
        }

        bw.write(String.valueOf(max));

        br.close();
        bw.close();
    }
}
