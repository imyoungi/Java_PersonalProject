package login_part;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import calendar_part.Calendars;
import java.awt.Font;
import javax.swing.ImageIcon;

import javax.swing.JDesktopPane;
import java.awt.SystemColor;

public class Login implements ActionListener {

	private JFrame frmRtrt;
	private JTextField textField;
	private JPasswordField passwordField;
	private final String correct_id = "A12345"; // 사번
	private final String correct_pwd = "gr12345";
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private final JLabel lblNewLabel_4 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmRtrt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			System.out.println("setting look and feel");
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {

		}
		frmRtrt = new JFrame();
		frmRtrt.getContentPane().setBackground(SystemColor.menu);
		frmRtrt.setFont(new Font("Arial", Font.BOLD, 14));
		frmRtrt.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/calendar_part/images/그림1.png")));
		frmRtrt.setTitle("Welcome to Wem!t :)");
		frmRtrt.setBounds(100, 100, 1200, 900);
		frmRtrt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRtrt.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(851, 156, 281, 25);
		frmRtrt.getContentPane().add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(851, 198, 281, 25);
		frmRtrt.getContentPane().add(passwordField);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(UIManager.getColor("Tree.hash"));
		lblNewLabel.setFont(new Font("Artifakt Element", Font.PLAIN, 17));
		lblNewLabel.setBounds(797, 156, 57, 31);
		frmRtrt.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("PWD");
		lblNewLabel_1.setForeground(UIManager.getColor("Tree.hash"));
		lblNewLabel_1.setFont(new Font("Artifakt Element", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(797, 194, 74, 37);
		frmRtrt.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(SystemColor.textInactiveText);
		btnNewButton.setFont(new Font("Artifakt Element", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("")) {
					textField_1.setText("ID를 입력하세요.");
				} else if (String.valueOf(passwordField.getPassword()).equals("")) {
					textField_1.setText("Password를 입력하세요."); 
				} else if (textField.getText().equals(correct_id) 
						&& String.valueOf(passwordField.getPassword()).equals(correct_pwd)){
					textField_1.setText("로그인 되었습니다.");
					frmRtrt.dispose(); 
					new Calendars(); //화면 전환
				} else {
					textField_1.setText("로그인 정보를 확인하세요!");
				}
			}
		});
		
			
		btnNewButton.setBounds(797, 249, 335, 37);
		frmRtrt.getContentPane().add(btnNewButton);

		textField_1 = new JTextField();
		textField_1.setBounds(797, 296, 335, 25);
		frmRtrt.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.inactiveCaption);
		desktopPane.setBounds(179, 304, 1, 1);
		frmRtrt.getContentPane().add(desktopPane);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Administrator.User -2022FWZHE\\Pictures\\그림3.png"));
		lblNewLabel_2.setBounds(-36, 335, 1055, 581);
		frmRtrt.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("We Meet HERE, Wem!t");
		lblNewLabel_3.setForeground(UIManager.getColor("ToolBar.shadow"));
		lblNewLabel_3.setFont(new Font("Artifakt Element", Font.PLAIN, 26));
		lblNewLabel_3.setBounds(57, 314, 566, 246);
		frmRtrt.getContentPane().add(lblNewLabel_3);
		lblNewLabel_4.setBackground(SystemColor.inactiveCaption);
		lblNewLabel_4.setBounds(0, 0, 1184, 31);
		frmRtrt.getContentPane().add(lblNewLabel_4);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}