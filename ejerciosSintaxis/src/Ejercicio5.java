import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int pesopayaso = 112;
        int pesomuneca = 75;

        System.out.println("Escribe el número de payasos que vendio: ");
        int cantidadpayasos = scn.nextInt();

        System.out.println("Escribe el número de muñecas vendidas: ");
        int cantidadmunecas = scn.nextInt();

        int pesoTotal = (cantidadpayasos * pesopayaso) + (cantidadmunecas * pesomuneca);

        System.out.println("El peso total del paquete es: " + pesoTotal + " gramos.");
        
    }
}

