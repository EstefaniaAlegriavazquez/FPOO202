

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Escribe tu nombre completo: ");
        String nombreCompleto = scn.nextLine();

        System.out.println("En minúsculas: " + nombreCompleto.toLowerCase());

        System.out.println("En mayúsculas: " + nombreCompleto.toUpperCase());

        String[] palabras = nombreCompleto.toLowerCase().split(" ");
        String resultado = "";
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                resultado += palabra.substring(0, 1).toUpperCase() + palabra.substring(1) + " ";
            }
        }

        System.out.println("Con iniciales en mayúscula: " + resultado.trim());

    }
}

