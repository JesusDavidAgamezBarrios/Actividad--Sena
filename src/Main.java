import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de FacturaApplet
        FacturaApplet facturaApplet = new FacturaApplet();
        facturaApplet.init();

        // Crear una instancia de CalculoTiempoApplet
        CalculoTiempoApplet calculoTiempoApplet = new CalculoTiempoApplet();
        calculoTiempoApplet.init();

        // Puedes configurar los applets según tus necesidades aquí

        // Añadir los applets a un contenedor, como un JFrame
        JFrame frame = new JFrame("Applets");
        frame.setLayout(new GridLayout(2, 1));

        frame.add(facturaApplet);
        frame.add(calculoTiempoApplet);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}