package DSA.Arrays.SetMatrixZero;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<List<Integer>> list =  generate(4);
        System.out.println(list);
    }

    private static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        if(n==1){
            ans.add(List.of(1));
        }else{
            ans.add(List.of(1));
            ans.add(List.of(1,1));
            for(int i=0; i<n-2; i++){
                List<Integer> currentList = new ArrayList<>();
                currentList.add(1);

                int prevListIndex = ans.size()-1;
                List<Integer> prevList = ans.get(prevListIndex);

                for(int j=0; j<prevList.size()-1; j++){
                    int sum = prevList.get(j) + prevList.get(j+1);
                    currentList.add(sum);
                }

                currentList.add(1);
                ans.add(currentList);
            }
        }
        return ans;
    }
}
