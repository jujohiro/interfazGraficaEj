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
        setLocationRelativeTo(null);
    }
    
    private void iniciarComponentes() {
        miPanel = new JPanel();
        miPanel.setLayout(null);
        miPanel.setBackground(Color.BLACK);
        miPanel.setBounds(0, 0, 500, 350);
        add(miPanel);

        etiTexto = new JLabel("Texto de Ejemplo");
        etiTexto.setBounds(150, 30, 200, 30);
        etiTexto.setOpaque(true);  
        etiTexto.setBackground(Color.WHITE);
        miPanel.add(etiTexto);
        
        btnAzul = new JButton("Azul");
        btnAzul.setBounds(50, 80, 100, 30);
        miPanel.add(btnAzul);

        btnRojo = new JButton("Rojo");
        btnRojo.setBounds(160, 80, 100, 30);
        miPanel.add(btnRojo);

        btnVerde = new JButton("Verde");
        btnVerde.setBounds(270, 80, 100, 30);
        miPanel.add(btnVerde);

        
        btnFondoAzul = new JButton("Fondo Azul");
        btnFondoAzul.setBounds(50, 120, 120, 30);
        miPanel.add(btnFondoAzul);

        btnFondoRojo = new JButton("Fondo Rojo");
        btnFondoRojo.setBounds(180, 120, 120, 30);
        miPanel.add(btnFondoRojo);

        btnFondoVerde = new JButton("Fondo Verde");
        btnFondoVerde.setBounds(310, 120, 120, 30);
        miPanel.add(btnFondoVerde);

   
        btnTransparente = new JButton("Transparente");
        btnTransparente.setBounds(50, 160, 150, 30);
        miPanel.add(btnTransparente);

        btnOpaca = new JButton("Opaca");
        btnOpaca.setBounds(210, 160, 150, 30);
        miPanel.add(btnOpaca);

   
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

        btnTransparente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setOpaque(false);  
                etiTexto.repaint();  
            }
        });

        btnOpaca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setOpaque(true);
                etiTexto.repaint();  
            }
        });
    }

    public void setVsible(boolean b) {
    
    }

  
}