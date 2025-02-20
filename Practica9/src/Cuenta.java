
import javax.swing.JOptionPane;

public class Cuenta {
    public int NoCuenta;
    public String Titular;
    public float Saldo;

    public void ConsultarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo actual: $" + Saldo);
    }

    public void IngresarEfectivo(float monto) {
        Saldo += monto;
        JOptionPane.showMessageDialog(null, "Ingresaste $" + monto);
    }

    public void RetirarEfectivo(float monto) {
        if (monto <= Saldo) {
            Saldo -= monto;
            JOptionPane.showMessageDialog(null, "Retiraste $" + monto);
        } else {
            JOptionPane.showMessageDialog(null, "No tienes suficiente saldo.");
        }
    }

    public void Depositar(Cuenta cuentaDestino, float monto) {
        if (monto <= Saldo) {
            Saldo -= monto;
            cuentaDestino.IngresarEfectivo(monto);
            JOptionPane.showMessageDialog(null, "Depositaste $" + monto + " a la cuenta destino.");
        } else {
            JOptionPane.showMessageDialog(null, "No tienes suficiente saldo para depositar.");
        }
    }
}
