package GUI.ejercicio8;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {
    
    JLabel etiTexto;
    JButton btnAzul, btnRojo, btnVerde;
    JButton btnFondoAzul, btnFondoRojo, btnFondoVerde;
    JButton btnTransparente, btnOpaca;
    private JPanel miPanel;
    
    public VentanaPrincipal() {
        iniciarComponentes();
        setTitle("MANEJO DE COLORES Y PROPIEDADES DE ETIQUETAS");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);  // Centrar la ventana
    }
    
    private void iniciarComponentes() {
        miPanel = new JPanel();
        miPanel.setLayout(null);
        miPanel.setBackground(Color.BLACK);
        miPanel.setBounds(0, 0, 500, 350);
        add(miPanel);

        // Crear la etiqueta
        etiTexto = new JLabel("Texto de Ejemplo");
        etiTexto.setBounds(150, 30, 200, 30);
        etiTexto.setOpaque(true);  // Hacer la etiqueta opaca por defecto
        etiTexto.setBackground(Color.WHITE);
        miPanel.add(etiTexto);
        
        // Crear los botones de color de texto
        btnAzul = new JButton("Azul");
        btnAzul.setBounds(50, 80, 100, 30);
        miPanel.add(btnAzul);

        btnRojo = new JButton("Rojo");
        btnRojo.setBounds(160, 80, 100, 30);
        miPanel.add(btnRojo);

        btnVerde = new JButton("Verde");
        btnVerde.setBounds(270, 80, 100, 30);
        miPanel.add(btnVerde);

        // Crear los botones de color de fondo
        btnFondoAzul = new JButton("Fondo Azul");
        btnFondoAzul.setBounds(50, 120, 120, 30);
        miPanel.add(btnFondoAzul);

        btnFondoRojo = new JButton("Fondo Rojo");
        btnFondoRojo.setBounds(180, 120, 120, 30);
        miPanel.add(btnFondoRojo);

        btnFondoVerde = new JButton("Fondo Verde");
        btnFondoVerde.setBounds(310, 120, 120, 30);
        miPanel.add(btnFondoVerde);

        // Crear los botones de opacidad
        btnTransparente = new JButton("Transparente");
        btnTransparente.setBounds(50, 160, 150, 30);
        miPanel.add(btnTransparente);

        btnOpaca = new JButton("Opaca");
        btnOpaca.setBounds(210, 160, 150, 30);
        miPanel.add(btnOpaca);

        // Añadir eventos a los botones de color de texto
        btnAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.BLUE);
            }
        });

        btnRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.RED);
            }
        });

        btnVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.GREEN);
            }
        });

        // Añadir eventos a los botones de color de fondo
        btnFondoAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.BLUE);
            }
        });

        btnFondoRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.RED);
            }
        });

        btnFondoVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.GREEN);
            }
        });

        // Añadir eventos a los botones de opacidad
        btnTransparente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setOpaque(false);  // Hacer la etiqueta transparente
                etiTexto.repaint();  // Refrescar la etiqueta
            }
        });

        btnOpaca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setOpaque(true);  // Hacer la etiqueta opaca
                etiTexto.repaint();  // Refrescar la etiqueta
            }
        });
    }

    public void setVsible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}