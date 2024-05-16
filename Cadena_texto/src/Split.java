public class Split {
    public static void main(String[] args) {
        String str = "Hola, soy lionel messi,y, soy futbolista";
        String[] tpartes = str.split(",");

        // Imprimir cada elemento del array
        for (String parte : tpartes) {
            System.out.println(parte);
        }
    }
}
