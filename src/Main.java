import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int size = 0;
        arr[0] = 1;
        size++;
        arr[size++] = 2;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
