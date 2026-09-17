import java.time.Duration;
import java.time.LocalTime;

class calculadoraDeSessao {

    public Duration calcular(LocalTime inicio, LocalTime fim) {
        Duration duracao = Duration.between(inicio, fim);

        if (duracao.isNegative()) {
            duracao = duracao.plusDays(1);
        }

        return duracao;
    }

}

public class ExercicioDatas02 {
    public static void main(String[] args) {
        LocalTime horaInicio = LocalTime.of(21, 30);
        LocalTime horaFim = LocalTime.of(1, 15); // Quem dera jogar tanto rsrs

        calculadoraDeSessao calculadora = new calculadoraDeSessao();

        Duration tempoJogado = calculadora.calcular(horaInicio, horaFim);

        System.out.println(tempoJogado);

        long horas = tempoJogado.toHours();
        long minutos = tempoJogado.toMinutesPart();

        System.out.println("Tempo total da sessão: " + horas + " horas e " + minutos + " minutos.");

    }
}
