import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();

        int n=Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            StringTokenizer st=new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String state = st.nextToken();

            map.put(name,state);
        }

        for (String key : map.keySet()) {
            if(map.get(key).equals("enter")) arr.add(key);
        }

        Collections.sort(arr,Collections.reverseOrder());

        for(int i=0; i<arr.size(); i++){
            bw.write(arr.get(i));
            bw.newLine();
        }

        br.close();
        bw.close();

    }

}
