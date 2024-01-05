import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());

        String s=String.valueOf(n);

        ArrayList<Character> list=new ArrayList<>();

        for(int i=0; i<s.length(); i++) list.add(s.charAt(i));

        Collections.sort(list, Collections.reverseOrder());

        String answer="";
        for(int i=0; i<s.length(); i++) answer+=list.get(i);

        bw.write(answer);

        br.close();
        bw.close();
    }
}
