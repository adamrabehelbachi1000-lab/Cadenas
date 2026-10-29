import java.util.Scanner;

public class Analizar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        System.out.print("Longitud: ");
        System.out.print(palabra.length());

        System.out.println("");

        System.out.print("Primera letra: ");
        System.out.print(palabra.charAt(0));

        System.out.println("");

        System.out.print("Ultima letra: ");
        System.out.println(palabra.charAt(palabra.length() - 1));

        System.out.print("Mayúsculas: ");
        System.out.print(palabra.toUpperCase());
        System.out.println("");

        System.out.print("Minúsculas: ");
        System.out.print(palabra.toLowerCase());
        System.out.println("");

        int contador_a = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char c = Character.toLowerCase(palabra.charAt(i));
            if ("a".indexOf(c) != -1) {
                contador_a++;
            }
        }
        System.out.print("Numero de 'a': " +  contador_a);
    }
}
