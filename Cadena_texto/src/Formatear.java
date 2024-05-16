import java.time. LocalDate;
import java.time.format.DateTimeFormatter;

public class Formatear {
    public static void main(String[] args) {
        LocalDate fechaFormatada =  LocalDate.of(2014,10,31);
        DateTimeFormatter formatoEspaña = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaEnEspañol = fechaFormatada.format(formatoEspaña);
        System.out.println(fechaEnEspañol);
    }
}
