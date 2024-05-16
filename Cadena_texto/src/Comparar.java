import java.time. LocalDate
        ;
public class Comparar {
    public static void main(String[] args) {
        LocalDate navidad2012=  LocalDate.of(2012,12,25);
        LocalDate otraFecha = LocalDate.of(2012, 12, 24);

     boolean esAntes = otraFecha.isBefore(navidad2012);
        boolean esDespues = otraFecha.isAfter(navidad2012);

        boolean sonIguales = otraFecha.isEqual(navidad2012);
    System.out.println(esAntes);
    System.out.println(esDespues);
    System.out.println(sonIguales);
    }
}
