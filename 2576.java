import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        ArrayList<Integer> list=new ArrayList<>();

        int sum=0;
        for(int i=0; i<7; i++){
            int num=Integer.parseInt(br.readLine());

            if(num%2!=0){
                list.add(num);
                sum+=num;
            }
        }

        Collections.sort(list);

        if(sum==0) System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(list.get(0));
        }


        br.close();
    }
}
