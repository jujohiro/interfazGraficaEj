
    package GUI.ejercicio6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {

    private JLabel etiNombre;
    private JButton btnEsquina, btnCentro, btnAgrandar, btnAchicar;
    private JPanel miPanel;
    
   
    private final Dimension sizeBotonNormal = new Dimension(100, 30);
    private final Dimension sizeBotonGrande = new Dimension(120, 40);
    private final Dimension sizeEtiquetaNormal = new Dimension(150, 50);
    private final Dimension sizeEtiquetaGrande = new Dimension(200, 70);

    public VentanaPrincipal() {
        iniciarComponentes();
        setTitle("EVENTOS DEL MOUSE Y POSICIONAMIENTO");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
    }

    private void iniciarComponentes() {
        miPanel = new JPanel();
        miPanel.setLayout(null);
        miPanel.setBounds(0, 0, 500, 400);
        add(miPanel);

       
        etiNombre = new JLabel("Juan Jose Hidalgo Rojas");
        etiNombre.setOpaque(true);
        etiNombre.setBackground(Color.MAGENTA);
        etiNombre.setBounds(200, 150, sizeEtiquetaNormal.width, sizeEtiquetaNormal.height); 
        miPanel.add(etiNombre);

     
        btnEsquina = new JButton("Esquina");
        btnEsquina.setBounds(50, 300, sizeBotonNormal.width, sizeBotonNormal.height);
        btnEsquina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                etiNombre.setLocation(0, 0);
            }
        });
        agregarEfectoMouse(btnEsquina);
        miPanel.add(btnEsquina);

        btnCentro = new JButton("Centro");
        btnCentro.setBounds(150, 300, sizeBotonNormal.width, sizeBotonNormal.height);
        btnCentro.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               
                int x = (miPanel.getWidth() - etiNombre.getWidth()) / 2;
                int y = (miPanel.getHeight() - etiNombre.getHeight()) / 2;
                etiNombre.setLocation(x, y);
            }
        });
        agregarEfectoMouse(btnCentro);
        miPanel.add(btnCentro);

        btnAgrandar = new JButton("Agrandar");
        btnAgrandar.setBounds(250, 300, sizeBotonNormal.width, sizeBotonNormal.height);
        btnAgrandar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiNombre.setSize(sizeEtiquetaGrande);
            }
        });
        agregarEfectoMouse(btnAgrandar);
        miPanel.add(btnAgrandar);

        btnAchicar = new JButton("Achicar");
        btnAchicar.setBounds(350, 300, sizeBotonNormal.width, sizeBotonNormal.height);
        btnAchicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiNombre.setSize(sizeEtiquetaNormal);
            }
        });
        agregarEfectoMouse(btnAchicar);
        miPanel.add(btnAchicar);
    }

    private void agregarEfectoMouse(JButton boton) {
        boton.addMouseListener(new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton.setSize(sizeBotonGrande);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton.setSize(sizeBotonNormal);
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
