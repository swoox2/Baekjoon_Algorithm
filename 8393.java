import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());
        
        int sum=0;
        for(int i=1; i<=n; i++) sum+=i;

        System.out.println(sum);

        br.close();
    }
}
