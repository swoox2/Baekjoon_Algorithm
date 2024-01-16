import java.io.*;
import java.util.*;
class graph{
    int x,y;
    graph(int x, int y){
        this.x=x;
        this.y=y;
    }
}

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());

        ArrayList<graph> list=new ArrayList<>();

        for(int i=0; i<n; i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());

            list.add(new graph(x,y));
        }

        Collections.sort(list, (o1,o2)->{
            if(o1.y==o2.y) return o1.x-o2.x;
            else return o1.y-o2.y;
        });

        for(graph g : list){
            System.out.println(g.x+" "+g.y);
        }

        br.close();
    }
}
