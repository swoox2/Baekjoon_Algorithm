import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=scan.nextInt();
        int m=scan.nextInt();
        for(int i=0; i<m; i++){
            int answer=0;
            int t=scan.nextInt();
            for(int j=0; j<n; j++){
                if(arr[j]==t){
                    answer=1;
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}