import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=scan.nextInt();
        Arrays.sort(arr);
        int m=scan.nextInt();
        for(int i=0; i<m; i++){
            int t= scan.nextInt();
            int start=0, end=n-1;
            int answer=0;
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]==t){
                    answer=1;
                    break;
                }else if(arr[mid]>t) end=mid-1;
                else start=mid+1;
            }
            System.out.println(answer);
        }

    }
}