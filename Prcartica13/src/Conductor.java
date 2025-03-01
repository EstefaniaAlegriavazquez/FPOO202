import javax.swing.JOptionPane;
public class Conductor {
    private String nombre;
    private String identificacion;
    private String licencia;

    //Constructor
    public Conductor(String nombre, String identificacion, String licencia) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.licencia = licencia;
    }

    //Gets y Sets
    public String getNombre() { return nombre; }
    public String getIdentificacion() { return identificacion; }
    public String getLicencia() { return licencia; }
}

