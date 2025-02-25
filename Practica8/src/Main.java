public class Main {
    public static  void main (String [] args){

        // creamos el primer objeto
        Spartan jefemaestro = new Spartan("John",100,70,"Rifle de asalto");

        // usar atributos
        /*jefemaestro.setNombre("John");
        jefemaestro.setSalud(100);
        jefemaestro.setEscudo(70);
        jefemaestro.setArmaPrincipal("Rifle de asalto");
*/
        //invocamos los metodos
        jefemaestro.mostrarInfo();
        jefemaestro.atacar("Grunt");
        jefemaestro.recargarArma(75);
        jefemaestro.correr(true);

/*
        jefemaestro.consultaCortana();
*/

        //usamos get y set para cambiar atributo nombre
        jefemaestro.setNombre("Estefania Alegria Vazquez");
        jefemaestro.mostrarInfo();
        System.out.println(jefemaestro.getNombre());


        //creamos el segundo objeto
        Spartan CoronelMorgan = new Spartan( "Christopher",100,100,"Ametralladora 345");

        /*CoronelMorgan.setNombre( "Christopher");
        CoronelMorgan.setSalud(100);
        CoronelMorgan.setEscudo(100);
        CoronelMorgan.setArmaPrincipal("Ametralladora 345");
*/
        CoronelMorgan.mostrarInfo();
        CoronelMorgan.atacar("Antoni Marcherano");
        CoronelMorgan.recargarArma(80);
        CoronelMorgan.correr(true);


    }
}
