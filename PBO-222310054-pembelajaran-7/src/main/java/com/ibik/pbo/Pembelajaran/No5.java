package com.ibik.pbo.Pembelajaran;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class No5 {
	
	private static JTextField getNPM;
	private static JTextField getNama;
	private static ButtonGroup NilaiGroup;
	
	public static void main(String args[]){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setSize(300,300);
		frame.setTitle("Latihan 04");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
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
		frame.add(MainPanel);
		
	}
}
