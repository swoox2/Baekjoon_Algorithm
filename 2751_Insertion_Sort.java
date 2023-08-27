package study;

import java.util.Scanner;

public class Main6_03 {
    public void solution(int[] arr){
        for(int i=1; i<arr.length; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (tmp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else break;
            }
            arr[j + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        Main6_03 T = new Main6_03();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]= scan.nextInt();
        T.solution(arr);
        for(int i=0; i<n; i++) System.out.print(arr[i]+" ");
    }

}
