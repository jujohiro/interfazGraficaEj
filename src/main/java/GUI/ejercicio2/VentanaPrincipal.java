
package GUI.ejercicio2;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    
     JTextField txtTexto;
     JLabel etiTexto1;
    JLabel etiTexto2;
    JButton btnTraspasa1;
    JButton btnTraspasa2;

    public VentanaPrincipal() {
    
        setTitle("Traspasa Texto");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        txtTexto = new JTextField();
        etiTexto1 = new JLabel("");
        etiTexto2 = new JLabel("");
        btnTraspasa1 = new JButton("Traspasa 1");
        btnTraspasa2 = new JButton("Traspasa 2");

        // Establece posiciones y tamaños de los componentes
        txtTexto.setBounds(50, 20, 200, 30);
        etiTexto1.setBounds(50, 60, 200, 30);
        etiTexto2.setBounds(50, 100, 200, 30);
        btnTraspasa1.setBounds(50, 140, 100, 30);
        btnTraspasa2.setBounds(160, 140, 100, 30);

        // Agregar componentes a la ventana
        add(txtTexto);
        add(etiTexto1);
        add(etiTexto2);
        add(btnTraspasa1);
        add(btnTraspasa2);

        // Agregar ActionListeners a los botones
        btnTraspasa1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = txtTexto.getText();
                etiTexto1.setText(texto);
            }
        });

        btnTraspasa2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = txtTexto.getText();
                etiTexto2.setText(texto);
            }
        });
    }
 }
       

