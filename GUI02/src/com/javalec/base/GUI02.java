package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GUI02 {

	private JFrame frmButttonTest;
	private JButton btnNewButton;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI02 window = new GUI02();
					window.frmButttonTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmButttonTest = new JFrame();
		frmButttonTest.setBounds(100, 100, 450, 300);
		frmButttonTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmButttonTest.getContentPane().setLayout(null);
		frmButttonTest.getContentPane().add(getBtnNewButton());
		frmButttonTest.getContentPane().add(getLblNewLabel());
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Clear");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblNewLabel.setText("");
				}
			});
			btnNewButton.setBounds(161, 134, 117, 29);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("더하기");
			lblNewLabel.setBounds(22, 29, 145, 16);
		}
		return lblNewLabel;
	}
}
