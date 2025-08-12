package DSA.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args){
        List<Integer> list = subsetSums(new int[] {1,2,5});
        Collections.sort(list);
        for (Integer i : list) {
      System.out.print(i + " ");
        }
    }

    public static List<Integer> subsetSums(int[] nums){
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int sum = 0;
        sum(nums, result, 0, sum, n);
        return result;
    }

    public static void sum(int[] nums,List<Integer> result, int idx, int sum, int n){
        if(idx == n){
            result.add(sum);
            return;
        }
        sum(nums, result, idx+1, sum, n); //not adding
        sum(nums, result, idx+1, sum + nums[idx], n); //adding
    }
}
