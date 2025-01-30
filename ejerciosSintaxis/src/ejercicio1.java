
import java.util.Scanner;
public class ejercicio1 {
int horas;
int pghora;
int pago;

public static void main(String [] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Escribe número de horas trabajadas: ");
    int horas = scn.nextInt();

    System.out.println("Escribe el costo por hora: ");
    int pghora = scn.nextInt();

    int pago = horas * pghora;

    System.out.println("Tu sueldo correspondiente es: " + pago);
}
}
