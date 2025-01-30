
import java.util.Scanner;
public class Condicional3 {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scn.nextInt();
        int precio;

        if (edad<4){
          precio= 0;
        }else if(edad<=18){
           precio=110;
        }else{
           precio=190;

    }
        System.out.print("Tu total a pagar es: "+ precio);

    }
}
