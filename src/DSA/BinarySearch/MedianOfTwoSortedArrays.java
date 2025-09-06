package DSA.BinarySearch;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2};
        int[] arr2 = new int[]{3, 4};
        double response = findMedianSortedArrays(arr1, arr2);
        System.out.println(response);
    }

    private static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int totalSize = (m + n);
        int idx1 = totalSize / 2;
        int idx2 = (idx1 - 1);

        int ele1 = -1, ele2 = -1, cnt = 0, i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                if (cnt == idx1) ele1 = arr1[i];
                if (cnt == idx2) ele2 = arr1[i];
                cnt++;
                i++;
            }else {
                if (cnt == idx1) ele1 = arr2[j];
                if (cnt == idx2) ele2 = arr2[j];
                cnt++;
                j++;
            }
        }

        while (i<m){
            if (cnt == idx1) ele1 = arr1[i];
            if (cnt == idx2) ele2 = arr1[i];
            cnt++;
            i++;
        }

        while (j<n){
            if (cnt == idx1) ele1 = arr2[j];
            if (cnt == idx2) ele2 = arr2[j];
            cnt++;
            j++;
        }

        if (totalSize % 2 == 0){
            return (double) (ele1 + ele2) /2;
        }else {
            return ele2;
        }
    }
}
