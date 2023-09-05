import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scan.nextInt();
        for(int i=0; i<n-1; i++){
            int max_index=i;
            for(int j=i+1; j<n; j++){
                if(arr[max_index]<arr[j]){
                    max_index=j;
                }
            }
            int tmp=arr[i];
            arr[i]=arr[max_index];
            arr[max_index]=tmp;
        }
        for(int i=0; i<n; i++) System.out.println(arr[i]);
    }
}