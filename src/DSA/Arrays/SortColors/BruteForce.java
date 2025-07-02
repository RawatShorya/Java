package DSA.Arrays.SortColors;

import java.util.HashMap;
import java.util.Map;

public class BruteForce {

    public static void main(String[] args) {
        int[] array = sortColors(new int[] {0,1,1,0,2,2,1,0});
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static int[] sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], (map.get(nums[i]) + 1));
            }else {
                map.put(nums[i], 1);
            }
        }
        int temp = 0;
        for (int k = 0; k<3; k++){
            if (map.containsKey(k)){
                for (int i = 0; i<map.get(k); i++){
                    nums[temp]=k;
                    temp++;
                }
            }
        }
        return nums;
    }
}
