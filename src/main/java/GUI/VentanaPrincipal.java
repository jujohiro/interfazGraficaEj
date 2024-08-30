
package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {

     JLabel etiNombre, etiCiudad;
    JButton btnOcultarNombre, btnVisuNombre, btnOcultarCiudad, btnVisuCiudad;

    public VentanaPrincipal() {
       
        iniciarComponentes();
        setTitle("Ventana Principal");
        setSize(400, 250);
        setLayout(null); 
         
}

        private void iniciarComponentes  () {
 etiNombre = new JLabel("Juan Jose Hidalgo");
       
        etiCiudad = new JLabel("Armenia");
        btnOcultarNombre = new JButton("Ocultar Nombre");
        btnVisuNombre = new JButton("Visualizar Nombre");
        btnOcultarCiudad = new JButton("Ocultar Ciudad");
        btnVisuCiudad = new JButton("Visualizar Ciudad");

        etiNombre.setBounds(50, 30, 150, 30);
        etiCiudad.setBounds(50, 70, 100, 30);
        btnOcultarNombre.setBounds(200, 30, 150, 30);
        btnVisuNombre.setBounds(200, 70, 150, 30);
        btnOcultarCiudad.setBounds(200, 110, 150, 30);
        btnVisuCiudad.setBounds(200, 150, 150, 30);

        add(etiNombre);
        add(etiCiudad);
        add(btnOcultarNombre);
        add(btnVisuNombre);
        add(btnOcultarCiudad);
        add(btnVisuCiudad);
        
        btnOcultarNombre.addActionListener(this);
        btnVisuNombre.addActionListener(this);
        btnOcultarCiudad.addActionListener(this);
        btnVisuCiudad.addActionListener(this);
    }


       
    // Método para manejar los eventos de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOcultarNombre) {
            etiNombre.setVisible(false);
        } else if (e.getSource() == btnVisuNombre) {
            etiNombre.setVisible(true);
        } else if (e.getSource() == btnOcultarCiudad) {
            etiCiudad.setVisible(false);
        } else if (e.getSource() == btnVisuCiudad) {
            etiCiudad.setVisible(true);
        }
    }
}
