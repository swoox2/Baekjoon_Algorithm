import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            int target= Integer.parseInt(st.nextToken());
            int start=0, end=n-1, answer=0;
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]==target){
                    answer=1;
                    break;
                }else if(arr[mid]<target) start=mid+1;
                else end=mid-1;
            }
            if(answer==1) bw.write("1");
            else bw.write("0");
            bw.write(" ");
        }
        bw.close();
        br.close();

    }
}