import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FacturaApplet extends JApplet {
    private JTextField clienteField, productoField, valorUnitarioField, cantidadField;
    private JTextArea resultadoArea;

    public void init() {
        JPanel panel = new JPanel(new GridLayout(6, 2));

        panel.add(new JLabel("Nombre del cliente:"));
        clienteField = new JTextField(20);
        panel.add(clienteField);

        panel.add(new JLabel("Nombre del producto:"));
        productoField = new JTextField(20);
        panel.add(productoField);

        panel.add(new JLabel("Valor Unitario:"));
        valorUnitarioField = new JTextField(10);
        panel.add(valorUnitarioField);

        panel.add(new JLabel("Cantidad:"));
        cantidadField = new JTextField(10);
        panel.add(cantidadField);

        JButton calcularButton = new JButton("Calcular Factura");
        calcularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularFactura();
            }
        });

        resultadoArea = new JTextArea(5, 20);
        resultadoArea.setEditable(false);

        add(panel, BorderLayout.NORTH);
        add(calcularButton, BorderLayout.CENTER);
        add(new JScrollPane(resultadoArea), BorderLayout.SOUTH);
    }

    private void calcularFactura() {
        String cliente = clienteField.getText();
        String producto = productoField.getText();
        double valorUnitario = Double.parseDouble(valorUnitarioField.getText());
        int cantidad = Integer.parseInt(cantidadField.getText());

        double totalPorProducto = valorUnitario * cantidad;
        double valorTotalFactura = totalPorProducto;

        resultadoArea.setText("Cliente: " + cliente + "\n");
        resultadoArea.append("Producto: " + producto + "\n");
        resultadoArea.append("Total por Producto: $" + totalPorProducto + "\n");
        resultadoArea.append("Valor Total de la Factura: $" + valorTotalFactura);
    }
}