import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();

        String str = br.readLine();

        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                map.put(str.substring(i,j),0);
            }
        }

        bw.write(String.valueOf(map.size()));

        br.close();
        bw.close();

    }

}
