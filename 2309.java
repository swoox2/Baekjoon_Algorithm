import java.io.*;
import java.util.*;
public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr=new int[9];
        int total=0;
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i <arr.length; i++) {
            String s = br.readLine();

            arr[i]=Integer.parseInt(s);
            total+=Integer.parseInt(s);
        }

        boolean find=false;
        for(int i=0; i<arr.length-1; i++){
            for (int j = i + 1; j < arr.length; j++) {
                int sum=total;
                if(sum-(arr[i]+arr[j])==100){
                    for(int x : arr){
                        if(x!=arr[i] && x!=arr[j]) array.add(x);
                    }
                    find=true;

                }
            }
            if(find) break;
        }

        Collections.sort(array);

        for(int i=0; i<array.size(); i++){
            bw.write(String.valueOf(array.get(i)));
            bw.newLine();
        }

        br.close();
        bw.close();
    }

}
