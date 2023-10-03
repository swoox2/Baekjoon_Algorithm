import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<>();
        
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) arr.add(Integer.parseInt(br.readLine()));

        Collections.sort(arr,Collections.reverseOrder());

        for(int i=0; i<n; i++){
            bw.write(String.valueOf(arr.get(i)));
            bw.newLine();
        }

        br.close();
        bw.close();

    }

}
