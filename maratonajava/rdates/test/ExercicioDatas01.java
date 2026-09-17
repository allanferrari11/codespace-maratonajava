import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ProximoDiaUtil implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        LocalDate dataConvertida = LocalDate.from(temporal);
        DayOfWeek dayOfWeek = dataConvertida.getDayOfWeek();

        int addDays;

        switch (dayOfWeek) {

            case SATURDAY:
                addDays = 2;
                break;

            case SUNDAY:
                addDays = 1;
                break;

            default:
                addDays = 0;
                break;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class ExercicioDatas01 {
    public static void main(String[] args) {

        LocalDate dataEmissao = LocalDate.of(2026, 9, 3);
        LocalDate dataPagamento = dataEmissao.plus(10, ChronoUnit.DAYS);
        dataPagamento = dataPagamento.with(new ProximoDiaUtil());
        System.out.println(dataPagamento);

    }

}
