import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int answer=0;
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)=='c' && i<s.length()-1){
                if(s.charAt(i+1)=='=' || s.charAt(i+1)=='-'){
                    answer++;
                    i++;
                    continue;
                }
            }

            if(s.charAt(i)=='d'){
                if(i<s.length()-2 && s.charAt(i+1)=='z' && s.charAt(i+2)=='='){
                    answer++;
                    i+=2;
                    continue;
                }else if(i<s.length()-1 && s.charAt(i+1)=='-'){
                    answer++;
                    i++;
                    continue;
                }
            }

            if(s.charAt(i)=='l' && i<s.length()-1){
                if(s.charAt(i+1)=='j'){
                    answer++;
                    i++;
                    continue;
                }
            }

            if(s.charAt(i)=='n' && i<s.length()-1){
                if(s.charAt(i+1)=='j'){
                    answer++;
                    i++;
                    continue;
                }
            }

            if(s.charAt(i)=='s' && i<s.length()-1){
                if(s.charAt(i+1)=='='){
                    answer++;
                    i++;
                    continue;
                }
            }

            if(s.charAt(i)=='z' && i<s.length()-1){
                if(s.charAt(i+1)=='='){
                    answer++;
                    i++;
                    continue;
                }
            }

            answer++;
        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }

}
