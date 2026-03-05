package DSA.Recursion;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class GenerateSubsets {
    public static void main(String[] args){
        List<List<Integer>> list = generateSubsets(new int[] {5,2,1});
        System.out.println(list);
    }

    public static List<List<Integer>> generateSubsets(int[] array){
        List<List<Integer>> answer = new ArrayList<>();
        getSubsets(answer, 0, array, new ArrayList<>());
        return answer;
    }

    private static void getSubsets(List<List<Integer>> answer, int i, int[] arr, List<Integer> current) {

        if( i == arr.length){
            answer.add(new ArrayList<>(current));
            return;
        }
        getSubsets(answer, i+1, arr, current);
        current.add(arr[i]);
        getSubsets(answer, i+1, arr, current);
        current.remove(current.size() - 1);
    }


}
