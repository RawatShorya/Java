package DSA.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
    public static void main(String[] args){
        List<List<Integer>> list = generateSubset2(new int[] {1,2,2});
        list.forEach(
                x -> {
                    System.out.print(x + " ");
                });
    }

    private static List<List<Integer>> generateSubset2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        test(1,2,3);
        findSubSets(0, result, new ArrayList<Integer>(), nums);
        return result;
    }

    private static void test(int ...a) {
        
    }

    private static void findSubSets(int idx, List<List<Integer>> result, ArrayList<Integer> current, int[] nums) {
        result.add(new ArrayList<>(current));
        for (int i=idx; i<nums.length; i++){
            if (i>idx && nums[i] == nums[i-1])continue;
            current.add(nums[i]);
            findSubSets(i+1, result, current, nums);
            current.remove(current.size()-1);
        }
    }
}
