import javax.swing.JOptionPane;

public class Empleado {
    // Atributos
    private String nombre;
    private int id;
    private double salario;

    // Constructor
    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    // Método mostrarInfo
    public void mostrarInfo() {
        String info = "Nombre: " + nombre + "\nID: " + id + "\nSalario: " + salario;
        JOptionPane.showMessageDialog(null, info);
    }
}

