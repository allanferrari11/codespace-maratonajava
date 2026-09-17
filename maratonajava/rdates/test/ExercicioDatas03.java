import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;

class CalculadoraDeProgresso {
    public Duration calcularDuracao(Temporal inicio, Temporal fim) {
        Duration duracao = Duration.between(inicio, fim);
        return duracao;
    }
}

public class ExercicioDatas03 {
    public static void main(String[] args) {
        LocalDateTime inicioDoJogo = LocalDateTime.of(2026, 04, 10, 21, 10, 15);
        LocalDateTime momentoRankS = LocalDateTime.of(2026, 05, 15, 22, 5, 45);

        CalculadoraDeProgresso calculadora = new CalculadoraDeProgresso();
        Duration resultado = calculadora.calcularDuracao(inicioDoJogo, momentoRankS);

        long longResultado1 = resultado.toDays();
        long longResultado2 = resultado.toHoursPart();

        System.out.println("\nVocê levou " + longResultado1 + " dias e , "
                + longResultado2 + " horas para completar o game!");

    }
}
