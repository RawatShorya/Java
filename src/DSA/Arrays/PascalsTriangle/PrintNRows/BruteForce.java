package DSA.Arrays.PascalsTriangle.PrintNRows;

import java.util.ArrayList;
import java.util.List;

public class BruteForce {
    public static void main(String[] args){
        List<List<Integer>> list =  generate(5);
    }

    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> list = new ArrayList<>();
        if(n==1){
            List<Integer> list1 = List.of(1);
            list.add(list1);
        }
        if (n==2){
            List<Integer> list1 = List.of(1);
            list.add(list1);
            List<Integer> list2 = List.of(1,1);
            list.add(list2);
        }

        if (n>2){
            List<Integer> list1 = List.of(1);
            list.add(list1);
            List<Integer> list2 = List.of(1,1);
            list.add(list2);

            int currentSize = 0;
            int previousListSize = 0;

            for (int k = 0; k<n-2; k++){
                currentSize = list.size();
                previousListSize = list.get(currentSize-1).size();
                List<Integer> list3 = new ArrayList<>();
                list3.add(1);
                for (int i =0; i<previousListSize-1; i++){
                    list3.add(list.get(currentSize-1).get(i) + list.get(currentSize-1).get(i+1));
                }
                list3.add(1);
                list.add(list3);
            }
        }
        return list;
    }
}
