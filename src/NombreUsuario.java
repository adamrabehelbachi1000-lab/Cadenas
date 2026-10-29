
import java.util.Scanner;

public class NombreUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce nombre completo: ");
        String nombre = sc.nextLine().trim();

        String[] palabras = nombre.split("\\s+");

        if (palabras.length != 3) {
            System.out.println("Error: debes introducir nombre y dos apellidos.");
        } else {
            String nombre1 = palabras[0].substring(0, 1).toUpperCase() + palabras[0].substring(1).toLowerCase();

            String apellido1 = palabras[1].substring(0, 1).toUpperCase() + palabras[1].substring(1).toLowerCase();

            String apellido2 = palabras[2].substring(0, 1).toUpperCase() + palabras[2].substring(1).toLowerCase();

            System.out.println("Nombre formateado: " + nombre + " " + apellido1 + " " + apellido2);
            System.out.println("Iniciales: " + nombre.substring(0, 1) + "." + apellido1.substring(0, 1) + "." + apellido2.substring(0, 1) + ".");

            String usuario = nombre.substring(0, 1).toLowerCase() + apellido1.toLowerCase() + apellido2.substring(0, 1).toLowerCase();
            System.out.println("Usuario: " + usuario);
        }
    }
}

