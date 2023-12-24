package com.ibik.pbo.Pembelajaran;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Latihan02 extends JFrame {

    private JPanel contentPane;
    private JTextField textNpm;
    private JTextField textNama;
    private JTable table;
	private JTextField textNilai;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Latihan02 frame = new Latihan02();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Latihan02() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 572, 371);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("FORM PENILAIAN MATAKULIAH PBO");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
        lblNewLabel.setBounds(181, 11, 256, 14);
        contentPane.add(lblNewLabel);

        JPanel panel = new JPanel();
        panel.setBounds(10, 51, 226, 245);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNpm = new JLabel("Npm");
        lblNpm.setFont(new Font("Arial", Font.BOLD, 12));
        lblNpm.setBounds(10, 11, 46, 14);
        panel.add(lblNpm);

        textNpm = new JTextField();
        textNpm.setBounds(10, 36, 206, 31);
        panel.add(textNpm);
        textNpm.setColumns(10);

        JLabel lblNama = new JLabel("Nama");
        lblNama.setFont(new Font("Arial", Font.BOLD, 12));
        lblNama.setBounds(10, 80, 46, 14);
        panel.add(lblNama);

        textNama = new JTextField();
        textNama.setColumns(10);
        textNama.setBounds(10, 105, 206, 31);
        panel.add(textNama);

        JLabel lblNilai = new JLabel("Nilai");
        lblNilai.setFont(new Font("Arial", Font.BOLD, 12));
        lblNilai.setBounds(10, 147, 46, 14);
        panel.add(lblNilai);
        
        ButtonGroup nilaiButtonGroup = new ButtonGroup();

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(10, 211, 72, 23);
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	ValidatorForm();
            }
        });
        panel.add(btnSave);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(81, 211, 72, 23);
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteRecord();
            }
        });
        panel.add(btnDelete);

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(151, 211, 72, 23);
        btnClear.addActionListener(new ActionListener() {
        	   @Override
        	   public void actionPerformed(ActionEvent e) {
        	       clearDatabase();
        	   }
        	});
        panel.add(btnClear);
        
        textNilai = new JTextField();
        textNilai.setColumns(10);
        textNilai.setBounds(10, 172, 206, 31);
        panel.add(textNilai);

        // Creating a JTable with data and column headers
        String data[][] = {{"222310065", "Sandry", "B"},
                {"222310032", "YEFTA", "C"},
                {"222310028", "JULIUS TASLIM", "A"}};
        String column[] = {"Npm", "Nama", "Nilai"};

        table = new JTable(data, column);
        table.setBounds(246, 51, 300, 245);

        // Adding the JTable to a JScrollPane and then to the content pane
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(246, 51, 300, 245);
        contentPane.add(sp);

        JMenuBar menuBar = new JMenuBar();

        String[] lblMenu = {"File", "Edit", "Help"};
        String[] lblSubMenuFile = {"Open Student Data", "Exit"};
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

        // Submenu Open Student Data
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

        // Submenu Exit
        subMenu[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setJMenuBar(menuBar);
    }
    
    private void ValidatorForm() {
        if (textNpm.getText().isEmpty() || textNama.getText().isEmpty() || textNilai.getText().isEmpty()) {
            Object message = "Please fill up the form correctly";
            JOptionPane.showMessageDialog(null, message);
        } else {
            try {
                Insert2database();
                JOptionPane.showMessageDialog(null, "Successfully saved");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failed save. Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    
   
	private void Insert2database() throws Exception {
        StudentsScore students = new StudentsScore();
        students.setNpm(textNpm.getText());
        students.setNama(textNama.getText());
        students.setNilai(textNilai.getText());

        StudentsScoreDao stdDao = new StudentsScoreDao();
        stdDao.saved(students); 
	}

	private void deleteRecord() {
	    if (textNpm.getText().isEmpty()) {
	        JOptionPane.showMessageDialog(null, "Please enter NPM to delete.");
	        return;
	    }

	    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

	    if (confirm == JOptionPane.YES_OPTION) {
	        try {
	            StudentsScoreDao stdDao = new StudentsScoreDao();
	            stdDao.removed(textNpm.getText()); // Remove the record from the database

	            // Refresh the table in the GUI
	            refreshTable();

	            JOptionPane.showMessageDialog(null, "Record deleted successfully");
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, "Failed to delete record. Error: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
	}

	private void refreshTable() {
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    model.setRowCount(0); // Clear all rows

	    try {
	        // Reload data from the database and add it to the table
	        StudentsScoreDao stdDao = new StudentsScoreDao();
	        List<StudentsScore> studentsList = stdDao.findAll();

	        for (StudentsScore student : studentsList) {
	            model.addRow(new Object[]{student.getNpm(), student.getNama(), student.getNilai()});
	        }
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Failed to refresh table. Error: " + e.getMessage());
	        e.printStackTrace();
	    }
	}


		private void clearDatabase() {
		   int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all records?", "Confirm Clear", JOptionPane.YES_NO_OPTION);

		   if (confirm == JOptionPane.YES_OPTION) {
		       try {
		           StudentsScoreDao stdDao = new StudentsScoreDao();
		           stdDao.removeAllByNpm(textNpm.getText()); // Assuming clear() method is implemented in StudentsScoreDao

		           // Clear the table in the GUI
		           clearTable();

		           JOptionPane.showMessageDialog(null, "All records cleared successfully");
		       } catch (Exception e) {
		           JOptionPane.showMessageDialog(null, "Failed to clear records. Error: " + e.getMessage());
		           e.printStackTrace();
		       }
		   }
		}

		private void clearTable() {
		   DefaultTableModel model = (DefaultTableModel) table.getModel();
		   model.setRowCount(0); // Clear all rows
		}


}
