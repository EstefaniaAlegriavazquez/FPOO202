public class Main {
    public static  void main (String [] args){

        // creamos el primer objeto
        Spartan jefemaestro = new Spartan();

        // usar atributos
        jefemaestro.nombre= "John";
        jefemaestro.salud= 100;
        jefemaestro.escudo= 70;
        jefemaestro.armaPrincipal= "Rifle de asalto";

        //invocamos los metodos
        jefemaestro.mostrarInfo();
        jefemaestro.atacar("Grunt");
        jefemaestro.recargarArma(75);
        jefemaestro.correr(true);

        //creamos el segundo objeto
        Spartan CoronelMorgan = new Spartan();

        CoronelMorgan.nombre= "Christopher";
        CoronelMorgan.salud= 100;
        CoronelMorgan.escudo= 100;
        CoronelMorgan.armaPrincipal= "Ametralladora 345";

        CoronelMorgan.mostrarInfo();
        CoronelMorgan.atacar("Antoni Marcherano");
        CoronelMorgan.recargarArma(80);
        CoronelMorgan.correr(true);


    }
}
