
import javax.swing.JOptionPane;
public class Conductor extends Empleado {
    // Atributo adicional
    private String licencia;

    // Constructor
    public Conductor(String nombre, int id, double salario, String licencia) {
        super(nombre, id, salario);  // Desde aqui se llama al constructor de la clase base
        this.licencia = licencia;
    }

    // Sobrescribir el método mostrarInfo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Llamada al método mostrarInfo de la clase base
        String info = "\nLicencia: " + licencia;
        JOptionPane.showMessageDialog(null, info);
    }
}
