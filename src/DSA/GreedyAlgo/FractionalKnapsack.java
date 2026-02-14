package DSA.GreedyAlgo;

import java.util.ArrayList;
import java.util.List;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] val = new int[]{60, 100, 120};
        int[] wt = new int[]{10, 20, 30};
        System.out.println(fractionalKnapsack(val, wt, 50));
    }

    static class Item {
        long val;
        long wt;

        public Item(long val, long wt) {
            this.val = val;
            this.wt = wt;
        }
    }

    public static double fractionalKnapsack(int[] val, int[] wt, long cap) {
        int n = val.length;
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            items.add(new Item(val[i], wt[i]));
        }

        items.sort((i1, i2) -> {
            double r1 = (double) i1.val / i1.wt;
            double r2 = (double) i2.val / i2.wt;
            if (r1 < r2) return 1;
            if (r1 > r2) return -1;
            return 0;
        });

        double value = 0;
        for (Item item : items) {
            if (cap >= item.wt) {
                value += item.val;
                cap -= item.wt;
            } else {
                value += (double) item.val / item.wt * cap;
                break;
            }
        }
        return value;
    }
}
