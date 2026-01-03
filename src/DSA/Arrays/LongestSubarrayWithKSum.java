package DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithKSum {
    public static void main(String[] args) {
        System.out.println(findLongestSubarray(new int[] {10, 5, 2, 7, 1, 9}, 15));
    }

    private static int findLongestSubarray(int[] arr, int target) {
        int maxLen = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
            if (sum == target){
                maxLen = Math.max(maxLen, i + 1);
            }else{
                int rem = sum - target;
                if (map.containsKey(rem)){
                    maxLen = Math.max(maxLen, i - map.get(rem));
                }
                if (!map.containsKey(sum)){
                    map.put(sum, i);
                }
            }
        }
        return maxLen;
    }
}
