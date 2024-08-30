
package GUI.ejercicio9;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {
    
    private JTextField txtPrimerTrimestre, txtSegundoTrimestre, txtTercerTrimestre;
    private JLabel etiNotaFinal, etiResultado;
    private JButton btnCalcular;
    private JPanel miPanel;
    
    public VentanaPrincipal() {
        iniciarComponentes();
        setTitle("Calculadora de Notas");
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
        
       
        txtPrimerTrimestre = new JTextField();
        txtPrimerTrimestre.setBounds(50, 30, 100, 30);
        miPanel.add(txtPrimerTrimestre);

        txtSegundoTrimestre = new JTextField();
        txtSegundoTrimestre.setBounds(50, 70, 100, 30);
        miPanel.add(txtSegundoTrimestre);

        txtTercerTrimestre = new JTextField();
        txtTercerTrimestre.setBounds(50, 110, 100, 30);
        miPanel.add(txtTercerTrimestre);

      
        etiNotaFinal = new JLabel("Nota Final:");
        etiNotaFinal.setBounds(200, 30, 150, 30);
        miPanel.add(etiNotaFinal);

        
        etiResultado = new JLabel("Resultado:");
        etiResultado.setBounds(200, 70, 150, 30);
        miPanel.add(etiResultado);

        
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(50, 150, 100, 30);
        miPanel.add(btnCalcular);

      
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularNotaFinal();
            }
        });
    }
    
    private void calcularNotaFinal() {
        try {
          
            double primerTrimestre = Double.parseDouble(txtPrimerTrimestre.getText());
            double segundoTrimestre = Double.parseDouble(txtSegundoTrimestre.getText());
            double tercerTrimestre = Double.parseDouble(txtTercerTrimestre.getText());

            double notaFinal = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3;

           
            etiNotaFinal.setText("Nota Final: " + String.format("%.2f", notaFinal));

            if (notaFinal < 5) {
                etiResultado.setText("Resultado: SUSPENSO");
                etiNotaFinal.setForeground(Color.RED);
                etiResultado.setForeground(Color.RED);
            } else {
                etiResultado.setText("Resultado: APROBADO");
                etiNotaFinal.setForeground(Color.BLACK);
                etiResultado.setForeground(Color.BLACK);
            }
        } catch (NumberFormatException ex) {
           
            etiNotaFinal.setText("Nota Final: Error");
            etiResultado.setText("Resultado: Entrada inválida");
            etiNotaFinal.setForeground(Color.RED);
            etiResultado.setForeground(Color.RED);
        }
    }
}