import java.util.Scanner;

public class Bucles1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero que sea positivo: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i += 2) {
            System.out.print(i);
            if (i + 2 <= numero) {
                System.out.print(", ");
            }
        }
    }
}














