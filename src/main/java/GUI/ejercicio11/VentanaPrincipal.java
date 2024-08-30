package GUI.ejercicio11;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

    JLabel etiUno, etiDos, etiTres, etiCuatro, etiCinco,
            etiSeis, etiSiete, etiOcho, etiNueve, etiDiez;
    JTextField txtNumero;
    JButton btnBorrar;
    private JPanel miPanel;

    public VentanaPrincipal() {
        iniciarComponentes();
        setTitle("EVENTOS DEL MOUSE Y ASIGNACION DE VALORES");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
    }

    private void iniciarComponentes() {
        miPanel = new JPanel();
        miPanel.setLayout(null);
        miPanel.setBackground(Color.yellow);
        miPanel.setBounds(0, 0, 500, 300);

     
        etiUno = new JLabel("1");
        etiUno.setBounds(50, 30, 50, 20);
        agregarEventoMouse(etiUno, "1");
        miPanel.add(etiUno);

        etiDos = new JLabel("2");
        etiDos.setBounds(50, 50,50, 20);
        agregarEventoMouse(etiDos, "2");
        miPanel.add(etiDos);

        etiTres = new JLabel("3");
        etiTres.setBounds(50, 70, 50, 20);
        agregarEventoMouse(etiTres, "3");
        miPanel.add(etiTres);

        etiCuatro = new JLabel("4");
        etiCuatro.setBounds(50, 90, 50, 20);
        agregarEventoMouse(etiCuatro, "4");
        miPanel.add(etiCuatro);

        etiCinco = new JLabel("5");
        etiCinco.setBounds(50, 110, 50, 20);
        agregarEventoMouse(etiCinco, "5");
        miPanel.add(etiCinco);

        etiSeis = new JLabel("6");
        etiSeis.setBounds(50, 130, 50, 20);
        agregarEventoMouse(etiSeis, "6");
        miPanel.add(etiSeis);

        etiSiete = new JLabel("7");
        etiSiete.setBounds(50, 150, 50, 20);
        agregarEventoMouse(etiSiete, "7");
        miPanel.add(etiSiete);

        etiOcho = new JLabel("8");
        etiOcho.setBounds(50, 170, 50, 20);
        agregarEventoMouse(etiOcho, "8");
        miPanel.add(etiOcho);

        etiNueve = new JLabel("9");
        etiNueve.setBounds(50, 190, 50, 20);
        agregarEventoMouse(etiNueve, "9");
        miPanel.add(etiNueve);

        etiDiez = new JLabel("0");
        etiDiez.setBounds(50, 210, 50, 20);
        agregarEventoMouse(etiDiez, "0");
        miPanel.add(etiDiez);

      
        txtNumero = new JTextField();
        txtNumero.setBounds(200, 30, 150, 20);
        miPanel.add(txtNumero);

       
        btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(200, 60, 150, 20);
        btnBorrar.addActionListener(e -> txtNumero.setText(""));
        miPanel.add(btnBorrar);

        
        add(miPanel);
    }
    private void agregarEventoMouse(JLabel etiqueta, String numero) {
        etiqueta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNumero.setText(txtNumero.getText() + numero);
            }
        });
    }

  
}