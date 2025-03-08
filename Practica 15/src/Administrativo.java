import javax.swing.JOptionPane;
public class Administrativo extends Empleado {
    // Atributo adicional
    private String departamento;

    // Constructor
    public Administrativo(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario);  // Por aqui se llama al constructor de la clase base
        this.departamento = departamento;
    }


    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Llamada al método mostrarInfo de la clase base
        String info = "\nDepartamento: " + departamento;
        JOptionPane.showMessageDialog(null, info);
    }
}

