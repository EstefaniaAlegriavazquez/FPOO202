
import javax.swing.JOptionPane;

public class Password {
    private int longitud;
    private boolean incluirMayusculas;
    private boolean incluirEspeciales;

    // Constructor
    public Password(int longitud, boolean incluirMayusculas, boolean incluirEspeciales) {
        this.longitud = longitud;
        this.incluirMayusculas = incluirMayusculas;
        this.incluirEspeciales = incluirEspeciales;
    }

    // Getters y Setters
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isIncluirMayusculas() {
        return incluirMayusculas;
    }

    public void setIncluirMayusculas(boolean incluirMayusculas) {
        this.incluirMayusculas = incluirMayusculas;
    }

    public boolean isIncluirEspeciales() {
        return incluirEspeciales;
    }

    public void setIncluirEspeciales(boolean incluirEspeciales) {
        this.incluirEspeciales = incluirEspeciales;
    }

    public String generarPassword() {
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String especiales = "!@#$%^&*";
        String caracteres = minusculas;

        if (incluirMayusculas) {
            caracteres += mayusculas;
        }
        if (incluirEspeciales) {
            caracteres += especiales;
        }

        String password = "";
        for (int i = 0; i < longitud; i++) {
            int index = (int) (Math.random() * caracteres.length());
            password += caracteres.charAt(index);
        }

        return password;
    }

    public String comprobarFortaleza(String password) {
        int puntos = 0;

        if (password.length() >= 8) {
            puntos++;
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                puntos++;
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if ("!@#$%^&*".contains(String.valueOf(password.charAt(i)))) {
                puntos++;
                break;
            }
        }

        if (puntos == 3) {
            return "Fuerte";
        } else if (puntos == 2) {
            return "Media";
        } else {
            return "Débil";
        }
    }
}
