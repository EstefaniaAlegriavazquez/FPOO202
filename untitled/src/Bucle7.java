
import java.util.Scanner;
public class Bucle7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número impar que sera la base del árbol : ");
        int base = scanner.nextInt();

        int i = 1;
        while (i <= base) {
            for (int j = 0; j < (base - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            i += 2;
        }

        for (int j = 0; j < (base - 1) / 2; j++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
