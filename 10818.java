import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];

        st=new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        bw.write(arr[0]+" "+arr[n-1]);

        br.close();
        bw.close();
    }
}
