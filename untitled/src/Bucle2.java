import java.util.Scanner;
public class Bucle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe un número entero positivo: ");
        int num = scanner.nextInt();

        for (int i = num; i >= 0; i--) {
            System.out.print(i);
            if (i > 0) {
                System.out.print(", ");
            }
        }

    }

    }











