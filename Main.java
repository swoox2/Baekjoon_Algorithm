import java.util.Scanner;

public class Main {
    public void solution(int n, int[] arr){
        for(int i=0; i<n-1; i++){
            int index=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[index]) index=j;
            }
            int tmp=arr[i];
            arr[i]=arr[index];
            arr[index]=tmp;

        }
    }
    public static void main(String[] args) {
        Main T=new Main();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=scan.nextInt();
        T.solution(n,arr);
        for(int i=0; i<n; i++) System.out.println(arr[i]);
    }
}
