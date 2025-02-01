import java.util.Scanner;

public class Bucle6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 0;

        System.out.println("Escribe la bitácora de operaciones:");

        while (true) {
            String operacion = scanner.nextLine().trim();

            if (operacion.isEmpty()) {
                break;
            }

            char tipo = operacion.charAt(0);
            int monto = Integer.parseInt(operacion.substring(2));

            if (tipo == 'D') {
                saldo += monto;
            } else if (tipo == 'R') {
                saldo -= monto;
            }
        }

        System.out.println("Saldo final: " + saldo);

    }

}