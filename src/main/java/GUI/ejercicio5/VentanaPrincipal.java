
package GUI.ejercicio5;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VentanaPrincipal extends JFrame {

    JLabel etiPal1, etiPal2, etiPal3, etiPal4, etiOcultar;
    private JPanel miPanel;

    public VentanaPrincipal() {
        
        iniciarComponentes();
        setTitle("EVENTOS DEL MOUSE");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
    }

    private void iniciarComponentes() {
        miPanel = new JPanel();
        miPanel.setLayout(null);
        miPanel.setBounds(0, 0, 400, 300);
        add(miPanel);

        etiPal1 = new JLabel("Palabra 1");
        etiPal1.setBounds(50, 50, 100, 30);
        miPanel.add(etiPal1);

        etiPal2 = new JLabel("Palabra 2");
        etiPal2.setBounds(50, 90, 100, 30);
        miPanel.add(etiPal2);

        etiPal3 = new JLabel("Palabra 3");
        etiPal3.setBounds(50, 130, 100, 30);
        miPanel.add(etiPal3);

        etiPal4 = new JLabel("Palabra 4");
        etiPal4.setBounds(50, 170, 100, 30);
        miPanel.add(etiPal4);

        etiOcultar = new JLabel("Ocultar", JLabel.CENTER);
        etiOcultar.setBounds(200, 100, 150, 50);
        etiOcultar.setOpaque(true);
        etiOcultar.setBackground(Color.GRAY);  
        miPanel.add(etiOcultar);


        etiOcultar.addMouseListener(new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent e) {
              
                etiPal1.setVisible(false);
                etiPal2.setVisible(false);
                etiPal3.setVisible(false);
                etiPal4.setVisible(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                etiPal1.setVisible(true);
                etiPal2.setVisible(true);
                etiPal3.setVisible(true);
                etiPal4.setVisible(true);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }
        });
    }
    
}
