package DSA.Arrays.PascalsTriangle;

public class printIthele {
    public static void main(String[] args){
        printElement(6, 2);

    }

    private static void printElement(int n, int r) {
        n = n-1;
        r = r-1;
        int result = 1;
        for (int i = 0; i<r; i++){
            result = result * (n - i);
            result = result / (i+1);
        }
        System.out.println(result);
    }
}
