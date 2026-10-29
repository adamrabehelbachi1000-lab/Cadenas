import java.util.Scanner;

public class LongitudI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine().trim();

        System.out.println(" y una longitud: ");
        int longitud = sc.nextInt();
        int contador = comprueba(frase, longitud);

        System.out.println("Hay " + contador + " palabra/s con una longitud de " + longitud + " caracteres");
    }
    public static int comprueba(String frase, int longitud) {
        int contador = 0;
        String[] palabras = frase.split("\\s+");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == longitud) {
                contador++;
            }
        }
        return contador;
    }
}
