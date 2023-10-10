import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int[] arr=new int[10];

        for (int i = 0; i < s.length(); i++) {
            int x=s.charAt(i)-'0';

            if(x==9) arr[6]++;
            else arr[x]++;
        }

        if(arr[6]%2==0) arr[6]/=2;
        else arr[6]=(arr[6]/2)+1;

        Arrays.sort(arr);

        bw.write(String.valueOf(arr[9]));

        br.close();
        bw.close();
    }

}
