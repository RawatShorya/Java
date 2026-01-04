package DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithGivenXorK {
    public static void main(String[] args){
        System.out.println(subarraysWithXorK(new int[] {4, 2, 2, 6, 4}, 6));
    }
    public static int subarraysWithXorK(int[] nums, int k) {
        int xr = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        for (int i =0; i<nums.length; i++){
            xr = xr ^ nums[i];
            int x = xr ^ k;
            count += map.getOrDefault(x, 0);
            map.put(xr, map.getOrDefault(xr, 0) + 1);
        }
        return count;
    }
}
