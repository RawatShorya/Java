package DSA.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSumEqualsTarget {

    public static void main(String[] args) {
        System.out.println(isSubsetSum(new int[]{1, 2, 7, 3}, 111));
    }

    public static boolean isSubsetSum(int[] nums, int target) {
        int n = nums.length;
        return sum(nums, 0, 0, n, target);
    }

    private static boolean sum(int[] nums, Integer i, int sum, int n, int target) {

        if (sum > target) {
            return false;
        }

        if (target == sum) {
            return true;
        }
        if (nums.length == i) {
            return false;
        }
        return sum(nums, i + 1, sum + nums[i], n, target) || sum(nums, i + 1, sum, n, target);
    }
}
