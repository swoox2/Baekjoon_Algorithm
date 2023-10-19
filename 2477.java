import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int k=Integer.parseInt(br.readLine()); //참외
        int[] arr=new int[6];

        int max_height=0;
        int max_width=0;
        for(int i=0; i<6; i++){
            st=new StringTokenizer(br.readLine());
            int dir=Integer.parseInt(st.nextToken());
            int len=Integer.parseInt(st.nextToken());

            if(dir==1 || dir==2) max_height=Math.max(max_height,len);
            if(dir==3 || dir==4) max_width=Math.max(max_width,len);

            arr[i]=len;
        }

        int total=0;
        for(int i=0; i<6; i++){
            if(i==5) total+=arr[i]*arr[0];
            else total+=arr[i]*arr[i+1];
        }

        int sub=max_height*max_width*3 - total;

        bw.write(String.valueOf((max_height*max_width-sub)*k));

        br.close();
        bw.close();
    }
}
