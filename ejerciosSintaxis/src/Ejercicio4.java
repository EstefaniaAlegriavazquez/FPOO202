
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");
        String nombre = scn.nextLine();

        String nombreMayusculas = nombre.toUpperCase();

        int numeroLetras = nombre.replace(" ", "").length();

        System.out.println(nombreMayusculas + " tiene " + numeroLetras + " letras.");

    }
}

