
package GUI.ejercicio3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class VentanaPrincipal  extends JFrame{
    
JTextField txtTexto;
JLabel etiTexto;
JButton btnVaciar;
private JPanel miPanel;


public VentanaPrincipal(){
    
    iniciarComponentes();
    setTitle("EVENTOS DEL TECLADO");
    setSize(500, 350);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    setLocationRelativeTo(null);
    
    }
    
    private void iniciarComponentes() {
        miPanel = new JPanel();
        miPanel.setLayout(null);
        miPanel.setBackground(Color.green);
        miPanel.setBounds(0, 0, 500, 350);

    
    txtTexto=new JTextField();
    txtTexto.setBounds(50, 50, 200, 30);
    miPanel.add(txtTexto);
    
    etiTexto=new JLabel("");
    etiTexto.setBounds(50, 100, 200, 30);
    miPanel.add(etiTexto);
   
    btnVaciar=new JButton("Vaciar");
    btnVaciar.setBounds(50, 150, 100, 30);
    miPanel.add(btnVaciar);
    
    this.add(miPanel);
    
    txtTexto.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        etiTexto.setText(txtTexto.getText() + e.getKeyChar());
        }
       
        @Override
        public void keyReleased(KeyEvent e) {
            
        }
        
    });
    
    btnVaciar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        
            txtTexto.setText("");
            etiTexto.setText("");
        }
    });
}
    public void setVisible(boolean b) {
        super.setVisible(b);
    }
}
