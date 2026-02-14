package DSA.GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class JobSequencingProblem {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 4, 20}, {2, 1, 10}, {3, 1, 40}, {4, 1, 30}};
        int[] response = JobScheduling(arr);
        System.out.println("Job - : " + response[0] + ", Profit : " + response[1]);

    }

    public static int[] JobScheduling(int[][] jobs) {
        int n = jobs.length;
        int maxDeadLine = 0;
        for (int i = 0; i < n; i++) {
            maxDeadLine = Math.max(maxDeadLine, jobs[i][1]);
        }
        int[] arr = new int[maxDeadLine + 1];
        for (int i = 0; i < maxDeadLine + 1; i++) {
            arr[i] = -1;
        }

        Arrays.sort(jobs, (a, b) -> b[2] - a[2]);

        int currentProfit = 0;
        int jobCount = 0;

        for (int i = 0; i < n; i++) {
            int jobId = jobs[i][0];
            int deadline = jobs[i][1];
            int profit = jobs[i][2];

            for (int j = deadline; j > 0; j--) {
                if (arr[j] == -1) {
                    arr[j] = jobId;
                    currentProfit += profit;
                    jobCount += 1;
                    break;
                }
            }
        }
        return new int[]{jobCount, currentProfit};
    }
}
