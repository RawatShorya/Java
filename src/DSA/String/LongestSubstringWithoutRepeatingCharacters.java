package DSA.String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
  public static void main(String[] args) {
    System.out.println(optimized("pwwkew"));
  }

  //  private static int getLongestSubstring(String s) {
  //    int maxLength = 0;
  //    for (int i = 0; i < s.length(); i++) {
  //      int[] hash = new int[256];
  //      int currentLen = 0;
  //      for (int j = i; j < s.length(); j++) {
  //        if (hash[s.charAt(j)] == 1) {
  //          break;
  //        }
  //        currentLen = currentLen + 1;
  //        maxLength = Math.max(maxLength, currentLen);
  //        hash[s.charAt(j)] = 1;
  //      }
  //    }
  //    return maxLength;
  //  }
  // abc
  private static int optimized(String s) {
    int l = 0;
    int r = 0;
    int ans = 0;
    Map<Character, Integer> map = new HashMap<>();
    while (r < s.length()) {
        char ch = s.charAt(r);
      if (map.containsKey(ch)
              && map.get(ch) >=l
      ) {
          l = map.get(ch) + 1;
      }
        map.put(ch, r);
      ans = Math.max(ans, r - l + 1);
        r++;
    }
    return ans;
  }
}
