import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();

        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]= scan.nextInt();
        int cnt=0;
        while(k!=0){
            for(int i=n-1; i>=0; i--){
                if(k>=arr[i]){
                    k-=arr[i];
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }

}
