import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExercicioDatas06 {
    public static void main(String[] args) {
        Instant momentoPlatina = Instant.now();
        System.out.println(momentoPlatina);

        ZoneId fusoJp = ZoneId.of("Asia/Tokyo");

        ZonedDateTime PlatinafusoJp = momentoPlatina.atZone(fusoJp);

        System.out.println("\n"+PlatinafusoJp);
    }
}
