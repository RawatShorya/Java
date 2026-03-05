package DSA.TWO_POINTER;

public class TwoSumIIInputArrayIsSorted {

    public static void main(String[] args) {
        int[] arr = twoSum(new int[]{-1, 0}, -1);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {

        int i = 0, j = numbers.length - 1;

        while (i < j) {
            if (target == numbers[i] + numbers[j]) {
                return new int[]{i + 1, j + 1};
            } else if (target > numbers[i] + numbers[j]) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{};
    }
}
