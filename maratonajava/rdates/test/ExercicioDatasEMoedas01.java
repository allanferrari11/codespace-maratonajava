// import java.text.NumberFormat;
// import java.time.DayOfWeek;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// import java.util.Locale;
// import java.time.temporal.ChronoUnit;
// import java.time.temporal.Temporal;
// import java.time.temporal.TemporalAdjuster;

// class ProximoDiaUtil implements TemporalAdjuster {
//     public Temporal adjustInto(Temporal temporal) {
//         DayOfWeek diaDaSemana = DayOfWeek.from(temporal);
//         int addDays;

//         switch (diaDaSemana) {
//             case SUNDAY:
//                 addDays = 1;
//                 break;
//             default:
//                 addDays = 0;
//                 break;
//         }
//         return temporal.plus(addDays, ChronoUnit.DAYS);
//     }
// }

// class Service {
//     public String relatorioPreVenda(String titulo, double preco,
//             LocalDateTime dataLancamento, LocalDateTime dataPreLoad, NumberFormat formatadorBR,
//             DateTimeFormatter padraoBR) {

//         return "\nRELATÓRIO PRÉ-VENDA\nJogo: " + titulo +
//                 "\nValor: " + formatadorBR.format(preco) + "\n\nLançamento Oficial: " + padraoBR.format(dataLancamento)
//                 + "\nData do Pré-Load: " + padraoBR.format(dataPreLoad);
//     }
// }

// public class ExercicioDatasEMoedas01 {
//     public static void main(String[] args) {
//         String titulo = "Resident Evil 9";
//         double precoDB = 349.90;
//         LocalDateTime dataLancamentoDB = LocalDateTime.of(2026, 10, 21, 23, 59);
//         Locale localeBR = new Locale("pt", "BR");
//         NumberFormat formatadorBR = NumberFormat.getCurrencyInstance(localeBR);
//         DateTimeFormatter padraoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");

//         LocalDateTime dataPreLoad = dataLancamentoDB.minusDays(5).with(new ProximoDiaUtil());

//         Service service = new Service();
//         System.out.println(service.relatorioPreVenda(titulo, precoDB, dataLancamentoDB, dataPreLoad, formatadorBR, padraoBR));
//     }
// }
