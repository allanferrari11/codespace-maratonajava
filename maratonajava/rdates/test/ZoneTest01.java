import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Map;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println();
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime atOffset = now.atOffset(offsetManaus);
        System.out.println(atOffset);
        OffsetDateTime of = OffsetDateTime.of(now, offsetManaus);
        System.out.println(of);

        OffsetDateTime atOffset2 = nowInstant.atOffset(offsetManaus);
        System.out.println(atOffset2);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate of2 = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(of2);
        System.out.println(meijiEra);
    }
}
