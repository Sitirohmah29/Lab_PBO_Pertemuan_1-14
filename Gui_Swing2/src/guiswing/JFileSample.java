package guiswing;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class JFileSample extends JFrame {

    JFileSample() {
        setVisible(true);
        setSize(500, 200);
        setTitle("Contoh JMenu");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        GenerateUI(this);
    }

    public static void main(String[] args) {
        new JFileSample();
    }

    private void GenerateUI(JFileSample frame) {
        JMenuBar menuBar = new JMenuBar();

        String[] lblMenu = {"File", "Edit", "Help"};
        String[] lblSubMenuFile = {"New File", "Open File", "Exit"};
        JMenu[] menus = new JMenu[lblMenu.length];

        for (int i = 0; i < menus.length; i++) {
            menus[i] = new JMenu();
            menus[i].setText(lblMenu[i]);
            menuBar.add(menus[i]);
        }

        // Add submenu for menu File
        JMenuItem[] subMenu = new JMenuItem[lblSubMenuFile.length];
        for (int i = 0; i < subMenu.length; i++) {
            subMenu[i] = new JMenuItem();
            subMenu[i].setText(lblSubMenuFile[i]);
            menus[0].add(subMenu[i]);
        }

        // Submenu New File
        subMenu[0].addActionListener(new ActionListener() {
            JFileChooser fileChooser = new JFileChooser();

            public void actionPerformed(ActionEvent e) {
                // Show file chooser and get selected file
                int isChoosen = fileChooser.showOpenDialog(null);

                if (isChoosen == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();

                    // Check if file exists
                    if (file.exists()) {
                        System.out.println("Selected file: " + file.getAbsolutePath());
                    } else {
                        System.out.println("File does not exist.");
                    }
                }
            }
        });

        // Submenu Open File
        subMenu[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File("."));

                // Show file chooser and get selected file
                int isChoosen = fileChooser.showOpenDialog(null);

                if (isChoosen == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();

                    // Check if file exists
                    if (file.exists()) {
                        System.out.println("Selected file: " + file.getAbsolutePath());
                    } else {
                        System.out.println("File does not exist.");
                    }
                }
            }
        });

        frame.setJMenuBar(menuBar);
    }
}
