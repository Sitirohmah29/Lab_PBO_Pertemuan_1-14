package com.ibik.pbo.Pembelajaran;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {
	private static JTextField getNPM;
	private static JTextField getNama;
	private static ButtonGroup NilaiGroup;
    Form() {
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setSize(500, 300);
        setTitle("Login");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        generateUI(this);
    }

    public static void main(String[] args) {
        new Form();
    }

    private void generateUI(Form frame) {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        frame.setContentPane(mainPanel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);

        mainPanel.add(panel1, BorderLayout.NORTH);
        JLabel lblUsername = new JLabel("Email");
        lblUsername.setBounds(22, 23, 80, 16);
        panel1.add(lblUsername);
        JTextField textUsername = new JTextField();
        textUsername.setBounds(105, 23, 169, 30);
        panel1.add(textUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(22, 64, 80, 16);
        panel1.add(lblPassword);
        JPasswordField textPassword = new JPasswordField();
        textPassword.setBounds(105, 64, 169, 30);
        panel1.add(textPassword);

        JCheckBox chkRemember = new JCheckBox("Remember password ?", true);
        chkRemember.setBounds(105, 100, 169, 40);
        panel1.add(chkRemember);

        JButton btnRegister = new JButton("Register");
        btnRegister.setBounds(105, 150, 95, 40);
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open a new frame for user registration
                JFrame registerFrame = new JFrame("Register");
                registerFrame.setSize(300, 300);
                JPanel registerPanel = new JPanel();
                registerPanel.setLayout(null);
                registerFrame.add(registerPanel);

                JLabel lblFullname = new JLabel("Fullname");
                lblFullname.setBounds(22, 23, 80, 16);
                registerPanel.add(lblFullname);
                JTextField textFullname = new JTextField();
                textFullname.setBounds(105, 18, 169, 30);
                registerPanel.add(textFullname);

                JLabel lblEmail = new JLabel("Email");
        		lblEmail.setBounds(22, 69, 61, 16);
        		registerPanel.add(lblEmail);
        		JTextField textEmail = new JTextField(); 
        		textEmail.setBounds(105,64, 169, 30); 
        		registerPanel.add(textEmail);
        				 
        		JLabel lblPhone = new JLabel("Phone");
        		lblPhone.setBounds(22, 109, 61, 16);
        		registerPanel.add(lblPhone); 
        		JTextField txtPhone = new JTextField(); 
        		txtPhone.setBounds(105,104,169, 30); 
        		registerPanel.add(txtPhone);

        		JLabel lblGender = new JLabel("Gender");
        		lblGender.setBounds(22,139,169,30);
        		registerPanel.add(lblGender);
        					
        		JRadioButton radioGender1 = new JRadioButton("Female"); 
        		radioGender1.setBounds(105,140,100,30);
        		registerPanel.add(radioGender1);
        		JRadioButton radioGender2 = new	JRadioButton("Male"); 
        		radioGender2.setBounds(200,140,100,30);
        		registerPanel.add(radioGender2);
        			
        		ButtonGroup bg=new ButtonGroup();
        		bg.add(radioGender1);
        		bg.add(radioGender2);
        		
        		JLabel lblCityzen= new JLabel("Citizenship");
        		lblCityzen.setBounds(22,179,169,30);
        		registerPanel.add(lblCityzen);
        		String country[]={"Indonesia","India","Aus","U.S.A","England","Newzealand"};
        		JComboBox selectCitizen = new JComboBox(country); 
        		selectCitizen.setBounds(105,184,169,30);
        		registerPanel.add(selectCitizen);

                JButton btnRegisterSubmit = new JButton("Submit");
                btnRegisterSubmit.setBounds(105, 224, 169, 30);
                btnRegisterSubmit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Display registration data message
                        String registrationData = "Full Name: " + textFullname.getText()+
                                "\nEmail: " + textEmail.getText() +
                                "\nPhone: " + txtPhone.getText() +
                                "\nGender: " + (radioGender1.isSelected() ? "Female" : "Male") +
                                "\nCitizenship: " + selectCitizen.getSelectedItem();

                        JOptionPane.showMessageDialog(frame, "Data Anda adalah:\n" + registrationData, "Registrasi Berhasil", JOptionPane.INFORMATION_MESSAGE);
                        registerFrame.dispose(); // Close the registration frame
                    }
                });
                registerPanel.add(btnRegisterSubmit);

                registerFrame.setVisible(true);
            }
        });
        panel1.add(btnRegister);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(215, 150, 95, 40);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = textUsername.getText();
                String password = new String(textPassword.getPassword());

                // Check if any field is empty
                if (email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Silahkan mengisi data dengan benar", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!email.equals("222310054@student.ibik.ac.id") || !password.equals("222310054")) {
                    // Check if the email and password match the specified values
                    JOptionPane.showMessageDialog(frame, "Data yang anda masukan salah", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // If all conditions are met, display a welcome message
                    JOptionPane.showMessageDialog(frame, "Selamat Datang " + email, "Data ditemukan", JOptionPane.INFORMATION_MESSAGE);

                    // Open a new frame for the additional information
                    JFrame additionalInfoFrame = new JFrame("FORM PENILAIAN MAHASISWA");
                    additionalInfoFrame.setSize(300, 200);
                    JPanel additionalInfoPanel = new JPanel();
                    additionalInfoPanel.setLayout(new FlowLayout());
                    additionalInfoFrame.add(additionalInfoPanel);

                	//Data or Information Variables
            		String [][]Informasi = {};
            		String [] Column = {"NPM","Nama","Score"};
            		//Main Panel
            		JPanel MainPanel = new JPanel(new BorderLayout());
            		
            		//Menu Bar
            		JMenuBar MenuBar = new JMenuBar();
            		
            		JMenu fileMenu = new JMenu("File");
            		JMenu editMenu = new JMenu("Edit");
            		JMenu helpMenu = new JMenu("Help");
            		
            		MenuBar.add(fileMenu);
            		MenuBar.add(editMenu);
            		MenuBar.add(helpMenu);
            		
            		JMenuItem item1 = new JMenuItem("New");
            		JMenuItem item2 = new JMenuItem("Save");
            		JMenuItem item3 = new JMenuItem("Exit");
            		
            		fileMenu.add(item1);
            		fileMenu.add(item2);
            		fileMenu.add(item3);
            
            		frame.setJMenuBar(MenuBar);
            		additionalInfoPanel.add(MenuBar);
            		
            		//Title Panel
            		JPanel TitlePanel = new JPanel(new FlowLayout());
            		JLabel Title = new JLabel("FORM PENGISIAN MATAKULIAH PBO");
            		TitlePanel.add(Title);
            		MainPanel.add(TitlePanel,BorderLayout.NORTH);
            		
            		//DataPanel (Main panel for Form and Table)
            		JPanel DataPanel = new JPanel(new GridLayout(1,2));
            		
            		//Input Form Sub-Panel
            		JPanel FormPanel = new JPanel();
            		FormPanel.setLayout(null);
            		
            		JLabel NPM = new JLabel ("NPM");
            		NPM.setBounds(20,20,100,30);
            		getNPM = new JTextField();
            		getNPM.setBounds(20,50,350,30);
            		
            		JLabel Nama = new JLabel ("Nama");
            		Nama.setBounds(20,100,100,30);
            		getNama = new JTextField();
            		getNama.setBounds(20,130,350,30);
            		
            		//Radio Buttons for "Nilai"
            		JLabel Nilai = new JLabel ("Nilai");
            		Nilai.setBounds(20,180,100,30);
            		JRadioButton NilaiA = new JRadioButton("A");
            		NilaiA.setBounds(20,210,50,30);
            		JRadioButton NilaiB = new JRadioButton("B");
            		NilaiB.setBounds(80,210,50,30);
            		JRadioButton NilaiC = new JRadioButton("C");
            		NilaiC.setBounds(140,210,50,30);
            		JRadioButton NilaiD = new JRadioButton("D");
            		NilaiD.setBounds(200,210,50,30);
            		JRadioButton NilaiE = new JRadioButton("E");
            		NilaiE.setBounds(260,210,50,30);
            		JRadioButton NilaiF = new JRadioButton("F");
            		NilaiF.setBounds(320,210,50,30);
            		ButtonGroup NilaiGroup = new ButtonGroup();
            		NilaiGroup.add(NilaiA);
            		NilaiGroup.add(NilaiB);
            		NilaiGroup.add(NilaiC);
            		NilaiGroup.add(NilaiD);
            		NilaiGroup.add(NilaiE);
            		NilaiGroup.add(NilaiF);

            		//Creat Buttons for save, delete, and clear
            		JButton Save = new JButton("Save");
            		Save.setBounds(20,260,110,50);
            		JButton Delete = new JButton("Delete");
            		Delete.setBounds(140,260,110,50);
            		JButton Clear = new JButton("Clear");
            		Clear.setBounds(260,260,110,50);
            		
            		//Add all element for Form into FormPanel
            		FormPanel.add(NPM);
            		FormPanel.add(getNPM);
            		FormPanel.add(Nama);
            		FormPanel.add(getNama);
            		FormPanel.add(Nilai);
            		FormPanel.add(NilaiA);
            		FormPanel.add(NilaiB);
            		FormPanel.add(NilaiC);
            		FormPanel.add(NilaiD);
            		FormPanel.add(NilaiE);
            		FormPanel.add(NilaiF);
            		FormPanel.add(Save);
            		FormPanel.add(Delete);
            		FormPanel.add(Clear);
            		DataPanel.add(FormPanel);
            		
            		//Table Panel
            		JPanel TablePanel = new JPanel();
            		DataPanel.add(TablePanel);
            		JTable table = new JTable(Informasi,Column);
            		JScrollPane scroll = new JScrollPane(table);
            		TablePanel.add(scroll);
            		DataPanel.add(TablePanel);
            		
            		//Input Data Panel to Main panel and Main panel to Frame.
            		MainPanel.add(DataPanel,BorderLayout.CENTER);
            		additionalInfoPanel.add(MainPanel);
            		

//                    JButton btnOK = new JButton("OK");
//                    btnOK.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            additionalInfoFrame.dispose(); // Close the additional information frame
//                        }
//                    });
//                    additionalInfoPanel.add(btnOK);

                    additionalInfoFrame.setVisible(true);
                }
            }
        });

        panel1.add(btnLogin);

        JLabel lblCopyright = new JLabel("copyright IBIK @ 2022", SwingConstants.CENTER);
        lblCopyright.setBackground(Color.BLUE);
        lblCopyright.setSize(300, 50);
        mainPanel.add(lblCopyright, BorderLayout.SOUTH);

        frame.add(panel1);
    }
}
