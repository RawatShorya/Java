import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class Main {
  public static void main(String[] args) {
      try {
          int[] arr = new int[3];
//          System.out.println(arr[5]);
          System.exit(0);
      } catch (ArrayIndexOutOfBoundsException e) {
//          System.exit(0);
          System.out.println("Error");
      }finally{
      System.out.println("heheheh");
      }

  }
}
