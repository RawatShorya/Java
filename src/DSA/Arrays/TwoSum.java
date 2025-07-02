package DSA.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

    public static void main(String[] args){
        int[] array = {0, -1, 2, -3, 1};
        int target = -21;
//        boolean result = checkIfSumPresentBruteForce(array, target);
        boolean result = checkIfSumPresentOptimized(array, target);
        System.out.println("Result : " + result);
    }

    private static boolean checkIfSumPresentOptimized(int[] array, int target) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i<array.length; i++){
            int complement = target - array[i];
            if (hashSet.contains(complement)){
                return true;
            }
            hashSet.add(array[i]);

      long test = 1 + 1;
        }
        return false;
    }

    private static boolean checkIfSumPresentBruteForce(int[] array, int target) {
        int count = array.length;
        for (int i=0; i<count; i++){
            for (int j=i+1;j<count;j++){
                if(array[i] + array[j] == target){
                    return true;
                }
            }
        }
        return false;
    }

}
