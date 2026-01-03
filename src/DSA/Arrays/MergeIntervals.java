package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
  public static void main(String[] args) {
    int[][] ans =
        merge(
            new int[][] {
              new int[] {2, 6},
              new int[] {2, 3},
              new int[] {1, 3},
              new int[] {8, 10},
              new int[] {15, 18}
            });
  }

  public static int[][] merge(int[][] intervals) {
    Arrays.sort(
        intervals,
        (a, b) -> {
          if (a[0] == b[0]) {
            return Integer.compare(a[1], b[1]);
          } else {
            return Integer.compare(a[0], b[0]);
          }
        });
    int lower = -1;
    int upper = -1;
    List<int[]> list = new ArrayList<>();
    for (int i = 0; i < intervals.length; i++) {
      if (intervals[i][0] >= lower && intervals[i][0] <= upper) {
        upper = Math.max(intervals[i][1], list.getLast()[1]);
        list.getLast()[1] = upper;
      } else {
        lower = intervals[i][0];
        upper = intervals[i][1];
        list.add(new int[] {lower, upper});
      }
    }
    return list.toArray(new int[list.size()][]);
  }
}
