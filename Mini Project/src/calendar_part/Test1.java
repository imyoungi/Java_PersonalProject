package calendar_part;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Test1 extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test1 window = new Test1();
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
	public Test1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator.User -2022FWZHE\\Desktop\\개인프로젝트 자료\\images\\그림1.png"));
		getContentPane().setLayout(null);
		
		
		JButton btnNewButton_1 = new JButton("8시-8시30분"); // (가로위치, 세로위치(둘의꼭지점), 버튼의 가로길이, 버튼의 세로길이) // 한칸의 세로길이(30분단위) = 22
		btnNewButton_1.setBounds(76, 29, 381, 23);
		getContentPane().add(btnNewButton_1);
		initialize();
		
		
		JButton btnNewButton_1_2_1 = new JButton("9-930");
		btnNewButton_1_2_1.setBounds(76, 50, 381, 23);
		getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("9-930");
		btnNewButton_1_2_1_1.setBounds(76, 72, 381, 484);
		getContentPane().add(btnNewButton_1_2_1_1);

		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon(Test1.class.getResource("/calendar_part/images/ftable.png")));
		btnNewButton.setBounds(12, 10, 439, 621);
		getContentPane().add(btnNewButton);
		
		
		

		
		
		
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 645);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
}
