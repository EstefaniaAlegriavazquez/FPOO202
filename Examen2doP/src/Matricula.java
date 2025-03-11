import javax.swing.JOptionPane;

public class Matricula {
    String Nombre;
    String AP;
    String AM;
    int Año_Nacimiento;
    String Carrera;


    public Matricula(String nombre, String AP, String AM, int año_Nacimiento, String carrera) {
        Nombre = nombre;
        this.AP = AP;
        this.AM = AM;
        Año_Nacimiento = año_Nacimiento;
        Carrera = carrera;
    }
    public GenerarMatricula(String nombre, String AP, String AM, int año_Nacimiento, String carrera) {
        this.Nombre= ("Primera letra del nombre");
        this.AP = ("Primera letra apellido");
    }

    public void MostrarNombre(){
        JOptionPane.showMessageDialog("Escribe tu nombre " + Nombre);
        this.Nombre = Nombre;
    }

    public void MostrarApellidoPaterno(){
        JOptionPane.showMessageDialog( "Escribe tu Apellido Paterno " + AP);
    }

    public void MostrarApellidoMaterno(){
        JOptionPane.showMessageDialog("Escribe tu Apellido Materno " + AM);
    }

    public void MostrarAño_Nacimiento(){
        JOptionPane.showMessageDialog("Escribe tu Año de nacimiento " +Año_Nacimiento);
    }

    public void MostrarCarrera(){
        JOptionPane.showMessageDialog("Escribe en que carrera vas " +Carrera);
    }

}
