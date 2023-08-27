import java.util.*;
public class Main {
    public static void main(String[] args) {
        Main T=new Main();
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]= scan.nextInt();
        Arrays.sort(arr);
        for(int i=0; i<n; i++) System.out.print(arr[i]);
        System.out.println();

    }
}
