package DSA.Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveEvenNumbers {

    public static void main(String[] args) {
        RemoveEvenNumbers removeEvenNumbers = null;
        int[] arr = new int[]{0, 20, 41};
        int[] result = getArrayWithEvenElements(arr);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    private static int[] getArrayWithEvenElements(int[] arr) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                map.put(arr[i], 1);
            }
        }
        int[] result = new int[map.size()];
        int temp = 0;
        for(Integer value : map.keySet()){
            result[temp] = value;
            temp++;
        }
        return result;
    }
}