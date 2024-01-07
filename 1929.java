import java.io.*;
import java.util.*;

public class Main{

    public static boolean isPrime(int num){
        if(num==1) return false;

        int lim=(int)Math.sqrt(num);

        for(int i=2; i<=lim; i++){
            if(num%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i=m; i<=n; i++){
            if(isPrime(i)){
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        br.close();
        bw.close();
    }
}
