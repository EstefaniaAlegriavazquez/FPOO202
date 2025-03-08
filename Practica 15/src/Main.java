import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Empleado[] empleados = new Empleado[10];
        int contador = 0;

        while (true) {
            // Menú principal
            String menu = "1. Agregar empleado\n2. Listar empleados\n3. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcion == 1) {
                String tipoEmpleado = JOptionPane.showInputDialog("¿Qué tipo de empleado desea agregar?\n1. Conductor\n2. Administrativo");
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado:"));
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

                if (tipoEmpleado.equals("1")) {
                    String licencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia del conductor:");
                    empleados[contador] = new Conductor(nombre, id, salario, licencia);
                } else if (tipoEmpleado.equals("2")) {
                    String departamento = JOptionPane.showInputDialog("Ingrese el departamento del administrativo:");
                    empleados[contador] = new Administrativo(nombre, id, salario, departamento);
                }

                contador++;
            } else if (opcion == 2) {
               
                StringBuilder info = new StringBuilder();
                for (int i = 0; i < contador; i++) {
                    info.append("Empleado " + (i + 1) + ":\n");
                    empleados[i].mostrarInfo();
                    info.append("\n-----------------\n");
                }
                JOptionPane.showMessageDialog(null, info.toString());
            } else if (opcion == 3) {
                // Salir
                break;
            }
        }
    }
}
