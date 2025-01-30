
import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Primer número: ");
        double num1 = scn.nextDouble();

        System.out.print("Operador (+, -, *, /): ");
        char operador = scn.next().charAt(0);

        System.out.print("Segundo número: ");
        double num2 = scn.nextDouble();

        double resultado = 0;
        boolean valido = true;

        if (operador == '+') {
            resultado = num1 + num2;
        } else if (operador == '-') {
            resultado = num1 - num2;
        } else if (operador == '*') {
            resultado = num1 * num2;
        } else if (operador == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Error: No se puede dividir por cero.");
                valido = false;
            }
        } else {
            System.out.println("Error: Operador no válido.");
            valido = false;
        }

        if (valido) {
            System.out.println("Resultado: " + resultado);
        }

        scn.close();
    }
}


