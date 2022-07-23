package inputschedule;

import java.awt.EventQueue;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import buttonapplication.SwingNotePad;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class new_Schedule extends JFrame implements ActionListener {

	private JFrame frame;

	private JTextField Location;
	private JLabel LocationLabel;
	private JLabel TitleLabel;
	private JTextField Title;
	private JButton SaveBut;
	private JButton DelBut;
	private JButton AddBut;
	private JButton ShareBut;
	private JButton MemoBut;
	private JComboBox<String> EndTimeCB;
	private JComboBox<String> StartTimeCB;
	private JTextPane textPane;
	private JTextArea Memo;
	private JLabel StartBut;
	private JLabel StartBut_1;
	private String StartDate;
	private String EndDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new new_Schedule();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				

				try {
					new_Schedule window = new new_Schedule();
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
	public new_Schedule() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("New Schedule");
		frame.setIconImage(
				Toolkit.getDefaultToolkit().getImage(new_Schedule.class.getResource("/calendar_part/images/그림1.png")));
		frame.setBounds(100, 100, 710, 618);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// LookAndFeel Windows 스타일 적용
			SwingUtilities.updateComponentTreeUI(frame);
		} catch (Exception e) {

		}

		textPane = new JTextPane();
		textPane.setBounds(312, 118, -222, 21);
		frame.getContentPane().add(textPane);

		TitleLabel = new JLabel("제목(U) :");
		TitleLabel.setBounds(12, 65, 57, 15);
		frame.getContentPane().add(TitleLabel);

		Location = new JTextField();
		Location.setBounds(68, 92, 614, 21);
		frame.getContentPane().add(Location);
		Location.setColumns(10); // 제목

		LocationLabel = new JLabel("위치(L) :");
		LocationLabel.setBounds(12, 96, 57, 15);
		frame.getContentPane().add(LocationLabel);

		Title = new JTextField();
		Title.setColumns(10);
		Title.setBounds(68, 62, 614, 21);
		frame.getContentPane().add(Title);

		StartBut = new JLabel("시작일자 :");
		StartBut.setBounds(12, 140, 57, 15);
		frame.getContentPane().add(StartBut);

		UtilDateModel model1 = new UtilDateModel();
		JDatePanelImpl datePanel1 = new JDatePanelImpl(model1);
		JDatePickerImpl datePicker1 = new JDatePickerImpl(datePanel1);
		frame.getContentPane().add(datePicker1);

		frame.getContentPane().add(datePicker1);
		datePicker1.setBounds(78, 140, 266, 31);
//		StartDate = model1.getYear() + "/" + (model1.getMonth() + 1) + "/" + model1.getMonth();

		// model1.getYear() + "/" + (model1.getMonth() + 1) + "/" + model1.getDay();

		StartBut_1 = new JLabel("종료일자:");
		StartBut_1.setBounds(12, 181, 57, 15);
		frame.getContentPane().add(StartBut_1);

		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		frame.getContentPane().add(datePicker);
		datePicker.setBounds(78, 181, 266, 31);

//		EndDate = model.getYear() + "/" + (model.getMonth() + 1) + "/" + model.getDay();

		JCheckBox AlldayCheckBox = new JCheckBox("하루종일(V)");
		AlldayCheckBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		AlldayCheckBox.setBounds(468, 132, 115, 31);
		frame.getContentPane().add(AlldayCheckBox);

		SaveBut = new JButton("저장");
		SaveBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "일정을 저장하시겠습니까?");
				
				StartDate = model1.getYear()+"-"+(model1.getMonth()+1)+"-"+model1.getDay();
				EndDate = model.getYear()+"-"+(model.getMonth()+1)+"-"+model.getDay();
				
				getViewData().gettitle();
				getViewData().getlocation();
				getViewData().getsdate();
				getViewData().getddate();
				getViewData().getmemo();

				NewScheduleDAO md = new NewScheduleDAO();
				md.insertMember(getViewData());
				
				System.out.println(StartDate);
				System.out.println(EndDate);
			}

		});

		SaveBut.setBounds(12, 14, 57, 31);
		frame.getContentPane().add(SaveBut);

		DelBut = new JButton("삭제");
		DelBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "일정을 삭제하시겠습니까?");
			}
		});
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		DelBut.setBounds(81, 14, 57, 31);
		frame.getContentPane().add(DelBut);

		AddBut = new JButton("추가");
		AddBut.setBounds(154, 14, 57, 31);
		frame.getContentPane().add(AddBut);

		ShareBut = new JButton("공유");
		ShareBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new new_SendSchedule();
			}
		});
		ShareBut.setBounds(223, 14, 57, 31);
		frame.getContentPane().add(ShareBut);

		MemoBut = new JButton("메모");
		MemoBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SwingNotePad();
			}
		});
		MemoBut.setBounds(292, 14, 57, 31);
		frame.getContentPane().add(MemoBut);

		EndTimeCB = new JComboBox<String>();
		EndTimeCB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField textField2 = new TextField();
				textField2.setText((String) EndTimeCB.getSelectedItem());

			}
		});

		EndTimeCB.setModel(new DefaultComboBoxModel<String>(new String[] { "8:00", "8:30", "9:00", "9:30", "10:00",
				"10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30",
				"16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00",
				"21:30", "22:00", "22:30", "23:00", "23:30", "0:00" }));
		EndTimeCB.setToolTipText("");
		EndTimeCB.setBounds(349, 181, 98, 21);
		frame.getContentPane().add(EndTimeCB);

		StartTimeCB = new JComboBox<String>();
		StartTimeCB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TextField textField3 = new TextField();
				textField3.setText((String) StartTimeCB.getSelectedItem());

			}
		});

		StartTimeCB.setModel(new DefaultComboBoxModel<String>(new String[] { "8:00", "8:30", "9:00", "9:30", "10:00",
				"10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30",
				"16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00",
				"21:30", "22:00", "22:30", "23:00", "23:30", "0:00" }));
		StartTimeCB.setToolTipText("");
		StartTimeCB.setBounds(349, 140, 98, 21);
		frame.getContentPane().add(StartTimeCB);

		Memo = new JTextArea();
		Memo.setBounds(12, 222, 670, 347);
		frame.getContentPane().add(Memo);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	private NewScheduleDTO getViewData() {
		NewScheduleDTO dto = new NewScheduleDTO();
		String title = Title.getText(); // 제목
		String location = Location.getText(); // 위치
		String sdate = StartDate + " " + StartTimeCB.getSelectedItem();
		String ddate = EndDate + " " + EndTimeCB.getSelectedItem();
		String memo = Memo.getText();


		dto.settitle(title);
		dto.setlocation(location);
		dto.setsdate(sdate);
		dto.setddate(ddate);
		dto.setmemo(memo);
		

		return dto;

	}
}
