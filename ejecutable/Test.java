package ejecutable;

import java.security.MessageDigest;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        // Hallar el mayor de 3 numeros

        // declaración de variables
        int x;
        int y;
        int z;

        // input
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el primero número"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));
        z = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercero número"));

        // proccesing ªª\\
        if (x > y && x > z) {
            JOptionPane.showMessageDialog(null,
                    "Entre los números " + x + ", " + y + ", " + z + " el mayor es :" + x,
                    "Resultado",
                    JOptionPane.WARNING_MESSAGE);

        } else if (y > x & y > z) {
            JOptionPane.showMessageDialog(null,
                    "Entre los números " + x + ", " + y + ", " + z + " el mayor es :" + y,
                    "Resultado",
                    JOptionPane.WARNING_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null,
                    "Entre los números " + x + ", " + y + ", " + z + " el mayor es :" + z,
                    "Resultado",
                    JOptionPane.WARNING_MESSAGE);
        }

        // output

        // end

    }
}
