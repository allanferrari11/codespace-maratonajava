import java.time.LocalDate;

public class DiaUtilSemTemporalAdjuster {

    // Lógica para capturar o próximo dia útil antes de estudar TemporalAdjuster
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.of(2026, 9, 18);
        LocalDate proximoDiaUtil;

        switch (hoje.getDayOfWeek()) {
            case FRIDAY:
                proximoDiaUtil = hoje.plusDays(3);
                break;
            case SATURDAY:
                proximoDiaUtil = hoje.plusDays(2);
                break;
            default:
                proximoDiaUtil = hoje.plusDays(1);
                break;
        }

        System.out.println("Data de hoje: " + hoje + " (" + hoje.getDayOfWeek() + ")");
        System.out.println("Próximo dia útil: " + proximoDiaUtil + " (" + proximoDiaUtil.getDayOfWeek() + ")");
    }
}