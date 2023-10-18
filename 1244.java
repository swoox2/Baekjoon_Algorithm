import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());
        int[] s=new int[n+2];

        st=new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++) s[i]=Integer.parseInt(st.nextToken());

        int student_cnt=Integer.parseInt(br.readLine());

        for (int i=0; i<student_cnt; i++){
            st=new StringTokenizer(br.readLine());
            int gender=Integer.parseInt(st.nextToken());
            int num=Integer.parseInt(st.nextToken());

            if(gender==1){
                for(int j=1; j<=n; j++){
                    if(j%num==0){
                        if(s[j]==0) s[j]=1;
                        else s[j]=0;
                    }
                }
            }else{
                int left=num;
                int right=num;

                while(s[left]==s[right] && 1<=left && left<=n && 1<=right && right<=n){
                        left--;
                        right++;
                }

                for(int k=left+1; k<=right-1; k++){
                    if(s[k]==0) s[k]=1;
                    else s[k]=0;
                }

            }
        }

        for(int i=1; i<=n; i++){
            bw.write(s[i]+" ");
            if(i%20==0) bw.newLine();
        }

        br.close();
        bw.close();
    }
}
