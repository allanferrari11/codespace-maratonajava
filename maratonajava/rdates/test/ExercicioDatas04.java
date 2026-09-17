import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class AjustadorManutencao implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dataConvertida = LocalDateTime.from(temporal).getDayOfWeek();
        int addDays = 0;

        switch (dataConvertida) {
            case SUNDAY:
                addDays = 1;
                break;
            default:
                addDays = 0;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class ExercicioDatas04 {
    public static void main(String[] args) {
        LocalDateTime dataLancamento = LocalDateTime.of(2026, 2, 27, 00, 00, 00);
        LocalDateTime dataPreLoad = dataLancamento.minusMonths(1).minusDays(2).with(new AjustadorManutencao());

        System.out.println(dataPreLoad);

        DateTimeFormatter formatadorBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm:ss");

        System.out.println("\nSeu pré-load estará liberado na data de: \n"
                + dataPreLoad.format(formatadorBR));

    }
}
