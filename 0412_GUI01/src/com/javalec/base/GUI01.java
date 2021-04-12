package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class GUI01 {

	private JFrame frmGui;
	private JTextField tfFruits;
	private JComboBox cbAdd;
	private JTextField tfAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI01 window = new GUI01();
					window.frmGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGui = new JFrame();
		frmGui.setTitle("GUI01");
		frmGui.setBounds(100, 100, 450, 300);
		frmGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGui.getContentPane().setLayout(null);
	
		
		cbAdd = new JComboBox();
		cbAdd.setBounds(169, 95, 52, 27);
		frmGui.getContentPane().add(cbAdd);
		
		tfAdd = new JTextField();
		tfAdd.setBounds(28, 96, 130, 26);
		frmGui.getContentPane().add(tfAdd);
		tfAdd.setColumns(10);
		
		JButton btnAdd = new JButton("add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addCombo();
			}
		});
		btnAdd.setBounds(41, 156, 117, 29);
		frmGui.getContentPane().add(btnAdd);		
	}
	
	private JComboBox getCbAdd() {
		if (cbAdd == null) {
			cbAdd = new JComboBox();
			cbAdd.setBounds(null);
		}
		return cbAdd;
	}
	
	private void addCombo() {
		String stTemp = tfAdd.getText();
		cbAdd.addItem(stTemp);
	}
}
