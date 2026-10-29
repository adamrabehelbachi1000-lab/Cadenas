import java.util.Scanner;

public class LongitudII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean palabra_longitud = false;

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine().trim();

            System.out.print(" y una longitud: ");
            int longitud = sc.nextInt();

            String[] palabras = frase.split("\\s+");

            for (int i = 0; i < palabras.length; i++) {
                if (palabras[i].length() == longitud) {
                    palabra_longitud = true;
                }

            }
            if (palabra_longitud) {
                System.out.println("Hay alguna palabra con una longitud de " + longitud + " caracteres");
            }else {
                System.out.println("No hay ninguna palabra con una longitud de " + longitud + " caracteres");
            }
    }
    public static boolean palabra_longitud(String frase, int longitud) {

    }
}
