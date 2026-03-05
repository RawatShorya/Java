package DSA.String;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int l = 0;
        int[] arr = new int[128];
        Arrays.fill(arr, -1);

        int count = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (arr[c] >= l) {
                l = arr[c] + 1;
            }
            arr[c] = r;
            count = Math.max(count, r - l + 1);
        }
        return count;
    }
}
