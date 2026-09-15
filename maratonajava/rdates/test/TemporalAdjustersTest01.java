import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate tomorrow = LocalDate.now().plusDays(1);

        System.out.println("\nHOJE  - com ChronoField");
        now = now.with(ChronoField.DAY_OF_MONTH, 14);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("\nAMANHÃ - com withDayOfMonth");
        tomorrow = tomorrow.withDayOfMonth(20);
        System.out.println(tomorrow);
        System.out.println(tomorrow.getDayOfWeek());

        System.out.println(" \nNEXT OR SAME - SEGUNDA");
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println(" \nNEXT - SEGUNDA");
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println(" \nPREVIOUS - SEGUNDA");
        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println(" \nPRIMEIRO DIA DO MÊS");
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println(" \nÚLTIMO DIA DO MÊS");
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println(" \nPRIMEIRO DIA DO PRÓXIMO ANO");
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println(" \nPRIMEIRO DIA DO PRÓXIMO MÊS");
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }
}
