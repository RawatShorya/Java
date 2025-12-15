package DSA.Arrays;

public class FindingMissingAndRepeatingNumber {
  public static void main(String[] args) {
    int[] arr = findMissAndRepeat(new int[] {3, 5, 4, 1, 1});
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  //  private static int[] findMissAndRepeat(int[] arr) {
  //    int[] temp = new int[arr.length + 1];
  //    for (int i = 0; i < arr.length; i++) {
  //      temp[arr[i]]++;
  //    }
  //    int[] result = new int[2];
  //    for (int i = 0; i < temp.length; i++) {
  //      if (temp[i] > 1) {
  //        result[0] = i;
  //      } else if (temp[i] < 1 && i != 0) {
  //        result[1] = i;
  //      }
  //    }
  //    return result;
  //  }

  private static int[] findMissAndRepeat(int[] arr) {
    int n = arr.length;
    long Sn = ((long) n * (n + 1)) / 2;
    long S = 0;
    for (int i = 0; i < n; i++) {
      S = S + arr[i];
    }

    long S2n = ((long) n * (n + 1) * (2L * n + 1)) / 6;
    long S2 = 0;
    for (int i = 0; i < n; i++) {
      S2 = S2 + ((long) arr[i] * arr[i]);
    }

    long val1 = S - Sn;
    long val2 = S2 - S2n;
    val2 = val2 / val1;
    int missing = (int) (val1 + val2) / 2;
    int repeating = (int) val2 - missing;

    return new int[] {missing, repeating};
  }
}
