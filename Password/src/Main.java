import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Password password = null;
        String ultimaPassword = "";

        String opcion;
        do {
            opcion = JOptionPane.showInputDialog(
                    "Elige una opción:\n" +
                            "1. Generar contraseña\n" +
                            "2. Comprobar fortaleza de la última contraseña\n" +
                            "3. Salir"
            );

            if (opcion == null) break;

            switch (opcion) {
                case "1":
                    String inputLongitud = JOptionPane.showInputDialog("Ingresa la longitud de la contraseña (por defecto 8):");
                    int longitud = 8;
                    if (inputLongitud != null && !inputLongitud.isEmpty()) {
                        longitud = Integer.parseInt(inputLongitud);
                    }

                    int mayus = JOptionPane.showConfirmDialog(null, "¿Quieres que tenga mayúsculas?", "Configuración", JOptionPane.YES_NO_OPTION);
                    boolean incluirMayus = (mayus == JOptionPane.YES_OPTION);

                    int especiales = JOptionPane.showConfirmDialog(null, "¿Quieres que tenga caracteres especiales?", "Configuración", JOptionPane.YES_NO_OPTION);
                    boolean incluirEspeciales = (especiales == JOptionPane.YES_OPTION);

                    password = new Password(longitud, incluirMayus, incluirEspeciales);


                    ultimaPassword = password.generarPassword();
                    JOptionPane.showMessageDialog(null, "Contraseña generada: " + ultimaPassword);
                    break;

                case "2":
                    if (ultimaPassword.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Primero genera una contraseña.");
                    } else {
                        String fortaleza = password.comprobarFortaleza(ultimaPassword);
                        JOptionPane.showMessageDialog(null, "La fortaleza de la contraseña es: " + fortaleza);
                    }
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, "Saliendo de la aplicación.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (!"3".equals(opcion));
    }
}
