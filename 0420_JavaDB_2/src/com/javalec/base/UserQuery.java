package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.mysql.cj.protocol.Resultset;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.ListSelectionModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserQuery {

	private JFrame frame;
	private JTextField tfSelection;
	private JButton btnQuery;

	// DB 환경 정의
	// 127.0.0.1/useraddress 말고는 안 바뀌니 그대로 카피해서 사용
	private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";  //fianl : 값이 불변
	private final String id_mysql = "root";
	private final String pw_mysql = "qwer1234";
	
	//Table 환경 정의
	private final DefaultTableModel Outer_Table = new DefaultTableModel();
	
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2_1;
	private JTextField tfSeq;
	private JTextField tfName;
	private JTextField tfPhone;
	
	String message = "";	
	private JScrollPane scrollPane;
	private JTable Inner_Table;
	private JLabel lblNewLabel_2_1_1;
	private JTextField tfAddress;
	private JLabel lblNewLabel_2_1_2;
	private JTextField tfEmail;
	private JLabel lblNewLabel_2_1_2_1;
	private JTextField tfRelation;
	private JComboBox cbSelection;
	private JTextField tfdataCount;
	private JLabel lblNewLabel;
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserQuery window = new UserQuery();
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
	public UserQuery() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();	
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				tableInit();
				searchAction();
			}
		});		
		
		
		frame.setTitle("주소록 등록");
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfSelection());
		frame.getContentPane().add(getBtnQuery());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getLblNewLabel_2_1());
		frame.getContentPane().add(getTfSeq());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getTfPhone());
		frame.getContentPane().add(getScrollPane());
		frame.getContentPane().add(getLblNewLabel_2_1_1());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getLblNewLabel_2_1_2());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getLblNewLabel_2_1_2_1());
		frame.getContentPane().add(getTfRelation());
		frame.getContentPane().add(getCbSelection());
		frame.getContentPane().add(getTfdataCount());
		frame.getContentPane().add(getLblNewLabel());
	}
	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(132, 20, 169, 26);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}
	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				}
			});
			btnQuery.setBounds(313, 20, 117, 29);
		}
		return btnQuery;
	}
	
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Seq No :");
			lblNewLabel_2.setBounds(36, 233, 61, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("이름 :");
			lblNewLabel_3.setBounds(36, 276, 61, 16);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("전화번호 :");
			lblNewLabel_2_1.setBounds(36, 309, 61, 16);
		}
		return lblNewLabel_2_1;
	}
	private JTextField getTfSeq() {
		if (tfSeq == null) {
			tfSeq = new JTextField();
			tfSeq.setEditable(false);
			tfSeq.setColumns(10);
			tfSeq.setBounds(109, 228, 61, 26);
		}
		return tfSeq;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setEditable(false);
			tfName.setColumns(10);
			tfName.setBounds(109, 271, 130, 26);
		}
		return tfName;
	}
	private JTextField getTfPhone() {
		if (tfPhone == null) {
			tfPhone = new JTextField();
			tfPhone.setEditable(false);
			tfPhone.setColumns(10);
			tfPhone.setBounds(109, 304, 203, 26);
		}
		return tfPhone;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(26, 58, 404, 155);
			scrollPane.setViewportView(getInner_Table());
		}
		return scrollPane;
	}
	private JTable getInner_Table() { // 반드시 헤더 말고 pane 내용 부분에 넣기 
		if (Inner_Table == null) {
			Inner_Table = new JTable();
			Inner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tableClick();
				}
			});
			Inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // SingleSelection 설정
			Inner_Table.setModel(Outer_Table); // 추가된 부분; inner 와 Outer가 동시에 이동.
			
		}
		return Inner_Table;
	}
	private JLabel getLblNewLabel_2_1_1() {
		if (lblNewLabel_2_1_1 == null) {
			lblNewLabel_2_1_1 = new JLabel("주소 :");
			lblNewLabel_2_1_1.setBounds(36, 347, 61, 16);
		}
		return lblNewLabel_2_1_1;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setEditable(false);
			tfAddress.setColumns(10);
			tfAddress.setBounds(109, 342, 267, 26);
		}
		return tfAddress;
	}
	private JLabel getLblNewLabel_2_1_2() {
		if (lblNewLabel_2_1_2 == null) {
			lblNewLabel_2_1_2 = new JLabel("전자우편 :");
			lblNewLabel_2_1_2.setBounds(36, 385, 61, 16);
		}
		return lblNewLabel_2_1_2;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setEditable(false);
			tfEmail.setColumns(10);
			tfEmail.setBounds(109, 380, 267, 26);
		}
		return tfEmail;
	}
	private JLabel getLblNewLabel_2_1_2_1() {
		if (lblNewLabel_2_1_2_1 == null) {
			lblNewLabel_2_1_2_1 = new JLabel("관계 :");
			lblNewLabel_2_1_2_1.setBounds(36, 425, 61, 16);
		}
		return lblNewLabel_2_1_2_1;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setEditable(false);
			tfRelation.setColumns(10);
			tfRelation.setBounds(109, 420, 130, 26);
		}
		return tfRelation;
	}
	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소"}));
			cbSelection.setToolTipText("");
			cbSelection.setBounds(26, 21, 94, 27);
		}
		return cbSelection;
	}
	
	
	//화면 Table 초기화 
	private void tableInit() {
		Outer_Table.addColumn("순서");
		Outer_Table.addColumn("이름");
		Outer_Table.addColumn("전화번호");
		Outer_Table.addColumn("관계");
		Outer_Table.setColumnCount(4);
		
		int i = Outer_Table.getRowCount();
		for(int j=0; j<i; j++) {
			Outer_Table.removeRow(0); // 첫 줄만 계속 지우도록 
		}		
		Inner_Table.setAutoResizeMode(Inner_Table.AUTO_RESIZE_OFF);
		
		int vColIndex=0;
		TableColumn col = Inner_Table.getColumnModel().getColumn(vColIndex);
		int width = 40;
		col.setPreferredWidth(width);
		
		vColIndex=1;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 80;
		col.setPreferredWidth(width);	
		
		vColIndex=2;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 160;
		col.setPreferredWidth(width);	
		
		vColIndex=3;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 200;
		col.setPreferredWidth(width);			
	}
	
	//Table clicked
		private void tableClick() {			
			int clickedRow = Inner_Table.getSelectedRow(); // 선택된 row 위치 (0부터 시작)
			System.out.println(clickedRow);
			String wkSeq = (String) Inner_Table.getValueAt(clickedRow, 0); // row 위치에 해당하는 값 (여기선 Seq 1~)
			System.out.println(wkSeq);
			String query = "select seqno, name, telno, address, email, relation from userinfo where seqno = " + wkSeq;
			System.out.println(query);
			
			try {
				PreparedStatement ps = null;
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
				Statement stmt_mysql = conn_mysql.createStatement();				
				ResultSet rs = stmt_mysql.executeQuery(query);	
				
					while (rs.next()) {			
						tfSeq.setText(rs.getString(1));
						tfName.setText(rs.getString(2));
						tfPhone.setText(rs.getString(3));
						tfAddress.setText(rs.getString(4));
						tfEmail.setText(rs.getString(5));
						tfRelation.setText(rs.getString(6));
					}
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}	
			
		}
			

	private void searchAction() {
		String query = "select seqno, name, telno, relation from userinfo ";
		
		int dataCount = 0;
		try {
			PreparedStatement ps = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query);	
			
			while (rs.next()) {
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
				Outer_Table.addRow(qTxt);
				dataCount++;
				tfdataCount.setText(Integer.toString(dataCount));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}		
	}
	private JTextField getTfdataCount() {
		if (tfdataCount == null) {
			tfdataCount = new JTextField();
			tfdataCount.setEditable(false);
			tfdataCount.setBounds(377, 228, 25, 26);
			tfdataCount.setColumns(10);
		}
		return tfdataCount;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("명");
			lblNewLabel.setBounds(405, 233, 25, 16);
		}
		return lblNewLabel;
	}
	
	
}
