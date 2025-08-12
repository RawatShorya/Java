package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args){
        List<List<Integer>> list = cb(new int[] {2,1}, 7);
        list.forEach(
                x -> {
                    System.out.print(x + " ");
                });
    }

    private static List<List<Integer>> cb(int[] ints, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int idx = 0;
        findCb(result, ints, current, idx, target);
        return result;
    }

    private static void findCb(List<List<Integer>> result, int[] nums, List<Integer> current, int idx, int target) {
        if (nums.length == idx){
            if (target == 0){
                result.add(new ArrayList<>(current));
            }
            return;
        }

        if (target>=nums[idx]){
            current.add(nums[idx]);
            findCb(result, nums, current, idx, target-nums[idx]);
            current.remove(current.size()-1);
        }

        findCb(result, nums, current, idx+1, target);
    }
}
