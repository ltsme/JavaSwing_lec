package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI00 {

	private JFrame frmGui;

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
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "OK 버튼");
			}
		});
		btnNewButton.setBounds(163, 120, 126, 38);
		frmGui.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Java Swing Button Test");
		lblNewLabel.setBounds(28, 24, 157, 24);
		frmGui.getContentPane().add(lblNewLabel);
	}

}
