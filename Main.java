import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scan.nextInt();

        for(int i=1; i<n; i++){
            int target=arr[i],j;
            for(j=i-1; j>=0; j--){
                if(target>arr[j]){
                    arr[j+1]=arr[j];
                }else break;
            }
            arr[j+1]=target;
        }

        for(int i=0; i<n; i++) System.out.println(arr[i]);

    }
}