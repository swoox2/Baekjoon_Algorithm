import java.io.*;
import java.util.*;
public class Main {
    static int answer;
    public static int mySum(String s){
        int sum=0;
        String[] temp = s.split("[+]");
        for (int i = 0; i < temp.length; i++) {
            sum+=Integer.parseInt(temp[i]);
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sub=br.readLine().split("-");

        for (int i = 0; i < sub.length; i++) {
            int temp=mySum(sub[i]);
            if(i==0) answer+=temp;
            else answer-=temp;
        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }

}
