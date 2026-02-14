package DSA.GreedyAlgo;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class MinimumCoinsProblem {

    public static void main(String[] args) {
        System.out.println(MinimumCoins(new int[]{2, 5}, 3));
    }

    public static int MinimumCoins(int[] coins, int amount) {
        int n = coins.length;

        Arrays.sort(coins);
        for (int i = 0; i < n / 2; i++) {
            int temp = coins[i];
            coins[i] = coins[n - i - 1];
            coins[n - i - 1] = temp;
        }

        int[] freqArray = new int[coins[0] + 1];
        for (int i = 0; i < n; i++) {
            freqArray[i] = 0;
        }

        int i = 0;
        while (amount > 0 && i < n) {
            if (coins[i] <= amount) {
                amount = amount - coins[i];
                freqArray[coins[i]] += 1;
            } else {
                i++;
            }
        }

        if (amount == 0) {
            int numberOfCoin = 0;
            for (int j = 0; j < freqArray.length; j++) {
                numberOfCoin += freqArray[j];
            }
            return numberOfCoin;
        } else {
            return -1;
        }

    }
}
