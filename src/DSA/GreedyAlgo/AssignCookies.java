package DSA.GreedyAlgo;

import java.util.Arrays;

public class AssignCookies {

    public static void main(String[] args) {
        System.out.println(findMaximumCookieStudents(new int[]{1, 5, 3, 3, 4}, new int[]{4, 2, 1, 2, 1, 3}));
    }

    public static int findMaximumCookieStudents(int[] Student, int[] Cookie) {
        Arrays.sort(Student);
        Arrays.sort(Cookie);
        int l = 0;
        int r = 0;
        int count = 0;
        while (l < Student.length && r < Cookie.length) {
            if (Student[l] <= Cookie[r]) {
                count++;
                l++;
            }
            r++;
        }
        return count;
    }
}
