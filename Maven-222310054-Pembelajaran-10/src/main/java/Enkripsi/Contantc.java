package Enkripsi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Contantc extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Contantc frame = new Contantc();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Contantc() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 391);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnSophie = new JButton("Sophie");
        btnSophie.setHorizontalAlignment(SwingConstants.LEFT);
        btnSophie.setFont(new Font("Arial", Font.BOLD, 12));
        btnSophie.setIcon(new ImageIcon("C:/anime-character_icon-icons.com_68052.png"));
        btnSophie.setBackground(Color.WHITE);
        btnSophie.setBounds(10, 45, 414, 50);
        contentPane.add(btnSophie);

        JLabel lblTitle = new JLabel("Room Chat");
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 13));
        lblTitle.setBounds(118, 11, 191, 23);
        contentPane.add(lblTitle);

        JButton btnMoon = new JButton("Moon");
        btnMoon.setHorizontalAlignment(SwingConstants.LEFT);
        btnMoon.setFont(new Font("Arial", Font.BOLD, 12));
        btnMoon.setIcon(new ImageIcon("C:/moon-and-star-outlines_icon-icons.com_74080.png"));
        btnMoon.setBackground(Color.WHITE);
        btnMoon.setBounds(10, 116, 414, 50);
        contentPane.add(btnMoon);

        JButton btnNaila = new JButton("Naila");
        btnNaila.setHorizontalAlignment(SwingConstants.LEFT);
        btnNaila.setFont(new Font("Arial", Font.BOLD, 12));
        btnNaila.setIcon(new ImageIcon("C:/dragon_icon_126586.png"));
        btnNaila.setBackground(Color.WHITE);
        btnNaila.setBounds(10, 188, 414, 50);
        contentPane.add(btnNaila);
        
        JButton btnTambahKontak = new JButton("");
        btnTambahKontak.setHorizontalAlignment(SwingConstants.LEFT);
        btnTambahKontak.setFont(new Font("Arial", Font.BOLD, 12));
        btnTambahKontak.setBackground(Color.WHITE);
        btnTambahKontak.setBounds(370, 291, 54, 50);
        contentPane.add(btnTambahKontak);
    }
}
