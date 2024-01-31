import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Deque<Integer> deque=new ArrayDeque<>();

        int n=Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            st=new StringTokenizer(br.readLine());

            String s=st.nextToken();

            switch(s){
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if(deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.pollFirst());
                    break;
                case "pop_back":
                    if(deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.pollLast());
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    if(deque.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "front":
                    if(deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.getFirst());
                    break;
                case "back":
                    if(deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.getLast());
                    break;
            }
        }

        br.close();
    }
}
