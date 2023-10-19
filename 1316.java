import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());

        int cnt=0;
        for(int i=0; i<n; i++){
            String s=br.readLine();
            boolean[] check=new boolean[26];

            boolean word_continue=true;
            check[s.charAt(0)-'a']=true;

            if(s.length()==1) cnt++;
            else{
                for(int j=1; j<s.length(); j++){
                    int prev=j-1;

                    if(s.charAt(j)==s.charAt(prev)) continue;
                    else{
                        if(check[s.charAt(j)-'a']==false) check[s.charAt(j)-'a']=true;
                        else{
                            word_continue=false;
                            break;
                        }
                    }
                }
                if(word_continue) cnt++;
            }

        }

        bw.write(String.valueOf(cnt));

        br.close();
        bw.close();
    }
}
