package Sorting;

public class MergeSort {
  public static void main(String[] args) {
    int[] arr = new int[] {4, 5, 1, 2, 3};
    sort(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static int[] sort(int[] arr, int start, int end) {
    if (start < end) {
      int mid = start + ((end - start) / 2);
      sort(arr, start, mid);
      sort(arr, mid + 1, end);
      merge(arr, start, mid, end);
    }
    return arr;
  }

  private static void merge(int[] arr, int start, int mid, int end) {
    int[] temp = new int[end - start + 1];
    int k = 0;
    int i = start;
    int j = mid + 1;
    while (i <= mid && j <= end) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
        k++;
      } else {
        temp[k] = arr[j];
        j++;
        k++;
      }
    }

    while (i <= mid) {
      temp[k] = arr[i];
      i++;
      k++;
    }

    while (j <= end) {
      temp[k] = arr[j];
      j++;
      k++;
    }

    for (int idx = 0; idx < temp.length; idx++) {
      arr[start + idx] = temp[idx];
    }
  }
}
