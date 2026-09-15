import java.time.LocalDate;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class RevisaoDatas03 {
    public static void main(String[] args) {
        String dataDigitada = "15/12/2022";
        DateTimeFormatter formatadorEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate dataConvertida = LocalDate.parse(dataDigitada, formatadorEntrada);
            System.out.println("Data validada e convertida: " + dataConvertida);

        } catch (DateTimeParseException e) {
            System.out.println("Erro: Formato inválido. Use dd/MM/yyyy.");
        }

        Instant carimboBancoDeDados = Instant.now();
        System.out.println("Momento exato da transação (UTC): " + carimboBancoDeDados);
    }
}
