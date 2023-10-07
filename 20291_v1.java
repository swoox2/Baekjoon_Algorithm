import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str=br.readLine();

            boolean file=false;
            String s="";
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)=='.'){
                    file=true;
                    continue;
                }
                if(file){
                    s+=str.charAt(j);
                }
            }
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for (String key : map.keySet()) {
            arr.add(key);
        }

        Collections.sort(arr);

        for(int i=0; i<arr.size(); i++){
            bw.write(String.valueOf(arr.get(i)+" "+map.get(arr.get(i))));
            bw.newLine();
        }

        br.close();
        bw.close();

    }

}
