import java.time.LocalDate;

public class Components {
    public static void main(String[] args) {

        LocalDate navidad1943 = LocalDate.of(1943,12,25);
int año = navidad1943.getYear();
int mes = navidad1943.getMonthValue();
int dia   = navidad1943.getDayOfMonth();

System.out.println(año);
System.out.println(mes);
System.out.println(dia);

    }
}
