import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int money = Integer.parseInt(br.readLine());
            int[] arr = new int[4];

            if(money>=25){
                int cnt=money/25;
                money%=25;
                arr[0]=cnt;
            }
            if(money>=10) {
                int cnt=money/10;
                money%=10;
                arr[1]=cnt;

            }
            if (money>=5) {
                int cnt=money/5;
                money%=5;
                arr[2]=cnt;
            }
            if(money>=1){
                int cnt=money/1;
                money%=1;
                arr[3]=cnt;
            }

            for(int i=0; i<4; i++){
                bw.write(String.valueOf(arr[i]+" "));
            }
            bw.newLine();


        }

        br.close();
        bw.close();

    }

}
