import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s=br.readLine();
        
        Stack<Character> stack=new Stack<>();

        int answer=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(') stack.push('(');
            else if(s.charAt(i)==')' && stack.isEmpty()){
                answer++;
            }else stack.pop();
        }

        answer+=stack.size();

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }
}
