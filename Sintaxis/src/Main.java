
//Zona de importacion
import java.util.Scanner;

//Clase principal
public class Main {

    //Metodo principal
    public static void main(String[] args) {

/*             comentario
               varias lineas
               System.out.println("Hello, Estefania!");
 */


        //2. Cadenas
       /* String cadena= "Estefania" + "Alegria" + "Vazquez";
        System.out.println(cadena);

       //Conteo de longitud de cadena
        System.out.println(cadena.length());

       //Extraccion de caracteres en base a parametros
        System.out.println(cadena.substring(2,5));
        System.out.println(cadena.substring(5));
        System.out.println(cadena.substring(0,5));*/

        //3. Variables
       /* String cadena= "333" , cadena2, cadena3;
        int entero= 3, entero2, entero3;
        double decimal= 3.34546, decimal2, decimal3;

        //Convertir cadena a int
        entero2=Integer.parseInt(cadena);
        System.out.println(entero2);

        //convertir double a int
        entero3= (int) decimal;
        System.out.println(entero3);

        //Convertir double a cadena
        cadena2= String.valueOf(decimal);
        System.out.println(cadena2);

        //convertir int a double
        decimal2= Double.valueOf(entero);
        System.out.println(decimal2);

        //Conversion implisita
        int i=12;
        double numd= i;
        System.out.println(numd);*/

        //4. Solicitud de datos
        /*Scanner scn= new Scanner(System.in);

        System.out.println("Escribe una cadena: ");
        String cadena= scn.nextLine();

        System.out.println("Escribe una numero entero: ");
        int entero= scn.nextInt();

        System.out.println("Escribe una numero decimal: ");
        double decimal= scn.nextDouble();

        System.out.println("numero decimal guardado:"+ decimal);
        System.out.println("numero entero guardado:"+ entero);
        System.out.println("Cadena guardada:"+ cadena);*/

        //5. Boolean , operadores logicos y de comparacion
        System.out.println(10 > 9);
        System.out.println(10 == 9);
        System.out.println(10 < 9);
        System.out.println(10 >= 9);
        System.out.println(10 <= 9);
        System.out.println(10 != 9);

        //Operadores logicos
        int x= 3;
        System.out.println(x< 5 && x>10); //false
        System.out.println(x< 5 || x>10);  //true
        System.out.println(!(x< 5 && x>10)); //true
        System.out.println(!(x< 5 || x>10)); //false







    }
}