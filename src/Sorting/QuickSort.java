package Sorting;

public class QuickSort {
  public static void main(String[] args) {
    int[] arr = new int[] {4, 5, 1, 2, 3};
    sort(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  private static void sort(int[] arr, int st, int end) {
    if (st < end) {
      int pt = partition(arr, st, end);
      sort(arr, st, pt - 1);
      sort(arr, pt + 1, end);
    }
  }

  private static int partition(int[] arr, int st, int end) {
    int pt = arr[end];
    int idx = st - 1;
    for (int i = st; i < end; i++) {
      if (arr[i] <= pt) {
        idx++;
        int temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
      }
    }
    idx++;
    int temp = arr[idx];
    arr[idx] = arr[end];
    arr[end] = temp;
    return idx;
  }
}
