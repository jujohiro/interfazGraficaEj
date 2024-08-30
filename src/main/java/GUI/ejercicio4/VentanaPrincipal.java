
package GUI.ejercicio4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

    JTextField txtNombre;
    JTextField txtCiudad;
    JLabel txtFrase;
    JButton btnAceptar;
    JButton btnDesactivar;
    JButton btnActivar;
    private JPanel miPanel;

    public VentanaPrincipal() {
        iniciarComponentes();
        setTitle("DESACTIVAR COMPONENTES GRÁFICOS");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
    }

    private void iniciarComponentes() {
        miPanel = new JPanel();
        miPanel.setLayout(null);
        miPanel.setBackground(Color.CYAN);
        miPanel.setBounds(0, 0, 500, 350);

        txtNombre = new JTextField();
        txtNombre.setBounds(140, 50, 200, 30);
        miPanel.add(txtNombre);

        txtCiudad = new JTextField();
        txtCiudad.setBounds(140, 100, 200, 30);
        miPanel.add(txtCiudad);

        txtFrase = new JLabel("");
        txtFrase.setBounds(100, 150, 400, 30);
        miPanel.add(txtFrase);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(70, 200, 100, 25);
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String ciudad = txtCiudad.getText();
                txtFrase.setText("Usted se llama " + nombre + " y vive en " + ciudad + ".");
            }
        });
        miPanel.add(btnAceptar);

        btnDesactivar = new JButton("Desactivar");
        btnDesactivar.setBounds(180, 200, 100, 25);
        btnDesactivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setEnabled(false);
                txtCiudad.setEnabled(false);
            }
        });
        miPanel.add(btnDesactivar);

        btnActivar = new JButton("Activar");
        btnActivar.setBounds(290, 200, 100, 25);
        btnActivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setEnabled(true);
                txtCiudad.setEnabled(true);
            }
        });
        miPanel.add(btnActivar);

        this.add(miPanel);
    }
}