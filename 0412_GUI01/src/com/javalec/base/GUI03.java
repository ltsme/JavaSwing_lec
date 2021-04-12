package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class GUI03 {

	private JFrame frame;
	private JTextField tfFruit;
	private JCheckBox chApple;
	private JCheckBox chBanana;
	private JTextField tfBroad;
	JRadioButton rbKBS;
	JRadioButton rbMBC;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03 window = new GUI03();
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
	public GUI03() {
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
		
		chApple = new JCheckBox("Apple");
		chApple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fruitCheck();
			}
		});
		chApple.setBounds(24, 27, 128, 23);
		frame.getContentPane().add(chApple);
		
		chBanana = new JCheckBox("Banana");
		chBanana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fruitCheck();
			}
		});
		chBanana.setBounds(24, 81, 128, 23);
		frame.getContentPane().add(chBanana);
		
		JButton btn = new JButton("OK");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fruitCheck();
			}
		});
		btn.setBounds(24, 135, 117, 29);
		frame.getContentPane().add(btn);
		
		tfFruit = new JTextField();
		tfFruit.setBounds(22, 192, 206, 26);
		frame.getContentPane().add(tfFruit);
		tfFruit.setColumns(10);		
		
		rbKBS = new JRadioButton("KBS");
		buttonGroup.add(rbKBS);
		rbKBS.setBounds(252, 40, 141, 23);
		frame.getContentPane().add(rbKBS);
		
		 rbMBC = new JRadioButton("MBC");
		buttonGroup.add(rbMBC);
		rbMBC.setBounds(252, 95, 141, 23);
		frame.getContentPane().add(rbMBC);
		
		JButton btnBroad = new JButton("OK");
		btnBroad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnBroad.setBounds(252, 135, 117, 29);
		frame.getContentPane().add(btnBroad);
		
		tfBroad = new JTextField();
		tfBroad.setBounds(252, 192, 173, 26);
		frame.getContentPane().add(tfBroad);
		tfBroad.setColumns(10);
		
	}
	
	private void fruitCheck() {
		
		tfFruit.setText("");
		if (chApple.isSelected() == true) {
			tfFruit.setText("Apple이 선택 되었습니다.");
		}
		if (chBanana.isSelected() == true) {
			tfFruit.setText("Banana가 선택 되었습니다.");
		}		
		if (chBanana.isSelected() == true && chApple.isSelected() == true) {
			tfFruit.setText("둘 다 선택 되었습니다.");
		}
		
	}
	private void broadCheck(){
		if(rbKBS.isSelected()==true) {
			tfBroad.setText("KBS가 선택 되었습니다.");
		}
		if(rbMBC.isSelected()==true) {
			tfBroad.setText("MBC가 선택 되었습니다.");
		}
	}
}
