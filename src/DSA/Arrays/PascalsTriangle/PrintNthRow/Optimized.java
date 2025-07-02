package DSA.Arrays.PascalsTriangle.PrintNthRow;

import java.util.ArrayList;
import java.util.List;

public class Optimized {
    public static void main(String[] args){
        int n = 5;
        pascalTriangle(n);

    }

    private static void pascalTriangle(int n) {
        int ans = 1;
        System.out.println(ans + " ");
        for (int i=1; i<n ; i++){
            ans = ans * (n-i);
            ans = ans/i;
            System.out.println(ans + " ");
        }
        System.out.println();
    }
}
