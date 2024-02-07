import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st=new StringTokenizer(br.readLine());

        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());

        if(a==b && b==c) System.out.println(10000+a*1000);
        else if(a!=b && b!=c && a!=c){
            int max=Math.max(a,b);
            max=Math.max(max,c);
            System.out.println(max*100);
        }else{
            int equal=0;
            
            if(a==b) equal=a;
            else if(b==c) equal=b;
            else equal=c;

            System.out.println(1000+equal*100);
        }

        br.close();
    }
}
