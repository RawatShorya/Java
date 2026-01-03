package DSA.Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
  public static void main(String[] args) {
    //    int ans = longestConsecutiveSequenceBruteForce(new int[] {100, 4, 200, 1, 3, 2});
    int ans = longestConsecutiveSequence(new int[] {100, 4, 200, 1, 3, 2});
    System.out.println(ans);
  }

  private static int longestConsecutiveSequenceBruteForce(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      int currentCount = 1;
      int currentNumber = nums[i];
      while (contains(nums, currentNumber + 1)) {
        currentNumber++;
        currentCount++;
      }
      count = Math.max(count, currentCount);
    }
    return count;
  }

  private static boolean contains(int[] nums, int target) {
    for (int num : nums) {
      if (target == num) return true;
    }
    return false;
  }

  private static int longestConsecutiveSequence(int[] nums) {
    //    if (nums.length == 0) return 0;
    //    Set<Integer> set = new HashSet<>();
    //    for (int num : nums) {
    //      set.add(num);
    //    }
    //    int longest = 0;
    //    for (int num : set) {
    //      if (!set.contains(num - 1)) {
    //        int currentNum = num;
    //        int count = 1;
    //
    //        while (set.contains(currentNum + 1)) {
    //          count++;
    //          currentNum++;
    //        }
    //        longest = Math.max(count, longest);
    //      }
    //    }
    //    return longest;

    if (nums.length == 0) return 0;
    int longest = 0;
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }
    for (Integer num : set) {
      if (!set.contains(num - 1)) {
        int currentNumber = num;
        int currentCount = 1;
        while (set.contains(currentNumber + 1)) {
          currentNumber++;
          currentCount++;
        }
        longest = Math.max(longest, currentCount);
      }
    }
    return longest;
  }
}
