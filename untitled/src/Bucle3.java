
import java.util.Scanner;
public class Bucle3 {
    public static void main(String[] args) {
       int i;
       int a;

        for (i = 1; i <= 10; i++) {
            System.out.println(" Tu tabla del " + i + ":");
            for ( a = 1; a <= 10; a++) {
                System.out.println(i + " x " + a + " = " + (i * a));
            }
        }


    }
}
