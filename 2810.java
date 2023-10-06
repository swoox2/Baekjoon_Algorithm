import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int cup=1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='S') cup++;
            else{
                cup++;
                i++;
            }
        }

        if(cup>n) bw.write(String.valueOf(n));
        else bw.write(String.valueOf(cup));

        br.close();
        bw.close();

    }

}
