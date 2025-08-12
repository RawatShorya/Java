package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubsets {
    public static void main(String[] args){
        List<List<Integer>> list = generateSubset(new int[] {1,2,2});
    list.forEach(
        x -> {
          System.out.print(x + " ");
        });
    }

    private static List<List<Integer>> generateSubset(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, result, new ArrayList<>(), nums);
        return result;
    }

    private static void backtrack(int idx, List<List<Integer>> result, ArrayList<Integer> current, int[] nums) {
        if (idx == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[idx]);
        backtrack(idx + 1, result, current, nums);
        current.remove(current.size() - 1);
        backtrack(idx + 1, result, current, nums);
    }
}
