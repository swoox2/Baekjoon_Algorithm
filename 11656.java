import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String s=br.readLine();
        ArrayList<String> list=new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            list.add(s.substring(i));
        }

        Collections.sort(list);

        for(String str : list){
            bw.write(str);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
