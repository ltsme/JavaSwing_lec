package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddressInsert {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField tfName;
	private JButton btnOK;

	// DB 환경 정의
	// 127.0.0.1/useraddress 말고는 안 바뀌니 그대로 카피해서 사용
	private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";  //fianl : 값이 불변
	private final String id_mysql = "root";
	private final String pw_mysql = "qwer1234";
	
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2_1;
	private JTextField tfPhoneNum;
	private JTextField tfAddress;
	private JTextField tf_Email;
	private JTextField tfRelation;
	
	String message = "";	
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressInsert window = new AddressInsert();
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
	public AddressInsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("주소록 등록");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getBtnOK());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getLblNewLabel_2_1());
		frame.getContentPane().add(getTfPhoneNum());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getTf_Email());
		frame.getContentPane().add(getTfRelation());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("성명 : ");
			lblNewLabel.setBounds(16, 16, 61, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(89, 11, 130, 26);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("입력");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int key = nullCheck();
					if(key>0) insertAction();
				}
			});
			btnOK.setBounds(316, 226, 117, 29);
		}
		return btnOK;
	}
	
	private void insertAction() { // 사용자 정보 입력
								
			try {
				PreparedStatement ps = null;
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
				Statement stmt_mysql = conn_mysql.createStatement();
				
				String query = "insert into userinfo(name, telno, address, email, relation) values (?, ?, ?, ?, ?)"; // ? =  1, tfName.getText().trim() 
				ps = conn_mysql.prepareStatement(query);
				ps.setString(1, tfName.getText().trim()); // tf의 값을 넣어줌		
				ps.setString(2, tfPhoneNum.getText().trim()); // tf의 값을 넣어줌		
				ps.setString(3, tfAddress.getText().trim()); // tf의 값을 넣어줌		
				ps.setString(4, tf_Email.getText().trim()); // tf의 값을 넣어줌			
				ps.setString(5, tfRelation.getText().trim()); // tf의 값을 넣어줌
					
				ps.executeUpdate(); // DB로 Insert하는 과정						
				conn_mysql.close();
				JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 입력 되었습니다.");							
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}		
	}
	
	private int nullCheck() {	
			message = "";
			int key = 0;
			
			if(tfName.getText().trim().length() == 0) message += "[성명] "; key++;
			if(tfPhoneNum.getText().trim().length() == 0) message += "[전화번호] "; key++;
			if(tfAddress.getText().trim().length() == 0) message += "[주소] "; key++;
			if(tf_Email.getText().trim().length() == 0) message += "[전자우편] "; key++;
			if(tfRelation.getText().trim().length() == 0) message += "[관계]"; key++;	
			
			if( key > 0) { // 공백이 있을 때 
				JOptionPane.showMessageDialog(null, message + "을(를) 입력하지 않았습니다. 다시 입력해 주세요. ");
				return 0;
			} else return key; // 공백이 없을 때 			
	}
	
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("전화번호 : ");
			lblNewLabel_1.setBounds(16, 58, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("주소 : ");
			lblNewLabel_2.setBounds(16, 95, 61, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("전자우편 :");
			lblNewLabel_3.setBounds(16, 136, 61, 16);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("관계 : ");
			lblNewLabel_2_1.setBounds(16, 176, 61, 16);
		}
		return lblNewLabel_2_1;
	}
	private JTextField getTfPhoneNum() {
		if (tfPhoneNum == null) {
			tfPhoneNum = new JTextField();
			tfPhoneNum.setColumns(10);
			tfPhoneNum.setBounds(89, 53, 130, 26);
		}
		return tfPhoneNum;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(89, 90, 130, 26);
		}
		return tfAddress;
	}
	private JTextField getTf_Email() {
		if (tf_Email == null) {
			tf_Email = new JTextField();
			tf_Email.setColumns(10);
			tf_Email.setBounds(89, 131, 130, 26);
		}
		return tf_Email;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(89, 171, 130, 26);
		}
		return tfRelation;
	}
}
