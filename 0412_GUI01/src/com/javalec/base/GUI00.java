package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI00 {

	private JFrame frmGui;
	private JTextField tfFruits;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI00 window = new GUI00();
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
	public GUI00() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frmGui = new JFrame();
		frmGui.setTitle("GUI00");
		frmGui.setBounds(100, 100, 450, 300);
		frmGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGui.getContentPane().setLayout(null);
		
		JComboBox cbFruits = new JComboBox();
		cbFruits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String stFruits = cbFruits.getSelectedItem().toString();
				tfFruits.setText(stFruits);
			}
		});
		cbFruits.setBounds(44, 54, 87, 27);
		cbFruits.setModel(new DefaultComboBoxModel(new String[] {"apple", "banana", "fineapple"}));
		frmGui.getContentPane().add(cbFruits);
		
		tfFruits = new JTextField();
		tfFruits.setText("apple");
		tfFruits.setBounds(179, 53, 130, 26);
		frmGui.getContentPane().add(tfFruits);
		tfFruits.setColumns(10);

		
	}

}
