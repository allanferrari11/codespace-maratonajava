import java.util.Calendar;
import java.util.Date;
// import java.text.SimpleDateFormat;
// import java.util.Locale;

public class RevisaoDatas02 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        System.out.println(calendario);

        calendario.set(Calendar.YEAR, 2015);
        calendario.set(Calendar.MONTH, Calendar.JUNE);
        calendario.set(Calendar.DAY_OF_MONTH, 23);

        Date dataBruta = calendario.getTime();

        System.out.println("\nData Bruta: " + dataBruta);

        // Locale localeBR = new Locale("pt", "BR");

        // SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy 'às' HH:mm", localeBR);

        // System.out.println("Data Legada Formatada: " + formatador.format(dataBruta));

    }
}
