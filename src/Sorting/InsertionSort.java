package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = sort(new int[] {4, 5, 1, 2, 3});
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] sort(int[] arr) {
        for (int  i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev>=0 && curr < arr[prev]){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        return arr;
    }
}
