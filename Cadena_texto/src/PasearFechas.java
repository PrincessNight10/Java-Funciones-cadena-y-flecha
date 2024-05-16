import java.time. LocalDate;
import java.time.format.DateTimeFormatter;
import  java.time.format.DateTimeParseException;
public class PasearFechas {
    public static void main(String[] args) {
        String  fechaComoString = "28/06/2002";
        DateTimeFormatter formatoEspaña = DateTimeFormatter.ofPattern("dd/MM/yyyy");
   try {
       LocalDate fechaParseada = LocalDate.parse(fechaComoString,formatoEspaña);
       System.out.println(fechaParseada);

   } catch (DateTimeParseException e) {
       System.out.println("La cadena no tiene un formato de fecha validso");
   }


    }
}
