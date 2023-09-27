import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();

        s=s.toUpperCase();

        int[] a=new int[26];

        for (int i=0; i<s.length(); i++){
            a[s.charAt(i)-'A']++;
        }

        int max=0;
        for(int i=0; i<a.length; i++){
            max=Math.max(max,a[i]);
        }

        int count=0;
        for(int i=0; i<a.length; i++){
            if (max==a[i]) count++;
        }

        if(count>1) bw.write("?");
        else {
            for(int i=0; i<a.length; i++){
                if(a[i]==max){
                    bw.write(i+'A');
                    break;
                }
            }
        }

        br.close();
        bw.close();
    }
}
