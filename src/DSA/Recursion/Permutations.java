package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
  public static void main(String[] args) {
    List<List<Integer>> list = permute(new int[] {1, 2, 3});
    for (List<Integer> element : list) {
      System.out.println(element);
    }
  }

  public static List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
      boolean[] visited = new boolean[nums.length];
      permuteBackTrack(nums, result, new ArrayList<>(), visited);
      return result;
  }

    private static void permuteBackTrack(int[] nums, List<List<Integer>> result, List<Integer> list, boolean[] visited) {

      if (nums.length == list.size()){
          result.add(new ArrayList<>(list));
          return;
      }

      for (int i = 0; i<nums.length; i++){
          if (visited[i])continue;
          visited[i] = Boolean.TRUE;
          list.add(nums[i]);
          permuteBackTrack(nums, result, list, visited);
          list.remove(list.size()-1);
          visited[i] = Boolean.FALSE;
      }


    }


}
