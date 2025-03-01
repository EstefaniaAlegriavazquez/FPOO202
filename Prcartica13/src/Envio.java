import javax.swing.JOptionPane;
public class Envio {
    private String codigoEnvio;
    private String destino;
    private double peso;

    //Constructor 1
    public Envio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
    }
    //Constructor 2
    public Envio(String codigoEnvio, String destino, double peso) {
        this(codigoEnvio, destino);
        this.peso = peso;
    }

    //Gets y Sets
    public String getCodigoEnvio() { return codigoEnvio; }
    public String getDestino() { return destino; }
    public double getPeso() { return peso; }

    public void setPeso(double peso) { this.peso = peso; }

    public static Envio crearEnvio() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código del envío:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino del envío:");
        String pesoStr = JOptionPane.showInputDialog("Ingrese el peso del envío (opcional):");
        if (pesoStr.isEmpty()) {
            return new Envio(codigo, destino);
        } else {
            double peso = Double.parseDouble(pesoStr);
            return new Envio(codigo, destino, peso);
        }
    }
}