import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[] arr=new int[3];

            if(t>=300){
                int cnt=t/300;
                t%=300;
                arr[0]=cnt;
            }
            if(t>=60){
                int cnt=t/60;
                t%=60;
                arr[1]=cnt;
            }
            if(t>=10){
                int cnt=t/10;
                t%=10;
                arr[2]=cnt;
            }

        if(t!=0) bw.write("-1");
        else if(t==0){
            for(int i=0; i<3; i++){
                bw.write(arr[i]+" ");
            }
        }

        br.close();
        bw.close();

    }

}
