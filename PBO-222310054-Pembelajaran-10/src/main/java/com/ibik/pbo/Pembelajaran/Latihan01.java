package com.ibik.pbo.Pembelajaran;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableCellEditor;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class Latihan01 extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private JTextField textNpm;
    private JTextField textFirstname;
    private JTextField textMiddlename;
    private JTextField textLastname;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Latihan01 frame = new Latihan01();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Latihan01() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 406);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Create the JTable with three columns (npm, name, and action)
        String[] columnNames = {"NPM", "Name", "Action"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            @Override
            public Class<?> getColumnClass(int column) {
                if (column == 2) {
                    return JButton.class;
                }
                return Object.class;
            }
        };
        table = new JTable(model);

        // Set the cell renderer and editor for the "Action" column
        table.getColumnModel().getColumn(2).setCellRenderer(new ButtonRenderer());
        table.getColumnModel().getColumn(2).setCellEditor(new ButtonEditor(new JButton("Edit"), new JButton("Delete"), table));
        
        // Create a JScrollPane and add the table to it
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 39, 414, 131);
        contentPane.add(scrollPane);

        // Example: Adding some rows to the table
        model.addRow(new Object[]{"222310065", "Sandry", ""});
        model.addRow(new Object[]{"222310032", "YEFTA", ""});
        model.addRow(new Object[]{"222310028", "JULIUS TASLIM", ""});
//        model.addRow(new Object[]{"222310062", "Sophie Makianoor", ""});

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setFont(new Font("Arial", Font.BOLD, 12));
        btnSubmit.setBounds(173, 333, 89, 23);
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                submitData();
            }
        });
        contentPane.add(btnSubmit);
        
        JLabel lblStudent = new JLabel("Student");
        lblStudent.setFont(new Font("Arial", Font.BOLD, 13));
        lblStudent.setHorizontalAlignment(SwingConstants.CENTER);
        lblStudent.setBounds(168, 11, 94, 28);
        contentPane.add(lblStudent);
        
        JLabel lblFom = new JLabel("Form");
        lblFom.setFont(new Font("Arial", Font.BOLD, 12));
        lblFom.setBounds(10, 181, 89, 14);
        contentPane.add(lblFom);
        
        JLabel lblNpm = new JLabel("NPM");
        lblNpm.setFont(new Font("Arial", Font.BOLD, 12));
        lblNpm.setBounds(10, 206, 89, 14);
        contentPane.add(lblNpm);
        
        textNpm = new JTextField();
        textNpm.setBounds(112, 203, 193, 20);
        contentPane.add(textNpm);
        textNpm.setColumns(10);
        
        JLabel lblFirstname = new JLabel("FirstName");
        lblFirstname.setFont(new Font("Arial", Font.BOLD, 12));
        lblFirstname.setBounds(10, 234, 89, 14);
        contentPane.add(lblFirstname);
        
        textFirstname = new JTextField();
        textFirstname.setColumns(10);
        textFirstname.setBounds(112, 231, 193, 20);
        contentPane.add(textFirstname);
        
        JLabel lblNpm_1_1 = new JLabel("MiddleName");
        lblNpm_1_1.setFont(new Font("Arial", Font.BOLD, 12));
        lblNpm_1_1.setBounds(10, 262, 89, 14);
        contentPane.add(lblNpm_1_1);
        
        textMiddlename = new JTextField();
        textMiddlename.setColumns(10);
        textMiddlename.setBounds(112, 259, 193, 20);
        contentPane.add(textMiddlename);
        
        JLabel lblNpm_1_1_1 = new JLabel("LastName");
        lblNpm_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
        lblNpm_1_1_1.setBounds(10, 290, 89, 14);
        contentPane.add(lblNpm_1_1_1);
        
        textLastname = new JTextField();
        textLastname.setColumns(10);
        textLastname.setBounds(112, 287, 193, 20);
        contentPane.add(textLastname);
    }
    class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }


 // ... (existing code)

    class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
        private JButton editButton, deleteButton;
        private String clickedButton;
        private JTable targetTable;

        public ButtonEditor(JButton editButton, JButton deleteButton, JTable table) {
            this.editButton = editButton;
            this.editButton.addActionListener(this);
            this.deleteButton = deleteButton;
            this.deleteButton.addActionListener(this);
            this.targetTable = table;
        }

        @Override
        public Object getCellEditorValue() {
            return clickedButton;
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            return (column == 2) ? ((String) value).equals("Edit") ? editButton : deleteButton : null;
        }

        @Override
        public boolean isCellEditable(EventObject anEvent) {
            return true;
        }

        @Override
        public boolean shouldSelectCell(EventObject anEvent) {
            return true;
        }

        @Override
        public boolean stopCellEditing() {
            return true;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            clickedButton = e.getActionCommand();
            if ("Delete".equals(clickedButton)) {
                int selectedRow = targetTable.getSelectedRow();
                if (selectedRow != -1) {
                    DefaultTableModel model = (DefaultTableModel) targetTable.getModel();
                    model.removeRow(selectedRow);
                }
            }
            fireEditingStopped();
        }
    }

    // ... (existing code)

    
    private void submitData() {
    	  StudentDao studentDAO = new StudentDao();
    	  try {
    	      Students students = new Students();
    	      students.setNpm(textNpm.getText());
    	      students.setMiddlename(textMiddlename.getText());
    	      students.setLastname(textLastname.getText());
    	      studentDAO.saved(students);

    	      DefaultTableModel model = (DefaultTableModel) table.getModel();
    	      model.addRow(new Object[]{students.getNpm(), generateFullName(), ""});

    	      textNpm.setText("");
    	      textFirstname.setText("");
    	      textMiddlename.setText("");
    	      textLastname.setText("");
    	  } catch (Exception e) {
    	      JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    	  }
    	}

    private String generateFullName() {
        String firstName = textFirstname.getText();
        String middleName = textMiddlename.getText();
        String lastName = textLastname.getText();

        return String.format("%s %s %s", firstName, middleName, lastName).trim();
    }
}
