package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class GUI04 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	JLabel lblResult;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblResult_1;
	private JLabel lblResult_2;
	private JLabel lblResult_3;
	JRadioButton rbAdd
	ArrayList<String> arrayList = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI04 window = new GUI04();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Sukhumvit Set", Font.PLAIN, 16));
		textField.setBounds(49, 35, 98, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Sukhumvit Set", Font.PLAIN, 16));
		textField_1.setBounds(49, 90, 98, 38);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		rbAdd = new JRadioButton("Add");
		rbAdd.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		rbAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc();
			}
		});
		rbAdd.setBounds(280, 18, 141, 23);
		frame.getContentPane().add(rbAdd);
		
		JRadioButton rbMinus = new JRadioButton("Minus");
		rbMinus.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		rbMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc();
			}
		});
		rbMinus.setBounds(280, 42, 141, 23);
		frame.getContentPane().add(rbMinus);
		
		JRadioButton rbMulti = new JRadioButton("Multi");
		rbMulti.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		rbMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc();
			}
		});
		rbMulti.setBounds(280, 66, 141, 23);
		frame.getContentPane().add(rbMulti);
		
		JRadioButton rbDiv = new JRadioButton("Divide");
		rbDiv.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		rbDiv.setBounds(280, 90, 141, 23);
		rbDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc();
			}
		});
		frame.getContentPane().add(rbDiv);
		
		lblResult = new JLabel("");
		lblResult.setBackground(Color.PINK);
		lblResult.setForeground(Color.BLACK);
		lblResult.setFont(new Font("Myanmar Sangam MN", Font.PLAIN, 24));
		lblResult.setBounds(49, 140, 346, 23);
		frame.getContentPane().add(lblResult);
		
		lblResult_1 = new JLabel("");
		lblResult_1.setForeground(Color.BLACK);
		lblResult_1.setFont(new Font("Myanmar Sangam MN", Font.PLAIN, 24));
		lblResult_1.setBackground(Color.PINK);
		lblResult_1.setBounds(49, 166, 346, 23);
		frame.getContentPane().add(lblResult_1);
		
		lblResult_2 = new JLabel("");
		lblResult_2.setForeground(Color.BLACK);
		lblResult_2.setFont(new Font("Myanmar Sangam MN", Font.PLAIN, 24));
		lblResult_2.setBackground(Color.PINK);
		lblResult_2.setBounds(49, 190, 346, 23);
		frame.getContentPane().add(lblResult_2);
		
		lblResult_3 = new JLabel("");
		lblResult_3.setForeground(Color.BLACK);
		lblResult_3.setFont(new Font("Myanmar Sangam MN", Font.PLAIN, 24));
		lblResult_3.setBackground(Color.PINK);
		lblResult_3.setBounds(49, 214, 346, 23);
		frame.getContentPane().add(lblResult_3);
	}
	
	public void calc() {
		
		String str1 = textField.getText();
		String str2 = textField_1.getText();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);		
		
		if(rb)
		
	
		for(int i=0; i<arrayList.size(); i++) {
			switch (i) {
			case 0: lblResult.setText(str1 + " + " + str2 +  " = " + Integer.toString(num1+num2));		
				break;
			case 1:	lblResult_1.setText(str1 + " - " + str2 +  " = " + Integer.toString(num1-num2));			
				break;
			case 2:	lblResult_2.setText(str1 + " * " + str2 +  " = " + Integer.toString(num1*num2));			
				break;
			case 3:	lblResult_3.setText(str1 + " / " + str2 +  " = " + Integer.toString(num1/num2));			
				break;
			}
		}

	}	
}
