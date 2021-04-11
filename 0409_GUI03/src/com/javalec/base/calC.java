package com.javalec.base;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calC extends Main {
	

	private JTextField NUM1;
	private JTextField NUM2;
	private JTextField showNum1;
	private JButton plusBtn;
	private JButton minBtn;
	private JButton multiBtn;
	private JButton divBtn;
	private JTextField showNum2;
	private JTextField showResult;
	private JLabel label1;
	private JLabel label2;
	private JLabel labelPlus;
	private JLabel labelMinus;
	
	public calC() {
		
	}
	
	public calC(int a) {
		
	}


	
	private JTextField getNUM1() {
		if (NUM1 == null) {
			NUM1 = new JTextField();
			NUM1.setBounds(64, 27, 69, 26);
			NUM1.setColumns(10);
		}
		return NUM1;
	}
	private JTextField getNUM2() {
		if (NUM2 == null) {
			NUM2 = new JTextField();
			NUM2.setColumns(10);
			NUM2.setBounds(64, 74, 69, 26);
		}
		return NUM2;
	}
	private JTextField getShowNum1() {
		if (showNum1 == null) {
			showNum1 = new JTextField();
			showNum1.setColumns(10);
			showNum1.setBounds(67, 178, 56, 38);
		}
		return showNum1;
	}
	private JButton getPlusBtn() {
		if (plusBtn == null) {
			plusBtn = new JButton("+");
			plusBtn.setBounds(222, 27, 56, 29);
		}
		return plusBtn;
	}
	private JButton getMinBtn() {
		if (minBtn == null) {
			minBtn = new JButton("-");
			minBtn.setBounds(270, 27, 56, 29);
		}
		return minBtn;
	}
	private JButton getMultiBtn() {
		if (multiBtn == null) {
			multiBtn = new JButton("x");
			multiBtn.setBounds(317, 27, 56, 29);
		}
		return multiBtn;
	}
	private JButton getDivBtn() {
		if (divBtn == null) {
			divBtn = new JButton("/");
			divBtn.setBounds(365, 27, 56, 29);
		}
		return divBtn;
	}
	private JTextField getShowNum2() {
		if (showNum2 == null) {
			showNum2 = new JTextField();
			showNum2.setColumns(10);
			showNum2.setBounds(191, 178, 56, 38);
		}
		return showNum2;
	}
	private JTextField getShowResult() {
		if (showResult == null) {
			showResult = new JTextField();
			showResult.setColumns(10);
			showResult.setBounds(312, 178, 56, 38);
		}
		return showResult;
	}
	private JLabel getLabel1() {
		if (label1 == null) {
			label1 = new JLabel("1 :");
			label1.setBounds(27, 32, 36, 16);
		}
		return label1;
	}
	private JLabel getLabel2() {
		if (label2 == null) {
			label2 = new JLabel("2 :");
			label2.setBounds(27, 79, 36, 16);
		}
		return label2;
	}
	private JLabel getLabelPlus() {
		if (labelPlus == null) {
			labelPlus = new JLabel("+");
			labelPlus.setBounds(149, 189, 19, 16);
		}
		return labelPlus;
	}
	private JLabel getLabelMinus() {
		if (labelMinus == null) {
			labelMinus = new JLabel("=");
			labelMinus.setBounds(270, 189, 30, 16);
		}
		return labelMinus;
	}
	
	
	
	public void sum() {
		int wkNum1 = Integer.parseInt(NUM1.getText());
		int wkNum2 = Integer.parseInt(NUM2.getText());
		int wkResult = wkNum1 + wkNum2;
		
		
		showNum1.setText(Integer.toString(wkNum1));
		showNum2.setText(Integer.toString(wkNum2));
		showResult.setText(Integer.toString(wkResult));
	}
	public void minus() {
		int wkNum1 = Integer.parseInt(NUM1.getText());
		int wkNum2 = Integer.parseInt(NUM2.getText());
		int wkResult = wkNum1 - wkNum2;
		
		showNum1.setText(Integer.toString(wkNum1));
		showNum2.setText(Integer.toString(wkNum2));
		showResult.setText(Integer.toString(wkResult));
		
	}
	public void multi() {
		int wkNum1 = Integer.parseInt(NUM1.getText());
		int wkNum2 = Integer.parseInt(NUM2.getText());
		int wkResult = wkNum1 * wkNum2;
		
		showNum1.setText(Integer.toString(wkNum1));
		showNum2.setText(Integer.toString(wkNum2));
		showResult.setText(Integer.toString(wkResult));
	}
	public void div() {
		int wkNum1 = Integer.parseInt(NUM1.getText());
		int wkNum2 = Integer.parseInt(NUM2.getText());
		int wkResult = wkNum1 / wkNum2;
		
		showNum1.setText(Integer.toString(wkNum1));
		showNum2.setText(Integer.toString(wkNum2));
		showResult.setText(Integer.toString(wkResult));
	}
}
