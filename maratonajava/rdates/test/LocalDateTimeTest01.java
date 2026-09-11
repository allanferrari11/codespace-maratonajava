import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class LocalDateTimeTest01 {
   public static void main(String[] args) {
      LocalDateTime localDateTime = LocalDateTime.now();
      LocalDate date = LocalDate.parse("2028-08-06");
      LocalTime time = LocalTime.parse("09:45:00");
      System.out.println(localDateTime);
      System.out.println(time);
      LocalDateTime ltd1 = date.atTime(time);
      LocalDateTime ltd2 = time.atDate(date);
      System.out.println(ltd1);
      System.out.println(ltd2);

   }
}
