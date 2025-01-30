import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {

        String verdaderacontrasena = "Fanny123";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe una contraseña: ");
        String contrasena = scanner.nextLine();

        if (verdaderacontrasena.equalsIgnoreCase(contrasena)) {
            System.out.println("Contraseña correcta.");
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }
}