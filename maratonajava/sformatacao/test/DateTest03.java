import java.text.DateFormat;
import java.util.Calendar;

public class DateTest03 {
    public static void main(String[] args) {
         Calendar calendar = Calendar.getInstance();

         System.out.println(calendar);

         DateFormat df = DateFormat.getDateInstance();

         System.out.println("\n"+df.format(calendar.getTime()));
    }
}
