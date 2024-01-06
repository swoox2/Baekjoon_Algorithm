import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());

        HashSet<String> set=new HashSet();

        for(int i=0; i<n; i++) set.add(br.readLine());

        ArrayList<String> list=new ArrayList<>();

        for(String s : set) list.add(s);

        Collections.sort(list, (o1, o2)->{
            if(o1.length()==o2.length()) return o1.compareTo(o2);
            else return o1.length()-o2.length();
        });

        for(String s : list){
            bw.write(s);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
