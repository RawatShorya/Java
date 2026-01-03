package DSA.Arrays;

public class UniquePaths {
    public static void main(String[] args){
        System.out.println(findUniquePaths(3, 7, 0 , 0));
    }

    private static int findUniquePaths(int m, int n, int i, int j) {
        if (i == m-1 && j == n-1) return 1;
        if (i >= m || j>=n) return 0;
        int rightCombination = findUniquePaths(m, n, i, j+1);
        int downCombination = findUniquePaths(m, n, i+1, j);
        return rightCombination + downCombination;
    }
}
