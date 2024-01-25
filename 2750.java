import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];

        for(int i=0; i<n; i++){
            int x=Integer.parseInt(br.readLine());
            arr[i]=x;
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

        br.close();
    }
}
