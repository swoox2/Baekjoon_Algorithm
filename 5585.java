import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int money=1000-n;
        int cnt=0;
        while (money != 0) {
            if(money>=500){
                money-=500;
                cnt++;
            }else if(money>=100){
                money-=100;
                cnt++;
            }else if(money>=50){
                money-=50;
                cnt++;
            }else if(money>=10){
                money-=10;
                cnt++;
            }else if(money>=5){
                money-=5;
                cnt++;
            }else{
                money-=1;
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        br.close();
        bw.close();

    }

}
