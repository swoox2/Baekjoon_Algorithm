import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
class People{
    int age;
    String name;

    People(int age, String name){
        this.age=age;
        this.name=name;
    }
}

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());

        ArrayList<People> list=new ArrayList<>();

        for(int i=0; i<n; i++){
            st=new StringTokenizer(br.readLine());
            list.add(new People(Integer.parseInt(st.nextToken()), st.nextToken()));
        }

        Collections.sort(list, (o1, o2) -> {
            return o1.age-o2.age;
        });

        for(People p : list){
            bw.write(p.age+" "+p.name);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
