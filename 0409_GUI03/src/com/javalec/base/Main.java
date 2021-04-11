package com.javalec.base;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Main calc = new calC();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(calc.getNUM1());
		frame.getContentPane().add(getNUM2());
		frame.getContentPane().add(getShowNum1());
		frame.getContentPane().add(getShowNum2());
		frame.getContentPane().add(getShowResult());
		frame.getContentPane().add(getPlusBtn());
		frame.getContentPane().add(getMinBtn());
		frame.getContentPane().add(getMultiBtn());
		frame.getContentPane().add(getDivBtn());
		frame.getContentPane().add(getLabel1());
		frame.getContentPane().add(getLabel2());
		frame.getContentPane().add(getLabelPlus());
		frame.getContentPane().add(getLabelMinus());
	}
	/**
	 * Create the application.
	 */
	public Main() {
	
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */

	
	
}
