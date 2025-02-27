
import javax.swing.JOptionPane;

public class Cuenta {
    private int noCuenta;
    private String titular;
    private float saldo;

    // Constructor
    public Cuenta(int noCuenta, String titular, float saldo) {
        this.noCuenta = noCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getters y Setters
    public int getNoCuenta() {
        return noCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo actual: $" + getSaldo());
    }

    public void ingresarEfectivo(float monto) {
        setSaldo(getSaldo() + monto);
        JOptionPane.showMessageDialog(null, "Ingresaste $" + monto);
    }

    public void retirarEfectivo(float monto) {
        if (monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
            JOptionPane.showMessageDialog(null, "Retiraste $" + monto);
        } else {
            JOptionPane.showMessageDialog(null, "No tienes suficiente saldo.");
        }
    }

    public void depositar(Cuenta cuentaDestino, float monto) {
        if (monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
            cuentaDestino.ingresarEfectivo(monto);
            JOptionPane.showMessageDialog(null, "Depositaste $" + monto + " a la cuenta destino.");
        } else {
            JOptionPane.showMessageDialog(null, "No tienes suficiente saldo para depositar.");
        }
    }
}
