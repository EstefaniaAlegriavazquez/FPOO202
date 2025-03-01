import javax.swing.JOptionPane;
public class Entrega {
    private String numeroGuia;
    private String estado = "Pendiente";

    //Constructor
    public Entrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    //Gets y Sets
    public String getEstado() { return estado; }

    public void actualizarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("En tránsito") || nuevoEstado.equals("Entregado")) {
            this.estado = nuevoEstado;
        } else {
            JOptionPane.showMessageDialog(null, "Estado inválido.");
        }
    }

}
