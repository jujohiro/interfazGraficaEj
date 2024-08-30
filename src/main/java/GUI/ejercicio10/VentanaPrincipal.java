
package GUI.ejercicio10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {
    
    private JTextField txtPalabra1, txtPalabra2;
    private JLabel etiTexto;
    private JButton btnConcatena;
    private JPanel miPanel;
    
    public VentanaPrincipal() {
        iniciarComponentes();
        setTitle("CONCATENAR PALABRAS");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);  // Centrar la ventana
    }
    
    private void iniciarComponentes() {
        miPanel = new JPanel();
        miPanel.setLayout(null);
        miPanel.setBounds(0, 0, 400, 300);
        add(miPanel);
        
        // Cuadros de texto para las palabras
        txtPalabra1 = new JTextField();
        txtPalabra1.setBounds(50, 50, 130, 30);
        miPanel.add(txtPalabra1);
        
        txtPalabra2 = new JTextField();
        txtPalabra2.setBounds(200, 50, 130, 30);
        miPanel.add(txtPalabra2);
        
        // Etiqueta para mostrar el texto concatenado
        etiTexto = new JLabel("Resultado:");
        etiTexto.setBounds(50, 120, 280, 30);
        miPanel.add(etiTexto);
        
        // Botón para concatenar las palabras
        btnConcatena = new JButton("Concatena");
        btnConcatena.setBounds(150, 180, 100, 30);
        miPanel.add(btnConcatena);
        
        // Añadir el evento de acción al botón "Concatena"
        btnConcatena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concatenarPalabras();
            }
        });
    }
    
    private void concatenarPalabras() {
        
        String palabra1 = txtPalabra1.getText();
        String palabra2 = txtPalabra2.getText();
        
      
        String resultado = palabra1 + " " + palabra2;
        etiTexto.setText(" Resultado: " + resultado);
    }
}

