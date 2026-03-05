package DSA.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        List<Integer> list = subsetSums(new int[]{1, 2, 5});
        Collections.sort(list);
        System.out.println(list);
    }

    public static List<Integer> subsetSums(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int sum = 0;
        sum(nums, result, 0, sum, n);
        return result;
    }

    private static void sum(int[] nums, List<Integer> result, Integer i, int sum, int n) {

        if (nums.length == i) {
            result.add(sum);
            return;
        }

        sum(nums, result, i + 1, sum, n);
        sum(nums, result, i + 1, sum + nums[i], n);
    }
}
