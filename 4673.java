import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] self=new boolean[100000+100];

        for (int i = 1; i <= 10000; i++) {

            int sum=i;
            String s=String.valueOf(i);

            for (int j = 0; j < s.length(); j++) {
                sum+=s.charAt(j)-'0';
            }

            self[sum]=true;
        }

        for(int i=1; i<=10000; i++){
            if(!self[i]){
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        br.close();
        bw.close();
    }

}
