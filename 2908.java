import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st=new StringTokenizer(br.readLine());

        String a=st.nextToken();
        String b=st.nextToken();

        String na="";
        String nb="";

        for(int i=2; i>=0; i--){
            na+=a.charAt(i);
            nb+=b.charAt(i);
        }

        int numA=Integer.parseInt(na);
        int numB=Integer.parseInt(nb);

        if(numA>numB) System.out.println(numA);
        else System.out.println(numB);

        br.close();
    }
}
