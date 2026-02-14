package DSA.GreedyAlgo;

import java.util.*;

public class NmeetingsInOneRoom {
    public static void main(String[] args) {
        int[] start = new int[]{1, 3, 0, 5, 8, 5};
        int[] end = new int[]{2, 4, 6, 7, 9, 9};
        System.out.println(maxMeetings(start, end));
    }

    static class Data {
        int start;
        int end;
        int pos;

        public Data(int start, int end, int pos) {
            this.start = start;
            this.end = end;
            this.pos = pos;

        }
    }

    public static int maxMeetings(int[] start, int[] end) {
        if (start.length == 0) return 0;

        List<Data> newData = new ArrayList<>();

        int n = start.length;
        for (int i = 0; i<n; i++){
            Data data = new Data(start[i], end[i], i+1);
            newData.add(data);
        }

        newData.sort(Comparator.comparingInt(d -> d.end));

        int count = 1;
        int freeTime = newData.getFirst().end;

        for (int i = 1; i<newData.size(); i++){
            if (newData.get(i).start >= freeTime){
                count++;
                freeTime = newData.get(i).end;
            }
        }

        return count;
    }
}
