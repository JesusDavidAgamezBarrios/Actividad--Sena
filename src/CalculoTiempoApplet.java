import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculoTiempoApplet extends JApplet {
    private JTextField diasField;
    private JTextArea resultadoArea;

    public void init() {
        JPanel panel = new JPanel(new GridLayout(2, 2));

        panel.add(new JLabel("Cantidad de Días:"));
        diasField = new JTextField(10);
        panel.add(diasField);

        JButton calcularButton = new JButton("Calcular Tiempo");
        calcularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularTiempo();
            }
        });

        resultadoArea = new JTextArea(5, 20);
        resultadoArea.setEditable(false);

        add(panel, BorderLayout.NORTH);
        add(calcularButton, BorderLayout.CENTER);
        add(new JScrollPane(resultadoArea), BorderLayout.SOUTH);
    }

    private void calcularTiempo() {
        int cantidadDias = Integer.parseInt(diasField.getText());
        int horas = cantidadDias * 24;
        int minutos = horas * 60;
        int segundos = minutos * 60;

        resultadoArea.setText("Días ingresados: " + cantidadDias + "\n");
        resultadoArea.append("Horas: " + horas + "\n");
        resultadoArea.append("Minutos: " + minutos + "\n");
        resultadoArea.append("Segundos: " + segundos);
    }
}