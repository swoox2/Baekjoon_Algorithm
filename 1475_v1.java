import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        String str = br.readLine();
        map.put('6',0);

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='9') map.put('6', map.getOrDefault('6', 0) + 1);
            else map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        if(map.get('6')%2==0){
            map.put('6',map.get('6')/2);
        }else map.put('6',map.get('6')/2+1);

        for (Character key : map.keySet()) {
            arr.add(map.get(key));
        }

        Collections.sort(arr,Collections.reverseOrder());

        bw.write(String.valueOf(arr.get(0)));

        br.close();
        bw.close();
    }

}
