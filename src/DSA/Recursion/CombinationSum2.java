package DSA.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSum2 {
  public static void main(String[] args) {
    List<List<Integer>> list = cb2(new int[] {10,1,2,7,6,1,5}, 8);
    list.forEach(
        x -> {
          System.out.print(x + " ");
        });
  }

  private static List<List<Integer>> cb2(int[] ints, int target) {
    HashSet<List<Integer>> hashSet = new HashSet<>();
    List<Integer> current = new ArrayList<>();
    Arrays.sort(ints);
    int idx = 0;
    findCb2(hashSet, ints, current, idx, target);
    return new ArrayList<>(hashSet);
  }

  private static void findCb2(
          HashSet<List<Integer>> hashSet, int[] nums, List<Integer> current, int idx, int target) {
    if (nums.length == idx) {
      if (target == 0) {
        hashSet.add(new ArrayList<>(current));
      }
      return;
    }

    if (target >= nums[idx]) {
      current.add(nums[idx]);
      findCb2(hashSet, nums, current, idx + 1, target - nums[idx]);
      current.remove(current.size() -  1);
    }
    findCb2(hashSet, nums, current, idx + 1, target);
  }
}
