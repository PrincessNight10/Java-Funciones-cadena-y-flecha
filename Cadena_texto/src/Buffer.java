public class Buffer {
    public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();

        sb. append("Hola");
        sb. append("Soy");
        sb. append("Leo");
        System.out.println(sb.toString());

        sb.insert(7, "." );
        System.out.println(sb.toString());

        sb.replace(2,6, " ");
        System.out.println(sb.toString());

    }
    }
