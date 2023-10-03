import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> strMap = new HashMap<>();
        HashMap<Integer, String> intMap = new HashMap<>();

        int n = Integer.parseInt(st.nextToken()); //포켓몬의 개수
        int m = Integer.parseInt(st.nextToken()); //내가 맞춰야 하는 문제의 개수

        for(int i=1; i<=n; i++){
            String key = br.readLine();

            strMap.put(key,i);
            intMap.put(i,key);
        }

        for(int i=0; i<m; i++){
            String s = br.readLine();
            if(isnum(s)){
                bw.write(String.valueOf(intMap.get(Integer.parseInt(s))));
                bw.newLine();
            }else{
                bw.write(String.valueOf(strMap.get(s)));
                bw.newLine();
            }
        }

        br.close();
        bw.close();

    }
    public static boolean isnum(String str){
        for(int i=0; i<str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
