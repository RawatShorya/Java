package DSA.Arrays;

public class ReversePair {
  public static void main(String[] args) {
    // int ans = reversePairBruteForce(new int[] {1,3,2,3,1});
    int ans = reversePairs(new int[] {1, 3, 2, 3, 1});
    System.out.println(ans);
  }

  private static int reversePairs(int[] nums) {
    if (nums.length == 0) return 0;
    return mergeSort(nums, 0, nums.length - 1);
  }

  private static int mergeSort(int[] nums, int st, int end) {
    int count = 0;
    if (st < end) {
      int mid = (st + end) / 2;
      count += mergeSort(nums, st, mid);
      count += mergeSort(nums, mid + 1, end);
      count += countPairs(nums, st, mid, end);
      merge(nums, st, mid, end);
    }
    return count;
  }

  private static void merge(int[] nums, int st, int mid, int end) {
    int i = st;
    int j = mid + 1;
    int k = 0;
    int[] temp = new int[end - st + 1];
    while (i <= mid && j<= end) {
      if (nums[i] > nums[j]) {
        temp[k] = nums[j];
        k++;
        j++;
      } else {
        temp[k] = nums[i];
        i++;
        k++;
      }
    }
    while (i <= mid) {
      temp[k] = nums[i];
      i++;
      k++;
    }
    while (j <= end) {
      temp[k] = nums[j];
      j++;
      k++;
    }

    for (int t = 0; t < temp.length; t++) {
      nums[t + st] = temp[t];
    }
  }

  private static int countPairs(int[] nums, int st, int mid, int end) {
    int count = 0;
    int i = st;
    int j = mid + 1;
    while (i <= mid && j <= end) {
      if (nums[i] > 2 * nums[j]) {
        count += mid - i + 1;
        j++;
      } else {
        i++;
      }
    }
    return count;
  }

  private static int reversePairBruteForce(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if ((long) nums[i] > 2 * (long) nums[j]) {
          count++;
        }
      }
    }
    return count;
  }
}
