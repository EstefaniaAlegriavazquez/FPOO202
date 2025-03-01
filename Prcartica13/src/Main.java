import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = null;
        Conductor conductor = null;
        Envio envio = null;
        Entrega entrega = null;

        while (true) {
            String opcion = JOptionPane.showInputDialog("Menú:\n1. Registrar Vehículo\n2. Registrar Conductor\n3. Asignar Conductor a Vehículo\n4. Registrar Envío\n5. Registrar Entrega\n6. Actualizar Estado de Entrega\n7. Mostrar Información\n8. Salir");
            switch (opcion) {
                case "1":
                    String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    double carga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga (kg):"));
                    vehiculo = new Vehiculo(placa, modelo, carga);
                    JOptionPane.showMessageDialog(null, "El Vehículo se registro correctamente.");
                    break;
                case "2":
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                    String id = JOptionPane.showInputDialog("Ingrese la identificación:");
                    String licencia = JOptionPane.showInputDialog("Ingrese la licencia:");
                    conductor = new Conductor(nombre, id, licencia);
                    JOptionPane.showMessageDialog(null, "Conductor registrado correctamente.");
                    break;
                case "3":
                    if (vehiculo == null || conductor == null) {
                        JOptionPane.showMessageDialog(null, "Debe registrar el vehículo y el conductor primero.");
                    } else {
                        vehiculo.asignarConductor(conductor);
                        JOptionPane.showMessageDialog(null, "Conductor asignado correctamente.");
                    }
                    break;
                case "4":
                    envio = Envio.crearEnvio();
                    JOptionPane.showMessageDialog(null, "Envío registrado correctamente.");
                    break;
                case "5":
                    String guia = JOptionPane.showInputDialog("Ingrese el número de guía:");
                    entrega = new Entrega(guia);
                    JOptionPane.showMessageDialog(null, "Entrega registrada correctamente.");
                    break;
                case "6":
                    if (entrega == null) {
                        JOptionPane.showMessageDialog(null, "Debe registrar la entrega primero.");
                    } else {
                        String estado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito / Entregado):");
                        entrega.actualizarEstado(estado);
                        JOptionPane.showMessageDialog(null, "Estado actualizado a: " + entrega.getEstado());
                    }
                    break;
                case "7":
                    JOptionPane.showMessageDialog(null, "Información:\nVehículo: " + (vehiculo != null ? vehiculo.getPlaca() : "No registrado") +
                            "\nConductor: " + (conductor != null ? conductor.getNombre() : "No registrado") +
                            "\nEstado Entrega: " + (entrega != null ? entrega.getEstado() : "No registrada"));
                    break;
                case "8":
                    JOptionPane.showMessageDialog(null, "Programa terminado.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
    }
}
