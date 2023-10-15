import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());
        int cnt=0;

        int num=n;
        while(true){

            if(num<10){
                num=num*10+num;
            }else{
                int f=num/10;
                int s=num%10;

                num=s*10+(f+s)%10;
            }
            cnt++;

            if(num==n) break;
        }


        bw.write(String.valueOf(cnt));

        br.close();
        bw.close();
    }
}
