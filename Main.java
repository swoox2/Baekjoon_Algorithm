import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=scan.nextInt();
        Arrays.sort(arr);
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                sum+=arr[j];
            }
        }
        System.out.println(sum);

    }

}
