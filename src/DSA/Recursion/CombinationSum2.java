package DSA.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        List<List<Integer>> list = combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        list.forEach(
                x -> {
                    System.out.print(x + " ");
                });
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        findSum(result, candidates, target, new ArrayList<>(), 0);
        return result;
    }

    private static void findSum(List<List<Integer>> result, int[] candidates, int target, ArrayList<Integer> current, int idx) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i - 1]) continue;
            if (target < candidates[i])
                break;
            current.add(candidates[i]);
            findSum(result, candidates, target - candidates[i], current, i + 1);
            current.remove(current.size() - 1);
        }
    }
}
