import java.util.Scanner;

public class Bucle5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Escribe una letra: ");
        char letra = scanner.next().trim().charAt(0);

        int contador = 0, i = 0;

        while (i < frase.length()) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
            i++;
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");

    }
}









