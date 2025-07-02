package DSA.Arrays;

public class GCD {
    public static void main(String[] args) {
        int [] arr = new int[] {18,32};
        gcd(arr);
    }

    private static void gcd(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        int dividend = max;
        int divisor = min;

        while (divisor != 0) {
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        System.out.println("GCD = " + dividend);
    }
}
