package bai_tap_lon;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JTree;
import java.awt.Canvas;
import java.awt.TextField;
import java.awt.List;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Display1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenFile;
	private JTextField txtTuKhoa;
	private JTextField txtH1;
	private JTextField txtH2;
	private JTextField txtH4;
	private JTextField txtH3;
	private JTextField txtH5;
	
	public static String txtAllFile = null;
	private static SanGiaoDich HOSE = null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display1 frame = new Display1();
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
	public Display1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtTenFile = new JTextField();
		txtTenFile.setColumns(10);
		
		txtTuKhoa = new JTextField();
		txtTuKhoa.setColumns(10);
		
		JLabel ChonFile = new JLabel("Chọn file");
		ChonFile.setHorizontalAlignment(SwingConstants.TRAILING);
		ChonFile.setVerticalAlignment(SwingConstants.BOTTOM);
		ChonFile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel NhapTu = new JLabel("Nhập từ khóa");
		NhapTu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		NhapTu.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JLabel hotTag = new JLabel("Hot Tag");
		hotTag.setFont(new Font("Tahoma", Font.PLAIN, 16));
		hotTag.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JLabel ketQua = new JLabel("Kết Quả");
		ketQua.setHorizontalAlignment(SwingConstants.TRAILING);
		ketQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JSlider slider = new JSlider();
		
		JScrollBar scrollBar = new JScrollBar();
		
		txtH1 = new JTextField();
		txtH1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtH1.setColumns(10);
		
		txtH2 = new JTextField();
		txtH2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtH2.setColumns(10);
		
		txtH4 = new JTextField();
		txtH4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtH4.setColumns(10);
		
		txtH3 = new JTextField();
		txtH3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtH3.setColumns(10);
		
		txtH5 = new JTextField();
		txtH5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtH5.setColumns(10);
		
		JTextArea txtKetQua = new JTextArea();
		
		JButton openFile = new JButton("...");
		openFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser(); 	//Khai báo đối tượng để mở file
				if (fileChooser.showOpenDialog(txtTenFile) == JFileChooser.APPROVE_OPTION) {    //Người dùng chọn file
					String TenFile = fileChooser.getSelectedFile().getAbsolutePath();   //Khai báo và gán tên file
					txtTenFile.setText(TenFile);  	//Hiện thị đường dẫn file ở bảng
				}
			}
		});
		openFile.setToolTipText("Chọn file bạn muốn xử lý.");
		openFile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton chayFile = new JButton("Chạy file");
		chayFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					txtAllFile = File.openFile(txtTenFile.getText()); //toàn bộ dữ liệu từ file .csv
					txtKetQua.setText(txtAllFile);
					HOSE = new SanGiaoDich(txtAllFile,440); // co 440 loai co phieu tu file .csv
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		chayFile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton timKiem = new JButton("Tìm Kiếm");
		timKiem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(ChonFile, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(NhapTu, GroupLayout.PREFERRED_SIZE, 108, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(ketQua, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
								.addComponent(hotTag, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtH1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtH2, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtH3, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(txtH4, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtH5, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtKetQua, GroupLayout.PREFERRED_SIZE, 1111, GroupLayout.PREFERRED_SIZE))
							.addGap(3)
							.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(txtTuKhoa, GroupLayout.PREFERRED_SIZE, 545, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(timKiem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addComponent(txtTenFile, GroupLayout.PREFERRED_SIZE, 545, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(openFile, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(chayFile))))
					.addContainerGap())
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
							.addComponent(openFile, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addComponent(chayFile, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(timKiem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtTuKhoa, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
							.addComponent(NhapTu)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtH5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(hotTag)
							.addComponent(txtH1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtH2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtH3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtH4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addComponent(ketQua))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(scrollBar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txtKetQua, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
					.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
