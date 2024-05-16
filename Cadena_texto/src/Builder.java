public class Builder {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb. append("Hola");
        sb. append("Don");
        sb. append("Heriberto");
        System.out.println(sb.toString());

       sb.insert(7, "." );
       System.out.println(sb.toString());

       sb.replace(2,6, " ");
       System.out.println(sb.toString());


    }
    }
