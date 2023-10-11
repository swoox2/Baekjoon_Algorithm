import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        boolean check[]=new boolean[21];

        while (m-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s){
                case "add":
                    int a = Integer.parseInt(st.nextToken());
                    check[a] = true;
                    break;
                case "remove":
                    int r = Integer.parseInt(st.nextToken());
                    check[r]=false;
                    break;
                case "check":
                    int c = Integer.parseInt(st.nextToken());
                    if(check[c]){
                        bw.write("1");
                        bw.newLine();
                    }
                    else{
                        bw.write("0");
                        bw.newLine();
                    }
                    break;
                case "toggle":
                    int t = Integer.parseInt(st.nextToken());
                    if(check[t]) check[t]=false;
                    else check[t]=true;
                    break;
                case "all":
                    for(int i=1; i<=20; i++) check[i]=true;
                    break;
                case "empty":
                    for(int i=1; i<=20; i++) check[i]=false;
                    break;
            }

        }

        br.close();
        bw.close();
    }

}
