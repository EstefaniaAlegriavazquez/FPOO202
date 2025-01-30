
import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = scn.nextLine();

        String cadenaLimpia = cadena.replaceAll("\\s", "").toLowerCase();
        String reversa = new StringBuilder(cadenaLimpia).reverse().toString();

        if (cadenaLimpia.equals(reversa)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }

    }
}

