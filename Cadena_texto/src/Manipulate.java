import java.time.LocalDate;

public class Manipulate {
public static void main(String[] args) {
    LocalDate navidad1943=  LocalDate.of(1943,12,25);
LocalDate masunDía = navidad1943.plusDays(1);
System.out.println(masunDía);

LocalDate menosDosMeses = navidad1943.minusMonths(2);
System.out.println(menosDosMeses);
}
}
