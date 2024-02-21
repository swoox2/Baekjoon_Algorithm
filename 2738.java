import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        int[][] arrA=new int[n][m];
        int[][] arrB=new int[n][m];

        for(int i=0; i<n; i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arrA[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n; i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arrB[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arrA[i][j]+arrB[i][j]+" ");
            }
            System.out.println();
        }

        br.close();
    }
}
