import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int t=Integer.parseInt(br.readLine());
        int[][] matrix;

        while (t-- >0){
            int k=Integer.parseInt(br.readLine());
            int n=Integer.parseInt(br.readLine());

            matrix=new int[k+1][n];

            int cnt=1;
            for(int i=0; i<n; i++) matrix[0][i]=cnt++;

            for(int i=1; i<=k; i++){
                for(int j=0; j<n; j++){
                    for(int l=0; l<=j; l++){
                        matrix[i][j]+=matrix[i-1][l];
                    }
                }
            }

            bw.write(String.valueOf(matrix[k][n-1]));
            bw.newLine();

        }

        br.close();
        bw.close();
    }
}
