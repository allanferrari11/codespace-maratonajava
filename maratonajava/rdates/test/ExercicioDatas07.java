import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExercicioDatas07 {
    public static void main(String[] args) {
        ZoneId fusoBr = ZoneId.of("America/Sao_Paulo");
        ZoneId fusoJp = ZoneId.of("Asia/Tokyo");

        ZonedDateTime partida = ZonedDateTime.of(2026, 10,
                20, 20, 0, 0, 0, fusoBr);

        ZonedDateTime partidaJp = partida.withZoneSameInstant(fusoJp);             
        
        System.out.println(partidaJp);
    }
}
