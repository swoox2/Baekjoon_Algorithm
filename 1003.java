import java.io.*;
import java.util.*;
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int t=Integer.parseInt(br.readLine());
        int[] dp_zero=new int[41];
        int[] dp_one=new int[41];

        dp_zero[0]=1;
        dp_one[0]=0;
        dp_zero[1]=0;
        dp_one[1]=1;

        for(int i=2; i<=40; i++){
            dp_zero[i]=dp_zero[i-1]+dp_zero[i-2];
            dp_one[i]=dp_one[i-1]+dp_one[i-2];
        }

        while(t-- >0){
            int n=Integer.parseInt(br.readLine());

            bw.write(dp_zero[n]+" "+dp_one[n]);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
