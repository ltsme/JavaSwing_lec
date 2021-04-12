package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI02 {

	private JFrame frame;
	private JTextField tfResult;
	private JComboBox cbNum1;
	private JComboBox cbNum2;
	private JComboBox cbCalc;
	private JButton btn;	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI02 window = new GUI02();
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
	public GUI02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String[] num1 = {"2","4","6","8"};
		String[] num2 = {"1","2","3","4","5","6","7","8","9"};
		String[] calc = {"+","-","*","/"};
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		cbNum1 = new JComboBox(num1);
		cbNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calC();
			}
		});
		cbNum1.setBounds(24, 31, 76, 27);
		frame.getContentPane().add(cbNum1);
		
		cbCalc = new JComboBox(calc);
		cbCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calC();
			}
		});
		cbCalc.setBounds(112, 31, 76, 27);
		frame.getContentPane().add(cbCalc);
		
		cbNum2 = new JComboBox(num2);
		cbNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calC();
			}
		});
		cbNum2.setBounds(200, 31, 76, 27);
		frame.getContentPane().add(cbNum2);
		
		tfResult = new JTextField();
		tfResult.setBounds(322, 31, 76, 27);
		frame.getContentPane().add(tfResult);
		tfResult.setColumns(10);
		
		
	}
	
	private void calC () { // 클릭시 마다 초기화
	int num1 = Integer.parseInt(cbNum1.getSelectedItem().toString()); // comboBox의 값을 String 형태로 받고, Int로 파싱
	int num2 = Integer.parseInt(cbNum2.getSelectedItem().toString());
	String result = "";
	String calC = cbCalc.getSelectedItem().toString(); // comboBox의 값을 String 형태로 받음
	
	
		switch (calC.charAt(0)) { // 콤보박스의 첫 번째를 Char 형태로 return 
		case '+':	
			result = Integer.toString(num1 + num2);
			tfResult.setText(result);
			break;
		case '-':	
			result = Integer.toString(num1 - num2);
			tfResult.setText(result);
			break;
		case '*':
			result = Integer.toString(num1 * num2);
			tfResult.setText(result);
			break;
		case '/':	
			result = Integer.toString(num1 / num2);
			tfResult.setText(result);
			break;	
		default:
			break;
		}	
	}	

}
