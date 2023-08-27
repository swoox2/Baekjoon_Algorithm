import java.util.Scanner;

public class Main {
    public void solution(int n, int[] arr){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
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
