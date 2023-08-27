import java.util.*;

public class Main {
    private static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    private static void quickSort(int[] arr, int start, int end){
        int part2 = partition(arr,start,end);
        if(start < part2-1){
            quickSort(arr,start,part2-1);
        }
        if(part2 < end){
            quickSort(arr, part2, end);
        }
    }
    private static int partition(int[] arr, int start, int end){
        int pivot=arr[(start+end)/2];
        while(start <= end){
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;
            if(start <= end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        return start;
    }
    private static void swap(int[] arr, int start, int end){
        int tmp=arr[start];
        arr[start]=arr[end];
        arr[end]=tmp;
    }
    public static void main(String[] args) {
        Main T=new Main();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++) arr[i]=scan.nextInt();
        quickSort(arr);
        for(int i=0; i<n; i++) System.out.print(arr[i]);
        System.out.println();

    }
}
