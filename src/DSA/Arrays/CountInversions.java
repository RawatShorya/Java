package DSA.Arrays;

public class CountInversions {
  public static void main(String[] args) {
    int[] arr = new int[] {3, 2, 1};
    int inversions = countInversions(arr, 0, arr.length - 1, 0);
    System.out.println(inversions);
  }

  public static int countInversions(int[] arr, int st, int end, int count) {
    if (st < end) {
      int mid = (st + end) / 2;
      count += countInversions(arr, st, mid, count);
      count += countInversions(arr, mid + 1, end, count);
      count += merge(arr, st, mid, end);
    }
    return count;
  }

  private static int merge(int[] arr, int st, int mid, int end) {
    int count = 0;
    int t1 = st;
    int t2 = mid + 1;
    int k = 0;
    int[] temp = new int[end - st + 1];
    while (t1 <= mid && t2 <= end) {
      if (arr[t1] <= arr[t2]) {
        temp[k] = arr[t1];
        t1++;
        k++;
      } else {
        count += (mid - t1 + 1);
        t2++;
        k++;
      }
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
    return count;
  }
}
