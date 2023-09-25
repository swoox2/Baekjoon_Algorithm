import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        while(n-- >0){
            int sum=0;
            String str = br.readLine();

            int count=0;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)=='O'){
                    count++;
                    sum+=count;
                }else count=0;
            }

            bw.write(String.valueOf(sum));
            bw.newLine();
        }


        br.close();
        bw.close();
    }
}
