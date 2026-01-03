package DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithZeroSum {
  public static void main(String[] args) {
    System.out.println(findLongestSubarray(new int[] {9, -3, 3, -1, 6, -5}));
  }

  private static int findLongestSubarray(int[] arr) {
    int result = 0;
    //    for (int i = 0; i < arr.length; i++) {
    //      for (int j = i; j < arr.length; j++) {
    //        int count = 0;
    //        int currentLength = 0;
    //        for (int k = i; k <= j; k++) {
    //          count += arr[k];
    //          currentLength++;
    //        }
    //        if (count == 0) {
    //          result = Math.max(result, currentLength);
    //        }
    //      }
    //    }
    int sum = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum == 0) {
        result = Math.max(result, i + 1);
      } else {
        if (map.containsKey(sum)) {
          result = Math.max(result, i - map.get(sum));
        } else {
          map.put(sum, i);
        }
      }
    }
    return result;
  }
}
