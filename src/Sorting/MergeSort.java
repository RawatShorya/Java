package Sorting;

public class MergeSort {
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
      int mid = (end + st) / 2;
      sort(arr, st, mid);
      sort(arr, mid + 1, end);
      merge(arr, st, mid, end);
    }
  }

  private static void merge(int[] arr, int st, int mid, int end) {
    int t1 = st;
    int t2 = mid + 1;
    int[] temp = new int[end - st + 1];
    int k = 0;
    while (t1 <= mid && t2 <= end) {
      if (arr[t1] <= arr[t2]) {
        temp[k] = arr[t1];
        t1++;
      } else {
        temp[k] = arr[t2];
        t2++;
      }
      k++;
    }
    while (t1 <= mid) {
      temp[k] = arr[t1];
      t1++;
      k++;
    }
    while (t2 <= end) {
      temp[k] = arr[t2];
      t2++;
      k++;
    }
    for (int i = 0; i < temp.length; i++) {
      arr[st + i] = temp[i];
    }
  }
}
