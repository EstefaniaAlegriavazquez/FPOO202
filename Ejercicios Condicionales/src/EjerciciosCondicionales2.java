
import java.util.Scanner;
public class EjerciciosCondicionales2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numentero = scn.nextInt();

        if (numentero % 2== 0){
            System.out.print("Tu numero es par");
        }else{
            System.out.print("Tu numero es impar");
        }

    }

}
