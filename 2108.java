import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            arr.add(x);
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int total=0;
        for(int x : arr) total+=x;
        double f=(double)total/n;
        String s=String.format("%.0f",f);
        if(s.equals("-0")) bw.write("0");
        else bw.write(String.valueOf(s));
        bw.newLine();

        Collections.sort(arr);
        if(n==1) bw.write(String.valueOf(arr.get(0)));
        else bw.write(String.valueOf(arr.get(n/2)));
        bw.newLine();

        int max=Integer.MIN_VALUE;
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int key : map.keySet()) {
            max=Math.max(max,map.get(key));
        }
        for (int key : map.keySet()) {
            if(map.get(key)==max) arr2.add(key);
        }
        Collections.sort(arr2);
        if(arr2.size()==1) bw.write(String.valueOf(arr2.get(0)));
        else bw.write(String.valueOf(arr2.get(1)));
        bw.newLine();

        bw.write(String.valueOf(arr.get(n-1)-arr.get(0)));

        br.close();
        bw.close();
    }

}
