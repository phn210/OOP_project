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
import javax.swing.JOptionPane;

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

public class Display extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenFile;
	private JTextField txtTuKhoa;
	private FileTxt file = new FileTxt();
	private ChonTag selectionTag = new ChonTag();

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
		setBounds(100, 100, 838, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("OOP");
		
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
		JCheckBox check1 = new JCheckBox("Thông tin sàn giao dịch",false);
		check1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if (check1.isSelected()) {
					check1.setBorderPaintedFlat(true);
				}else {
					check1.setBorderPaintedFlat(false);
				}
			}
		});
		
		JCheckBox check2 = new JCheckBox("Tăng nhiều nhất", false);
		check2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (check2.isSelected()) {
					check2.setBorderPaintedFlat(true);
				}else {
					check2.setBorderPaintedFlat(false);
				}
			}
		});
		
		JCheckBox check3 = new JCheckBox("Dẫn đầu", false);
		check3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		check3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(check3.isSelected()) {
					check3.setBorderPaintedFlat(true);
				}else {
					check3.setBorderPaintedFlat(false);
				}
				
			}
		});
		
		JButton optionalAdress = new JButton("...");
		optionalAdress.setToolTipText("Chọn file bạn muốn xử lý.");
		optionalAdress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		optionalAdress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser(); 	
				if (fileChooser.showOpenDialog(txtTenFile) == JFileChooser.APPROVE_OPTION) {    //chọn file
					String FileAddress = fileChooser.getSelectedFile().getAbsolutePath();   //Khai báo và gán tên file
					txtTenFile.setText(FileAddress);
				}
			}
		});
		
		JButton chayFile = new JButton("Đọc file");
		chayFile.setToolTipText("Chạy file và in ra kết quả ");
		chayFile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chayFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					file.openFile(txtTenFile.getText());
					JOptionPane.showMessageDialog(null, "Đọc file thành công!!");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JButton TimKiemtxt = new JButton("Xử Lí");
		TimKiemtxt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TimKiemtxt.setToolTipText("Xử lý file theo thông tin bạn nhập vào");
		TimKiemtxt.addActionListener(new ActionListener() {
			//Lấy từ khóa người dùng nhập ở đây
			public void actionPerformed(ActionEvent e) {
				String TuKhoa = txtTuKhoa.getText();
				
				
				
				
			}
		});
		
		JButton SelectionTag = new JButton("Chọn Tag");
		SelectionTag.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SelectionTag.setToolTipText("Bạn có thể chọn những tag bạn muốn !!");
		SelectionTag.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				selectionTag.run();
				
			}
		});
		
		JButton Result = new JButton("In kết quả");
		Result.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Result.setToolTipText("Kết quả sẽ được in ra dưới dạng result.txt");
		Result.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileTxt file = new FileTxt();
				file.createNewFile();
				//file.writerToFile("Long");
				
				JOptionPane.showMessageDialog(null, "Hoàn thành,Kết quả đã được tạo !!");
				
			}
		});
		
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
							.addComponent(chayFile, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(nhapTuKhoa)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(txtTuKhoa, GroupLayout.PREFERRED_SIZE, 545, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(check1)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(check2)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(check3, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(SelectionTag))))
								.addComponent(hotTag, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(TimKiemtxt, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
								.addComponent(Result))))
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
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(hotTag)
						.addComponent(Result)
						.addComponent(SelectionTag)
						.addComponent(check1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(check2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(check3, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
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
