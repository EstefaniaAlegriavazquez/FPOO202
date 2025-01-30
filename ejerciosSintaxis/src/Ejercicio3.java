
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Escribe un numero entero: ");
        int Numero = scn.nextInt();

        int suma = 0;

        for (int i = 1; i <= Numero; i++) {
            suma += i;
        }
        System.out.println("La suma de los numeros es: " + suma);


    }
}