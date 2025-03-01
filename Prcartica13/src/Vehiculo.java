import javax.swing.JOptionPane;
public class Vehiculo {
    private String placa;
    private String modelo;
    private double capacidadCarga;
    private Conductor conductor;

    //Constructor
    public Vehiculo(String placa, String modelo, double capacidadCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
    }

    //Gets y Sets
    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public double getCapacidadCarga() { return capacidadCarga; }

    public void setPlaca(String placa) { this.placa = placa; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setCapacidadCarga(double capacidadCarga) { this.capacidadCarga = capacidadCarga; }

    public void asignarConductor(Conductor conductor) {
        if (this.conductor == null) {
            this.conductor = conductor;
        } else {
            JOptionPane.showMessageDialog(null, "El conductor ya ha sido asignado.");
        }
    }
}
