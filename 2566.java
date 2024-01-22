import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int max=Integer.MIN_VALUE;
        int row=0;
        int col=0;

        for(int i=0; i<9; i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                int n=Integer.parseInt(st.nextToken());

                if(max<n){
                    max=n;
                    row=i;
                    col=j;
                }
            }
        }

        System.out.println(max);
        System.out.println(row+1+" "+(col+1));

        br.close();
    }
}
