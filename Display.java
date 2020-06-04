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
		//Táº¡o ra báº£ng Panel
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//CÃ¡c khung nháº­p dá»¯ liá»‡u
		txtTenFile = new JTextField();
		txtTenFile.setColumns(12);
		
		txtTuKhoa = new JTextField();
		txtTuKhoa.setColumns(12);
		
		//Táº¡o vÃ  cÃ i cÃ¡c Label trong báº£ng
		JLabel ChonFile = new JLabel("Chá»�n file");
		ChonFile.setHorizontalAlignment(SwingConstants.TRAILING);
		ChonFile.setVerticalAlignment(SwingConstants.BOTTOM);
		ChonFile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel nhapTuKhoa = new JLabel("Nháº­p Cá»• Phiáº¿u");
		nhapTuKhoa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nhapTuKhoa.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JLabel hotTag = new JLabel("Hot Tag");
		hotTag.setFont(new Font("Tahoma", Font.PLAIN, 16));
		hotTag.setHorizontalAlignment(SwingConstants.TRAILING);
		
		//CÃ¡c check box
		JCheckBox checkNDT = new JCheckBox("NhÃ  Ä�áº§u TÆ°",false);
		checkNDT.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkNDT.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkNDT.isSelected()) {
					checkNDT.setBorderPaintedFlat(true);
				}else {
					checkNDT.setBorderPaintedFlat(false);
				}
			}
		});
		
		JCheckBox checkHNX = new JCheckBox("HNX", false);
		checkHNX.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkHNX.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkHNX.isSelected()) {
					checkHNX.setBorderPaintedFlat(true);
				}else {
					checkHNX.setBorderPaintedFlat(false);
				}
			}
		});
		
		JCheckBox checkDanDau = new JCheckBox("Dáº«n Ä‘áº§u", false);
		checkDanDau.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JCheckBox checkDanDau_1 = new JCheckBox("Dáº«n Ä‘áº§u", false);
		checkDanDau_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
	
		JButton optionalAdress = new JButton("...");
		optionalAdress.setToolTipText("Chá»�n file báº¡n muá»‘n xá»­ lÃ½.");
		optionalAdress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		optionalAdress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser(); 	
				if (fileChooser.showOpenDialog(txtTenFile) == JFileChooser.APPROVE_OPTION) {    //NgÆ°á»�i dÃ¹ng chá»�n file
					String FileAddress = fileChooser.getSelectedFile().getAbsolutePath();   //Khai bÃ¡o vÃ  gÃ¡n tÃªn file
					txtTenFile.setText(FileAddress);  	//Hiá»‡n thá»‹ Ä‘á»‹a chá»‰ file á»Ÿ báº£ng
				}
			}
		});
		
		JButton chayFile = new JButton("Cháº¡y file");
		chayFile.setToolTipText("Cháº¡y file vÃ  in ra káº¿t quáº£ ");
		chayFile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chayFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileTxt file = new FileTxt();
					file.openFile(txtTenFile.getText());
					file.createNewFile();
					//File.openFile(txtTenFile.getText());
					//txtKetQua.setText(s);
					file.writeToFile(file.processFile());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JButton TimKiemtxt = new JButton("Xá»­ LÃ­");
		TimKiemtxt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TimKiemtxt.setToolTipText("Xá»­ lÃ½ file theo thÃ´ng tin báº¡n nháº­p vÃ o");
		TimKiemtxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(txtTuKhoa.getText());
			}
		});
		
		@SuppressWarnings("rawtypes")
		JComboBox optionalTag = new JComboBox();
		optionalTag.setName("Chá»�n tag");
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
