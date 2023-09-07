import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n = scan.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]= scan.nextInt();
        Arrays.sort(arr);
        int m= scan.nextInt();

        for(int i=0; i<m; i++){
            int target= scan.nextInt();
            int start=0, end=n-1, answer=0;
            while(start<=end){
                int mid=(start+end)/2;
                if(arr[mid]==target){
                    answer=1;
                    break;
                }else if(arr[mid]<target) start=mid+1;
                else end=mid-1;
            }
            System.out.print(answer+" ");
        }

    }
}