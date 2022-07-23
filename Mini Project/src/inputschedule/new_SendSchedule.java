package inputschedule;

import java.awt.EventQueue;
import java.awt.Font;
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
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import buttonapplication.SwingNotePad;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import inputschedule.new_Schedule;
import inputschedule.MailTest_;

public class new_SendSchedule extends JFrame implements ActionListener {

	private JFrame frmShareSchedule;
	private JButton SaveBtn;
	private JButton DelBtn;
	private JButton AddBtn;
	private JButton MemoBtn;
	private JButton SendBtn;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	private JLabel Tolabel;
	private JTextField receivertf;
	private JLabel Cclabel;
	private JTextField Cctf;
	private JLabel TitleLabel;
	private JLabel LocationLabel;
	private JLabel Sdate;
	private JLabel endDateLabel;
	private JLabel SdateLabel;
	private JLabel EdateLabel;
	private JTextArea Memo;
	private JTextField Titletf;
	private JTextField Locationtf;
	private String Startdate;
	private String Enddate;

	private String Mreceiver;
	private String Mmemo;
	private String Mtitle;
	private String Mlocation;
	private String Msdate;
	private String Mddate;
	private String MCc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new new_SendSchedule();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					new_SendSchedule window = new new_SendSchedule();
					window.frmShareSchedule.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public new_SendSchedule() {
		initialize();
	}

	public JTextField getTextField_1() {
		return receivertf;
	}

	public JTextField getTextField() {
		return receivertf;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmShareSchedule = new JFrame();
		frmShareSchedule.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(new_SendSchedule.class.getResource("/calendar_part/images/그림1.png")));
		frmShareSchedule.setTitle("Shared Schedule");
		frmShareSchedule.setBounds(100, 100, 745, 705);
		frmShareSchedule.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmShareSchedule.getContentPane().setLayout(null);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// LookAndFeel Windows 스타일 적용
			SwingUtilities.updateComponentTreeUI(frmShareSchedule);
		} catch (Exception e) {

		}

		JLabel senderLabel = new JLabel("보낸 사람 : ");
		senderLabel.setBounds(128, 74, 78, 15);
		frmShareSchedule.getContentPane().add(senderLabel);

		JLabel SenderadressLabel = new JLabel("wemit_helper@naver.com");
		SenderadressLabel.setFont(new Font("굴림", Font.PLAIN, 12));
		SenderadressLabel.setBounds(194, 71, 216, 21);
		frmShareSchedule.getContentPane().add(SenderadressLabel);

		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);

//		String Startdate = model.getYear() + "/" + (model.getMonth() + 1) + "/" + model.getDay();

		frmShareSchedule.getContentPane().add(datePicker);
		datePicker.setBounds(207, 271, 266, 31);

		endDateLabel = new JLabel("종료일자(D) :");
		datePicker.add(endDateLabel);
//				lblNewLabel_6.setText(endDate);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// LookAndFeel Windows 스타일 적용
			SwingUtilities.updateComponentTreeUI(datePanel);
		} catch (Exception e) {

		}

		UtilDateModel model1 = new UtilDateModel();
		JDatePanelImpl datePanel1 = new JDatePanelImpl(model1);
		JDatePickerImpl datePicker1 = new JDatePickerImpl(datePanel1);

//		String endDate = model1.getYear() + "/" + (model1.getMonth() + 1) + "/" + model1.getDay();
//		System.out.println(endDate);

		frmShareSchedule.getContentPane().add(datePicker1);
		datePicker1.setBounds(207, 230, 266, 31);

		Sdate = new JLabel("시작일자(T) :");
		datePicker1.add(Sdate);
//		Sdate.setText(Startdate);

		comboBox = new JComboBox<String>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (model.getDay() < model1.getDay()) {
					JOptionPane.showMessageDialog(null,"시작일자가 종료일자보다 클 수 없습니다!");

				}
				TextField textField2 = new TextField();
				textField2.setText((String) comboBox.getSelectedItem());
			}
		});
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] { "8:00", "8:30", "9:00", "9:30", "10:00",
				"10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30",
				"16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00",
				"21:30", "22:00", "22:30", "23:00", "23:30", "0:00" }));

		comboBox.setToolTipText("");
		comboBox.setBounds(480, 233, 98, 21);
		frmShareSchedule.getContentPane().add(comboBox);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// LookAndFeel Windows 스타일 적용
			SwingUtilities.updateComponentTreeUI(datePanel1);
		} catch (Exception e) {

		}
		comboBox_1 = new JComboBox<String>();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (model.getDay() > model1.getDay()) { // 종료시간 < 시작시작
					JOptionPane.showMessageDialog(null, "시작일자가 종료일자보다 클 수 없습니다!");

				}
				TextField textField2 = new TextField();
				textField2.setText((String) comboBox_1.getSelectedItem());
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] { "8:00", "8:30", "9:00", "9:30", "10:00",
				"10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30",
				"16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00",
				"21:30", "22:00", "22:30", "23:00", "23:30", "0:00" }));

		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(480, 273, 98, 21);
		frmShareSchedule.getContentPane().add(comboBox_1);

		JCheckBox chckbxNewCheckBox = new JCheckBox("하루종일(V)");
		chckbxNewCheckBox.setBounds(588, 229, 115, 23);
		frmShareSchedule.getContentPane().add(chckbxNewCheckBox);

		Memo = new JTextArea();
		Memo.setBounds(12, 312, 705, 344);
		frmShareSchedule.getContentPane().add(Memo);

		SaveBtn = new JButton("저장");
		SaveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "내용을 저장하시겠습니까?");
				Startdate = model1.getYear() + "-" + (model1.getMonth() + 1) + "-" + model1.getDay();
				Enddate = model.getYear() + "-" + (model.getMonth() + 1) + "-" + model.getDay();

				System.out.println(Startdate);
				System.out.println(Enddate);

				getViewData().gettitle();
				getViewData().getlocation();
				getViewData().getsdate();
				getViewData().getddate();

				NewScheduleDAO md = new NewScheduleDAO();
				md.insertMember(getViewData());
				
				Mreceiver = receivertf.getText();
				MCc = Cctf.getText();
				Mmemo = Memo.getText();
				Mtitle = Titletf.getText();
				Mlocation = Locationtf.getText();
				Msdate = Startdate + " " + comboBox.getSelectedItem();
				Mddate = Enddate + " " + comboBox_1.getSelectedItem();
				
				System.out.println(Mreceiver);
				System.out.println(Mmemo);

				
				
								
				
			}
		});
		SaveBtn.setBounds(12, 10, 60, 30);
		frmShareSchedule.getContentPane().add(SaveBtn);

		DelBtn = new JButton("삭제");
		DelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "일정을 삭제 하시겠습니까?");
			}
		});
		DelBtn.setBounds(84, 10, 60, 30);
		frmShareSchedule.getContentPane().add(DelBtn);

		AddBtn = new JButton("추가");
		AddBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new new_Schedule();

			}
		});
		AddBtn.setBounds(156, 10, 60, 30);
		frmShareSchedule.getContentPane().add(AddBtn);

		MemoBtn = new JButton("메모");
		MemoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingNotePad.main(null);

				

			}
		});
		MemoBtn.setBounds(228, 10, 60, 30);
		frmShareSchedule.getContentPane().add(MemoBtn);

		SendBtn = new JButton("보내기(S)");
		SendBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MailTest_();
			}
		});
		SendBtn.setBounds(12, 70, 97, 67);
		frmShareSchedule.getContentPane().add(SendBtn);

		Tolabel = new JLabel("받는 사람 : ");
		Tolabel.setBounds(128, 102, 78, 15);
		frmShareSchedule.getContentPane().add(Tolabel);

		receivertf = new JTextField();
		receivertf.setFont(new Font("Artifakt Element", Font.PLAIN, 13));
		receivertf.setColumns(10);
		receivertf.setBounds(194, 99, 488, 21);
		frmShareSchedule.getContentPane().add(receivertf);

		Cclabel = new JLabel("참조(CC): ");
		Cclabel.setBounds(128, 134, 78, 15);
		frmShareSchedule.getContentPane().add(Cclabel);

		Cctf = new JTextField();
		Cctf.setFont(new Font("Artifakt Element", Font.PLAIN, 13));
		Cctf.setColumns(10);
		Cctf.setBounds(194, 131, 488, 21);
		frmShareSchedule.getContentPane().add(Cctf);

		TitleLabel = new JLabel("제목(U) : ");
		TitleLabel.setBounds(128, 162, 78, 22);
		frmShareSchedule.getContentPane().add(TitleLabel);

		Titletf = new JTextField();
		Titletf.setColumns(10);
		Titletf.setBounds(194, 162, 488, 21);
		frmShareSchedule.getContentPane().add(Titletf);

		LocationLabel = new JLabel("위치(L) :");
		LocationLabel.setBounds(128, 197, 78, 22);
		frmShareSchedule.getContentPane().add(LocationLabel);

		Locationtf = new JTextField();
		Locationtf.setColumns(10);
		Locationtf.setBounds(194, 194, 488, 21);
		frmShareSchedule.getContentPane().add(Locationtf);

		SdateLabel = new JLabel("시작일자(T) :");
		SdateLabel.setBounds(128, 238, 78, 15);
		frmShareSchedule.getContentPane().add(SdateLabel);

		EdateLabel = new JLabel("종료일자(D) :");
		EdateLabel.setBounds(128, 279, 78, 15);
		frmShareSchedule.getContentPane().add(EdateLabel);

	}

	public void MailTest_() {
		// TODO Auto-generated method stub
		
	}

	public JTextField getTitletf() {
		return Titletf;
	}

	public void setTitletf(JTextField titletf) {
		Titletf = titletf;
	}

	public String getMreceiver() {
		return Mreceiver;
	}

	public void setMreceiver(String mreceiver) {
		Mreceiver = mreceiver;
	}

	public String getMmemo() {
		return Mmemo;
	}

	public void setMmemo(String mmemo) {
		Mmemo = mmemo;
	}

	public String getMtitle() {
		return Mtitle;
	}

	public void setMtitle(String mtitle) {
		Mtitle = mtitle;
	}

	public String getMlocation() {
		return Mlocation;
	}

	public void setMlocation(String mlocation) {
		Mlocation = mlocation;
	}

	public String getMsdate() {
		return Msdate;
	}

	public void setMsdate(String msdate) {
		Msdate = msdate;
	}

	public String getMddate() {
		return Mddate;
	}

	public void setMddate(String mddate) {
		Mddate = mddate;
	}
	
	

	public String getMCc() {
		return MCc;
	}

	public void setMCc(String mCc) {
		MCc = mCc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	private NewScheduleDTO getViewData() {
		NewScheduleDTO dto = new NewScheduleDTO();
		String title = Titletf.getText(); // 제목
		String location = Locationtf.getText(); // 위치
		String Sdate = Startdate + " " + comboBox.getSelectedItem();
		String Ddate = Enddate + " " + comboBox_1.getSelectedItem();
		String memo = Memo.getText();

		dto.settitle(title);
		dto.setlocation(location);
		dto.setsdate(Sdate);
		dto.setddate(Ddate);
		dto.setmemo(memo);

		return dto;

	}
}
