import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = scn.nextLine();

        String fraseInvertida = new StringBuilder(frase).reverse().toString();

        System.out.println("Frase invertida: " + fraseInvertida);

    }
}

