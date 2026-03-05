package DSA.String;

public class MinimumSizeSubarraySum {

    public static void main(String[] args){
        System.out.println(minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int minCount = Integer.MAX_VALUE;
        int sum = 0;
        for(int r = 0; r<nums.length; r++){
            sum += nums[r];
            while(sum >= target){
                minCount = Math.min(minCount, r-l+1);
                sum -= nums[l];
                l++;
            }
        }
        return minCount == Integer.MAX_VALUE ? 0 : minCount;
    }
}
