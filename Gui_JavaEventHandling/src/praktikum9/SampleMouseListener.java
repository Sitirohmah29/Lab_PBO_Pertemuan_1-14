package praktikum9;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.event.MouseInputListener;
import java.awt.GridLayout;
import java.io.File;

public class SampleMouseListener extends JFrame implements MouseInputListener {
    private JLabel lblImage;

    ImageIcon smile, angry, cry, surprised;

    SampleMouseListener() {
        setTitle("Contoh Mouse Listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500, 500);
        setLayout(new GridLayout());
        initialize(this);
        setVisible(true); 
    }

    public static void main(String[] args) {
        new SampleMouseListener();
    }

    private void initialize(SampleMouseListener frame) {
        lblImage = new JLabel();
        lblImage.setVisible(true);

        lblImage.addMouseListener(frame);

        String smilePath = "C://Users/Irvan/OneDrive/Pictures/smile.jpg";
        String surprisedPath = "C://Users/Irvan/OneDrive/Pictures/surprised.jpg";
        String cryPath = "C://Users/Irvan/OneDrive/Pictures/cry.jpg";
        String angryPath = "C://Users/Irvan/OneDrive/Pictures/angry.jpg";
        
        smile = new ImageIcon(smilePath);
        surprised = new ImageIcon(surprisedPath);
        cry = new ImageIcon(cryPath);
        angry = new ImageIcon(angryPath);

        lblImage.setIcon(smile);

        frame.add(lblImage);
        setVisible(true);  // Hapus pack()
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("You just clicked");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("You just pressed");
        lblImage.setIcon(smile);
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("You just released");
        lblImage.setIcon(angry);
    }
    
    public void mouseEntered(MouseEvent e) {
        System.out.println("You just entered the frame");
        lblImage.setIcon(surprised);
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("You exited the frame");  // Perbaiki teks
        lblImage.setIcon(angry);
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println("You just dragged the mouse");
        lblImage.setIcon(angry);
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("You just moved the mouse");
    }
}