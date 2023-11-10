import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s=br.readLine();
        int zero_cnt=0;
        int one_cnt=0;

        for(int i=0; i<s.length(); i++){
            if(i==0){
                if(s.substring(0,1).equals("0")) zero_cnt++;
                else one_cnt++;
            }else{
                if(s.substring(i,i+1).equals(s.substring(i-1,i))) continue;
                else{
                    if(s.substring(i,i+1).equals("0")) zero_cnt++;
                    else one_cnt++;
                }
            }
        }

        int min=Math.min(zero_cnt, one_cnt);

        bw.write(String.valueOf(min));

        br.close();
        bw.close();


    }
}
