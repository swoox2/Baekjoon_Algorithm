import java.io.*;
import java.util.*;

public class Main{
    public static void reverse(String s){
        String[] arr=s.split(" ");

        for(int i=0; i<arr.length; i++){
            String str="";

            for(int j= arr[i].length()-1; j>=0; j--){
                str+=arr[i].charAt(j);
            }

            System.out.print(str+" ");
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t=Integer.parseInt(br.readLine());

        while(t-- >0){
            reverse(br.readLine());
            System.out.println();
        }

        br.close();
    }
}
