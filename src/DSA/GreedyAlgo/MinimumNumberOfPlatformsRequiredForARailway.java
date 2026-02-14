package DSA.GreedyAlgo;

import java.util.Arrays;

public class MinimumNumberOfPlatformsRequiredForARailway {
    public static void main(String[] args) {
        int[] start = new int[]{900, 940, 950, 1100, 1500, 1800};
        int[] end = new int[]{910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(start, end));
    }

    private static int findPlatform(int[] arr, int[] dep) {

        int n = arr.length;
        int ans = 0;

        for (int i = 0; i<n; i++){
            int count = 1;
            for(int j = 0; j< n; j++){
                if (i==j) continue;
                if(dep[j] >= arr[i] && dep[i]>=arr[j]){
                    count++;
                }
            }
            ans = Math.max(ans, count);
        }

        return ans;
    }
}
