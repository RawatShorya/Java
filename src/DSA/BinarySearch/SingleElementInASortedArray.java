package DSA.BinarySearch;

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
    }

    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        } else if (nums[0] != nums[1]) {
            return nums[0];
        } else if (nums[n - 1] != nums[n - 2]) {
            return nums[n - 1];
        }
        int s = 1;
        int e = n - 2;

        while (s <= e) {
            int mid = (s + e) / 2;
            if ((nums[mid] != nums[mid - 1]) && (nums[mid] != nums[mid + 1])) {
                return nums[mid];
            }
            if ((mid % 2 != 0 && nums[mid - 1] == nums[mid]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return 0;
    }
}
