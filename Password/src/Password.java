
import javax.swing.JOptionPane;

public class Password {
    private int longitud = 8;
    private boolean incluir_Mayusculas;
    private boolean incluir_Especiales;

    public String generarPassword(int longitud, boolean incluir_Mayusculas, boolean incluir_Especiales) {
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String especiales = "!@#$%^&*";
        String caracteres = minusculas;

        if (incluir_Mayusculas) {
            caracteres += mayusculas;
        }
        if (incluir_Especiales) {
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
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                puntos++;
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if ("!@#$%^&*".contains(String.valueOf(c))) {
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
