package DSA.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int reverse[] = new int[] {3,2,1} ;
        nextPermutation(reverse);
        for (int i=0;i<reverse.length; i++){
            System.out.print(reverse[i] + " ");
        }
    }

    private static void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(nums, 0, n-1);
        }
        for(int i = n-1; i>=0; i--){
            if(nums[i] > nums[idx]){
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                break;
            }
            String s = "123";
        }
        reverse(nums, idx+1, n-1);
    }

    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
