package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI01 {

	private JFrame frmButttonTest;
	private JButton btnNewButton;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI01 window = new GUI01();
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
	public GUI01() {
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
		frmButttonTest.getContentPane().add(getTfNum1());
		frmButttonTest.getContentPane().add(getTfNum2());
		frmButttonTest.getContentPane().add(getTfResult());
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("계산하기");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// 1st 방법
//					String stNum1 = tfNum1.getText();
//					String stNum2 = tfNum2.getText();
//					int wkNum1 = Integer.parseInt(stNum1);
//					int wkNum2 = Integer.parseInt(stNum2);
//					int wkResult = wkNum1 + wkNum2;
//					
//					String stResult = Integer.toString(wkResult);
//					tfResult.setText(stResult);
					addSum();
					
				}
			});
			btnNewButton.setBounds(313, 105, 117, 29);
		}
		return btnNewButton;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(24, 105, 82, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setBounds(123, 105, 76, 26);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setColumns(10);
			tfResult.setBounds(225, 105, 76, 26);
		}
		return tfResult;
	}
	
	private void addSum() {
		// 2nd (코드 줄여나가기)
		
		int wkNum1 = Integer.parseInt(tfNum1.getText());
		int wkNum2 = Integer.parseInt(tfNum2.getText());
		int wkResult = wkNum1 + wkNum2;
		
		tfResult.setText(Integer.toString(wkResult));
		JOptionPane.showMessageDialog(null, Integer.toString(wkResult));

	}
}
