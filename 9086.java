import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String s=br.readLine();

            System.out.println(s.substring(0,1)+s.substring(s.length()-1));
        }



        br.close();
    }
}
