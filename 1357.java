import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st=new StringTokenizer(br.readLine());

        String x=st.nextToken();
        String y=st.nextToken();

        String nx="";
        String ny="";

        for(int i=x.length()-1; i>=0; i--){
            nx+=x.charAt(i);
        }

        for(int i=y.length()-1; i>=0; i--){
            ny+=y.charAt(i);
        }

        int numX=Integer.parseInt(nx);
        int numY=Integer.parseInt(ny);

        int sum=numX+numY;

        String strSum=String.valueOf(sum);

        String answer="";
        for(int i=strSum.length()-1; i>=0; i--){
            answer+=strSum.charAt(i);
        }

        System.out.println(Integer.parseInt(answer));

        br.close();
    }
}
