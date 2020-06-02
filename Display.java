package bai_tap_lon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JFileChooser;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JComboBox;

public class Display extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenFile;
	private JTextField txtTuKhoa;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display frame = new Display();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Display() {
		//Tạo ra bảng Panel
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//Các khung nhập dữ liệu
		txtTenFile = new JTextField();
		txtTenFile.setColumns(12);
		
		txtTuKhoa = new JTextField();
		txtTuKhoa.setColumns(12);
		
		//Tạo và cài các Label trong bảng
		JLabel ChonFile = new JLabel("Chọn file");
		ChonFile.setHorizontalAlignment(SwingConstants.TRAILING);
		ChonFile.setVerticalAlignment(SwingConstants.BOTTOM);
		ChonFile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel nhapTuKhoa = new JLabel("Nhập Cổ Phiếu");
		nhapTuKhoa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nhapTuKhoa.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JLabel hotTag = new JLabel("Hot Tag");
		hotTag.setFont(new Font("Tahoma", Font.PLAIN, 16));
		hotTag.setHorizontalAlignment(SwingConstants.TRAILING);
		
		//Các check box
		JCheckBox checkNDT = new JCheckBox("Nhà Đầu Tư",false);
		checkNDT.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkNDT.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = 1;
				if (i%2 == 1) {
					checkNDT.setBorderPaintedFlat(true);
				}else {
					checkNDT.setBorderPaintedFlat(false);
				}
			}
		});
	
		JButton optionalAdress = new JButton("...");
		optionalAdress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser(); 	
				if (fileChooser.showOpenDialog(txtTenFile) == JFileChooser.APPROVE_OPTION) {    //Người dùng chọn file
					String FileAddress = fileChooser.getSelectedFile().getAbsolutePath();   //Khai báo và gán tên file
					txtTenFile.setText(FileAddress);  	//Hiện thị địa chỉ file ở bảng
				}
			}
		});
		optionalAdress.setToolTipText("Chọn file bạn muốn xử lý.");
		optionalAdress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton chayFile = new JButton("Chạy file");
		chayFile.setToolTipText("Chạy file và in ra kết quả ");
		chayFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File();
					file.openFile(txtTenFile.getText());
										
//					if (choice == true) {
//						System.out.println("avx");
//					}
					//File.openFile(txtTenFile.getText());
					//txtKetQua.setText(s);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		chayFile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton TimKiemtxt = new JButton("Xử Lí");
		TimKiemtxt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TimKiemtxt.setToolTipText("Xử lý file theo thông tin bạn nhập vào");
		TimKiemtxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(txtTuKhoa.getText());
			}
		});
		
		JCheckBox checkHNX = new JCheckBox("HNX", false);
		checkHNX.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JCheckBox checkDanDau = new JCheckBox("Dẫn đầu", false);
		checkDanDau.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JCheckBox checkDanDau_1 = new JCheckBox("Dẫn đầu", false);
		checkDanDau_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		@SuppressWarnings("rawtypes")
		JComboBox optionalTag = new JComboBox();
		optionalTag.setName("Chọn tag");
		optionalTag.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		optionalTag.setMaximumRowCount(100);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ChonFile, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtTenFile, GroupLayout.PREFERRED_SIZE, 545, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(optionalAdress, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chayFile))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(nhapTuKhoa)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtTuKhoa, GroupLayout.PREFERRED_SIZE, 545, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(checkNDT, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(checkHNX, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(checkDanDau, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(checkDanDau_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))))
								.addComponent(hotTag, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(optionalTag, 0, 98, Short.MAX_VALUE)
								.addComponent(TimKiemtxt, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))))
					.addGap(31))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtTenFile, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addComponent(ChonFile))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(optionalAdress, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addComponent(chayFile, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtTuKhoa, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addComponent(nhapTuKhoa))
						.addComponent(TimKiemtxt, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(optionalTag, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(hotTag)
							.addComponent(checkNDT, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(checkHNX, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
							.addComponent(checkDanDau, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
							.addComponent(checkDanDau_1, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
					.addGap(317))
		);
		contentPane.setLayout(gl_contentPane);
		
		
	}
	@SuppressWarnings("unused")
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
