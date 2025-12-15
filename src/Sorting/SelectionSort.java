package Sorting;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = sort(new int[] {4, 5, 1, 2, 3});
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static int[] sort(int[] arr) {
      for(int i=0; i<arr.length - 1; i++){
          int smallestIdx = i;
          for (int j = i; j<arr.length; j++){
              if (arr[j] < arr[smallestIdx]){
                  smallestIdx = j;
              }
          }
          swap(arr, i, smallestIdx);
      }
      return arr;
  }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
