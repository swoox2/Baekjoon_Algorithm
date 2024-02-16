import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashMap<String, Integer> map=new HashMap<>();

        map.put("black",0);
        map.put("brown",1);
        map.put("red",2);
        map.put("orange",3);
        map.put("yellow",4);
        map.put("green",5);
        map.put("blue",6);
        map.put("violet",7);
        map.put("grey",8);
        map.put("white",9);

        String str="";
        long val=0;

        for(int i=0; i<3; i++){
            String s=br.readLine();

            if(i==2){
                val=Integer.parseInt(str);
                val*=(long)Math.pow(10,map.get(s));
            }else{
                str+=String.valueOf(map.get(s));
            }
        }

        System.out.println(val);

        br.close();
    }
}
