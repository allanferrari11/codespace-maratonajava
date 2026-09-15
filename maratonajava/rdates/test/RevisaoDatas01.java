import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
//import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
//import java.util.Locale;

public class RevisaoDatas01 {
    public static void main(String[] args) {
        LocalDate dataLancamento = LocalDate.of(2015, 6, 23);
        LocalDate dataZerado = LocalDate.of(2022, 12, 15);
        LocalDate dataHoje = LocalDate.now();
        LocalDate amanha = dataHoje.plusDays(1);

        System.out.println(amanha);

        LocalTime horaZerado = LocalTime.of(16, 45);

        LocalDateTime momentoZerado = dataZerado.atTime(horaZerado);

        Period tempoParaZerar = Period.between(dataLancamento, dataZerado);

        long totalDias = ChronoUnit.DAYS.between(dataLancamento, dataZerado);

        System.out.println(tempoParaZerar);
        System.out.println(totalDias);

        System.out.println("Registro Completo: " + momentoZerado);
        System.out.println("--- Duração na Biblioteca ---");
        System.out.println("Ficou parado por: " + tempoParaZerar.getYears() + " anos, "
                + tempoParaZerar.getMonths() + " meses e "
                + tempoParaZerar.getDays() + " dias.");
        System.out.println("Ou um total absoluto de: " + totalDias + " dias corridos.");

        // System.out.println("\n-----------------------\n");

        // Locale localeBR = new Locale("pt", "BR");
        // DateTimeFormatter formatadorBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm", localeBR);
        // String dataVisual = momentoZerado.format(formatadorBR);

        // System.out.println("Formato do Banco de Dados: " + momentoZerado);
        // System.out.println("Formato na Tela do Jogo: " + dataVisual);
    }
}
