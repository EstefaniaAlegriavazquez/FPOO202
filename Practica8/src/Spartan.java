
public class Spartan {
    public String nombre;
    int escudo, salud;
    String armaPrincipal;

    public void mostrarInfo(){
        System.out.println("-----------Infomacion del Spartan--------");
        System.out.println("Spartan: "+nombre);
        System.out.println("% de Salud: "+salud);
        System.out.println("% de Escudo: "+escudo);
        System.out.println("Arma disponible: "+armaPrincipal);
        System.out.println("-------------------------------------------");
    }//llave mostrar info

    public void atacar(String enemigo){
        System.out.println(nombre+ " ataca a"+ enemigo+ "con"+ armaPrincipal);
    }

    public void recargarArma(int municiones){
        int restantes= 10;
        int total = restantes + municiones;
        System.out.println(armaPrincipal + " ahora tiene disponible"+ total + "balas");
    }

    public void correr(boolean status){
        if (status){
            System.out.println(nombre+ "esta corriendo");
        }else{
            System.out.println(nombre+ "se detuvo");
        }
    }

}//llave de la clase
