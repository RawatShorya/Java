package DSA.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args){
        int arr[] = new int[] {1,2,3,4};
        product(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static int[] product(int[] arr) {
        int [] prefix = new int[arr.length];
        prefix[0] = 1;
        for (int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] * arr[i-1];
        }

        int [] suffix = new int[arr.length];
        suffix[arr.length-1] = 1;
        for (int i=arr.length-2; i>=0; i--){
            suffix[i] = suffix[i+1] * arr[i+1];
        }
        int[] result = new int[arr.length];
        for (int i=0; i<result.length; i++){
            result[i] = prefix[i] * suffix[i];
        }
        return result;
    }
}
