
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.NoCuenta = 123046139;
        cuenta.Titular = "Estefania Alegria Vazquez";
        cuenta.Saldo = 1200000;

        Cuenta cuentaDestino = new Cuenta();
        cuentaDestino.NoCuenta = 987654321;
        cuentaDestino.Titular = "Cuenta Destino";
        cuentaDestino.Saldo = 500000;

        String opcion;
        do {
            opcion = JOptionPane.showInputDialog(
                    "Elige una opción:\n" +
                            "1. Consultar saldo\n" +
                            "2. Ingresar efectivo\n" +
                            "3. Retirar efectivo\n" +
                            "4. Depositar a otra cuenta\n" +
                            "5. Salir"
            );

            if (opcion == null) break;

            switch (opcion) {
                case "1":
                    cuenta.ConsultarSaldo();
                    break;
                case "2":
                    float ingreso = Float.parseFloat(JOptionPane.showInputDialog("Monto a ingresar:"));
                    cuenta.IngresarEfectivo(ingreso);
                    break;
                case "3":
                    float retiro = Float.parseFloat(JOptionPane.showInputDialog("Monto a retirar:"));
                    cuenta.RetirarEfectivo(retiro);
                    break;
                case "4":
                    float deposito = Float.parseFloat(JOptionPane.showInputDialog("Monto a depositar en otra cuenta:"));
                    cuenta.Depositar(cuentaDestino, deposito);
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (!"5".equals(opcion));
    }
}
