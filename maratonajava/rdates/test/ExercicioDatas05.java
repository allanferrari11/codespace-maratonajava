import java.time.LocalDate;
import java.time.Period;

public class ExercicioDatas05 {
    public static void main(String[] args) {
        LocalDate dataAdmissao = LocalDate.of(2021, 7, 15);
        LocalDate hoje = LocalDate.now();

        Period periodo = Period.between(dataAdmissao, hoje);

        System.out.println("Tempo do colaborador: \n"
                + periodo.getYears() + " anos, " + periodo.getMonths()
                + " meses e ");

        if (periodo.getDays() == 1) {
            System.out.print(periodo.getDays() + " dia.");
        } else {
            System.out.print(periodo.getDays() + " dias.");
        }
    }
}
