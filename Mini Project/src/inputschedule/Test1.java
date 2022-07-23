package inputschedule;

import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Test1 extends JFrame implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextArea textArea_1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("New Schedule");
		frame.setBounds(100, 100, 710, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// LookAndFeel Windows 스타일 적용
			SwingUtilities.updateComponentTreeUI(frame);
		} catch (Exception e) {

		}

		JLabel lblNewLabel = new JLabel("제목(U) :");
		lblNewLabel.setBounds(12, 65, 57, 15);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(68, 92, 614, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		lblNewLabel_1 = new JLabel("위치(L) :");
		lblNewLabel_1.setBounds(12, 96, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(68, 62, 614, 21);
		frame.getContentPane().add(textField_1);

		lblNewLabel_2 = new JLabel("시작 시간(T) :");
		lblNewLabel_2.setBounds(12, 140, 78, 15);
		frame.getContentPane().add(lblNewLabel_2);

		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		String Startdate = model.getYear() + "/" + (model.getMonth() + 1) + "/" + model.getDay();
		lblNewLabel_2.setText(Startdate);

		frame.getContentPane().add(datePicker);
		datePicker.setBounds(102, 181, 266, 31);

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// LookAndFeel Windows 스타일 적용
			SwingUtilities.updateComponentTreeUI(datePanel);
		} catch (Exception e) {

		}

		lblNewLabel_3 = new JLabel("종료 시간(D) :");
		lblNewLabel_3.setBounds(12, 181, 78, 15);
		frame.getContentPane().add(lblNewLabel_3);

		UtilDateModel model1 = new UtilDateModel();
		JDatePanelImpl datePanel1 = new JDatePanelImpl(model1);
		JDatePickerImpl datePicker1 = new JDatePickerImpl(datePanel1);
		
		String endDate = model1.getYear() + "/" + (model1.getMonth() + 1) + "/" + model1.getDay();// Date값 저장
		lblNewLabel_3.setText(endDate);

		frame.getContentPane().add(datePicker1);
		datePicker1.setBounds(102, 140, 266, 31);

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// LookAndFeel Windows 스타일 적용
			SwingUtilities.updateComponentTreeUI(datePanel1);
		} catch (Exception e) {

		}

		JCheckBox chckbxNewCheckBox = new JCheckBox("하루종일(V)");
		chckbxNewCheckBox.setBounds(567, 136, 115, 23);
		frame.getContentPane().add(chckbxNewCheckBox);

		btnNewButton_1 = new JButton("저장");
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "일정을 저장하시겠습니까?");
				getViewData().gettitle();
				getViewData().getlocation();
				getViewData().getsdate();
				getViewData().getddate();
//				getViewData().getmemo();
//				System.out.println(getViewData().getsdate());
				
				NewScheduleDAO md = new NewScheduleDAO();
				md.insertMember(getViewData());
			}

		});

		btnNewButton_1.setBounds(12, 14, 57, 31);
		frame.getContentPane().add(btnNewButton_1);

		btnNewButton_2 = new JButton("삭제");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "일정을 삭제하시겠습니까?");
			}
		});
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		btnNewButton_2.setBounds(81, 14, 57, 31);
		frame.getContentPane().add(btnNewButton_2);

		btnNewButton_3 = new JButton("추가");
		btnNewButton_3.setBounds(154, 14, 57, 31);
		frame.getContentPane().add(btnNewButton_3);

		btnNewButton_4 = new JButton("공유");
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton_4.setBounds(223, 14, 57, 31);
		frame.getContentPane().add(btnNewButton_4);

		btnNewButton = new JButton("메모");
		btnNewButton.setBounds(292, 14, 57, 31);
		frame.getContentPane().add(btnNewButton);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField textField2 = new TextField();
				textField2.setText((String) comboBox_1.getSelectedItem());

			}
		});

		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] { "8:00", "8:30", "9:00", "9:30", "10:00",
				"10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30",
				"16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00",
				"21:30", "22:00", "22:30", "23:00", "23:30", "0:00" }));
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(373, 181, 98, 21);
		frame.getContentPane().add(comboBox_1);

		comboBox_2 = new JComboBox<String>();
		comboBox_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TextField textField3 = new TextField();
				textField3.setText((String) comboBox_2.getSelectedItem());

			}
		});

		comboBox_2.setModel(new DefaultComboBoxModel<String>(new String[] { "8:00", "8:30", "9:00", "9:30", "10:00",
				"10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30",
				"16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00",
				"21:30", "22:00", "22:30", "23:00", "23:30", "0:00" }));
		comboBox_2.setToolTipText("");
		comboBox_2.setBounds(373, 140, 98, 21);
		frame.getContentPane().add(comboBox_2);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(12, 241, 670, 290);
		frame.getContentPane().add(textArea_1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	private NewScheduleDTO getViewData() {
		NewScheduleDTO dto = new NewScheduleDTO();
		String title = textField.getText(); // 제목
		String location = textField_1.getText(); // 위치
		String Sdate = lblNewLabel_2.getText() +" "+ comboBox_2.getSelectedItem();
		String Ddate = lblNewLabel_3.getText() +" "+ comboBox_1.getSelectedItem();
//		String memo = textArea_1.getText();

		dto.settitle(title);
		dto.setlocation(location);
		dto.setsdate(Sdate);
		dto.setddate(Ddate);
//		dto.setmemo(memo);

		return dto;

	}
}
