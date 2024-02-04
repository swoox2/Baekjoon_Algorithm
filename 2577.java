import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());

        String s=String.valueOf(a*b*c);

        int[] arr=new int[10];

        for(int i=0; i<s.length(); i++){
            arr[Integer.parseInt(s.substring(i,i+1))]++;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


        br.close();
    }
}
