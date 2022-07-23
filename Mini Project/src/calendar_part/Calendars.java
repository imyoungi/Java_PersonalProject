package calendar_part;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import DataBase.ScheduleTableDAOimple;
import DataBase.ScheduleTableVo;
import inputschedule.new_Schedule;

public class Calendars extends CalendarDataManager {
	// CalendarDataManager의 GUI + 메모기능 + 시계
	// 창 구성요소와 배치도
	JFrame mainFrame;
	ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("./images/그림1.png")));
	JPanel calOpPanel;
	JButton todayBut;
	JLabel todayLab;
	JButton lYearBut;
	JButton lMonBut;
	JLabel curMMYYYYLab;
	JButton nMonBut;
	JButton nYearBut;
	JPanel myPanel;
	JButton b1;
	JButton b2;
	JButton bnt;
	JButton bnt1;
	JButton bnt2;
	ListenForCalOpButtons lForCalOpButtons = new ListenForCalOpButtons();

	JPanel calPanel;
	JButton weekDaysName[];
	JButton dateButs[][] = new JButton[6][7];
	listenForDateButs lForDateButs = new listenForDateButs();

	JPanel infoPanel;
	JLabel infoClock;
	JButton plusBut;

	JPanel timetablePanel;
	JPanel timeButtonPanel;

	JLabel selectedDate;
	JTextArea memoArea;
	JScrollPane memoAreaSP;
	JPanel memoSubPanel;
	JButton saveBut;
	JButton delBut;
	JButton clearBut;
	JPanel ButtonPanel;
	Image img;

	JPanel frameBottomPanel;
	JLabel bottomInfo = new JLabel("© 2022. WeMit Co. all rights reserved.");
	// 상수, 메세지
	final String WEEK_DAY_NAME[] = { "SUN", "MON", "TUE", "WED", "THR", "FRI", "SAT" };
	final String title = "wem!t Meeting Scheduler";
//	final String SaveButMsg1 = "를 MemoData폴더에 저장하였습니다.";
//	final String SaveButMsg2 = "메모를 먼저 작성해 주세요.";
//	final String SaveButMsg3 = "<html><font color=red>ERROR : 파일 쓰기 실패</html>";
//	final String DelButMsg1 = "메모를 삭제하였습니다.";
//	final String DelButMsg2 = "작성되지 않았거나 이미 삭제된 memo입니다.";
//	final String DelButMsg3 = "<html><font color=red>ERROR : 파일 삭제 실패</html>";
//	final String ClrButMsg1 = "입력된 메모를 비웠습니다.";

	private ArrayList<ScheduleTableVo> values;
	private ScheduleTableDAOimple dao;
	private ScheduleTableVo vo;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Calendars();

			}
		});
	}

	public Calendars() { // 구성요소 순으로 정렬되어 있음. 각 판넬 사이에 빈줄로 구별
		dao = new ScheduleTableDAOimple();
		vo = new ScheduleTableVo();
		values = dao.List();

//		for (int i = 0; i < values.size(); i++) {
//
//			System.out.println(values.get(i).getSdate());
//		}

//		for (ScheduleTableVo vo : values) {
//			System.out.println(vo.getSdate());
//		}
//		values.get(0);
//		System.out.println(values.get(0));
//		System.out.println(values.));

		mainFrame = new JFrame("We Meet HERE, wem!t ");

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(1220, 900);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(false);
		mainFrame.setIconImage(icon.getImage());
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// LookAndFeel Windows 스타일 적용
			SwingUtilities.updateComponentTreeUI(mainFrame);
		} catch (Exception e) {
			bottomInfo.setText("ERROR : LookAndFeel setting failed");
		}

		calOpPanel = new JPanel();
		todayBut = new JButton("Today");
		todayBut.setToolTipText("Today");
		todayBut.addActionListener(lForCalOpButtons);
		todayLab = new JLabel(today.get(Calendar.MONTH) + 1 + "/" + today.get(Calendar.DAY_OF_MONTH) + "/"
				+ today.get(Calendar.YEAR));
		lYearBut = new JButton("<<");
		lYearBut.setToolTipText("Previous Year");
		lYearBut.addActionListener(lForCalOpButtons);
		lMonBut = new JButton("<");
		lMonBut.setToolTipText("Previous Month");
		lMonBut.addActionListener(lForCalOpButtons);
		curMMYYYYLab = new JLabel("<html><table width=100><tr><th><font size=5>" + ((calMonth + 1) < 10 ? "&nbsp;" : "")
				+ (calMonth + 1) + " / " + calYear + "</th></tr></table></html>");
		nMonBut = new JButton(">");
		nMonBut.setToolTipText("Next Month");
		nMonBut.addActionListener(lForCalOpButtons);
		nYearBut = new JButton(">>");
		nYearBut.setToolTipText("Next Year");
		nYearBut.addActionListener(lForCalOpButtons);
		calOpPanel.setLayout(new GridBagLayout());
		GridBagConstraints calOpGC = new GridBagConstraints();
		calOpGC.gridx = 1; // 상단 버튼들 크기 및 위치
		calOpGC.gridy = 1;
		calOpGC.gridwidth = 2;
		calOpGC.gridheight = 1;
		calOpGC.weightx = 1;
		calOpGC.weighty = 1;
		calOpGC.insets = new Insets(5, 5, 0, 0);
		calOpGC.anchor = GridBagConstraints.WEST;
		calOpGC.fill = GridBagConstraints.NONE;
		calOpPanel.add(todayBut, calOpGC);
		calOpGC.gridwidth = 3;
		calOpGC.gridx = 2;
		calOpGC.gridy = 1;
		calOpPanel.add(todayLab, calOpGC);
		calOpGC.anchor = GridBagConstraints.CENTER;
		calOpGC.gridwidth = 1;
		calOpGC.gridx = 1;
		calOpGC.gridy = 2;
		calOpPanel.add(lYearBut, calOpGC);
		calOpGC.gridwidth = 1;
		calOpGC.gridx = 2;
		calOpGC.gridy = 2;
		calOpPanel.add(lMonBut, calOpGC);
		calOpGC.gridwidth = 2;
		calOpGC.gridx = 3;
		calOpGC.gridy = 2;
		calOpPanel.add(curMMYYYYLab, calOpGC);
		calOpGC.gridwidth = 1;
		calOpGC.gridx = 5;
		calOpGC.gridy = 2;
		calOpPanel.add(nMonBut, calOpGC);
		calOpGC.gridwidth = 1;
		calOpGC.gridx = 6;
		calOpGC.gridy = 2;
		calOpPanel.add(nYearBut, calOpGC);

		calPanel = new JPanel();
		weekDaysName = new JButton[7];
		for (int i = 0; i < CAL_WIDTH; i++) {
			weekDaysName[i] = new JButton(WEEK_DAY_NAME[i]);
			weekDaysName[i].setBorderPainted(false);
			weekDaysName[i].setContentAreaFilled(false);
			weekDaysName[i].setForeground(Color.WHITE);
			if (i == 0)
				weekDaysName[i].setBackground(new Color(250, 100, 100));
			else if (i == 6)
				weekDaysName[i].setBackground(new Color(100, 150, 250));
			else
				weekDaysName[i].setBackground(new Color(200, 200, 200));
			weekDaysName[i].setOpaque(true);
			weekDaysName[i].setFocusPainted(false);
			calPanel.add(weekDaysName[i]);
		}
		for (int i = 0; i < CAL_HEIGHT; i++) {
			for (int j = 0; j < CAL_WIDTH; j++) {
				dateButs[i][j] = new JButton();
				dateButs[i][j].setBorderPainted(false); // 버튼 테두리 설정
				dateButs[i][j].setContentAreaFilled(false); // 버튼영역 배경 표시 설정
				dateButs[i][j].setBackground(Color.WHITE);
				dateButs[i][j].setOpaque(true); // 위에 배경색 설정을 위해 true
				dateButs[i][j].addActionListener(lForDateButs);
				calPanel.add(dateButs[i][j]);

				dateButs[i][j].addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						JButton dateButton = (JButton) e.getSource();

//						if (dateButs.equals(e.getSource())) {
//							timetablePanel.add(timetablePanel, new ImageIcon("./images/ftable.png"));
//							timetablePanel.setBounds(705, 40, 600, 500);
//							timetablePanel.setLayout(null);

					}
				});

			}
		}
		calPanel.setLayout(new GridLayout(0, 7, 2, 2));
		calPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		showCal(); // 달력을 표시

		infoPanel = new JPanel();
		infoPanel.setLayout(new BorderLayout());

		infoClock = new JLabel("Time", SwingConstants.RIGHT);
		infoClock.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		infoPanel.add(infoClock, BorderLayout.NORTH);
		selectedDate = new JLabel(" ", SwingConstants.LEFT);
//		dateButs.getClass();
//				("<Html><font size=5>" + (today.get(Calendar.MONTH) + 1) + "/"
//				+ today.get(Calendar.DAY_OF_MONTH) + "/" + today.get(Calendar.YEAR) + "&nbsp;(Today)</html>",
//				SwingConstants.RIGHT);

		selectedDate.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
		plusBut = new JButton("새 일정 추가");
		plusBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.dispose();
				new new_Schedule();
			}
		});

		plusBut.setToolTipText("add schedule");
		infoPanel.add(plusBut);
		plusBut.setPreferredSize(new Dimension(3, 2));
		infoPanel.add(plusBut);

		Image background = new ImageIcon(Calendars.class.getResource("./images/TimeTable_pink.png")).getImage();
		img = background.getScaledInstance(500, 645, Image.SCALE_DEFAULT);

//		ButtonPanel.add(b1);
//		b1.setSize(100, 30);
		timetablePanel = new JPanel() {
			public void paint(Graphics g) {// 그리는 함수
				g.drawImage(img, 0, 0, null);// background를 그려줌
			}
		};
		timetablePanel.setLayout(null);
		timetablePanel.setSize(700, 645);

		myPanel = new JPanel(null);
//		b1 = new JButton("hello");
//		bnt = new JButton();
//		bnt1 = new JButton();
//		bnt2 = new JButton();
//		b1.setBounds(93, 140, 410, 21);
//		bnt.setBounds(93, 161, 410, 21);
//		bnt1.setBounds(93, 182, 410, 21);
//		bnt2.setBounds(93, 203, 410, 21);
//		
//		for (int i = 0; i < values.size(); i++) {
//			b1.setText(values.get(i).getSdate());
//			bnt.setText(values.get(i).getSdate());
//			bnt1.setText(values.get(i).getSdate());
//			bnt2.setText(values.get(i).getSdate());
//		}
		
	
			
			
			
		
		
		String[] time = { "8:00", "8:30", "9:00", "9:30", "10:00",
			"10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30",
			"16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00",
			"21:30", "22:00", "22:30", "23:00", "23:30", "0:00" };
		
		
		for (ScheduleTableVo vo : values) { //(자료형변수명, 배열명)
			int y1 = 0, y2 = 0;
			String sdate = vo.getSdate().substring(11, 16); //시작시간
			String ddate = vo.getDdate().substring(11, 16);// 종료시간
//			String Sdate = vo.getDdate().substring(0, 10); //시작일자
//			String Ddate = vo.getDdate().substring(0, 10); // 종료일자
//			
			
			
			JButton btn = new JButton(vo.getTitle());
			
			for(y1 = 0; y1 < time.length; y1++) 
				if(time[y1].equals(sdate)) 
					break;

			for(y2 = 0; y2 < time.length; y2++) 
				if(time[y2].equals(ddate)) 
					break;
				
			btn.setBounds(93, -56 + (21*y1), 410, 21 * (y2));
			
			myPanel.add(btn);
		}
		
		System.out.println(values.get(0).getSdate().substring(11, 16));
//		System.out.println(values.get(0).getSdate().substring(0,10));
//		values.get(0).getSdate().substring(12, 16);

		// not setBounds, not setSize, not setLayout
//		b1.setBounds(50, 50, 100, 100);
//		myPanel.setSize(new Dimension(1000, 1000));
//		myPanel.setBounds(50, 50, 500, 500);
		myPanel.setSize(700, 645);
//		myPanel.setBackground(new Color(255, 0, 0));
//		myPanel.add(b1);
//		myPanel.add(bnt);
//		myPanel.add(bnt1);
//		myPanel.add(bnt2);
		timetablePanel.add(myPanel);
		Map<String, Integer> map = new HashMap<String,Integer>(){{//초기값 지정
			  put("8:00", 1);
			  put("바나나", 2);
			  put("포도", 3);
			  put("사과", 4);
			  put("복숭아", 5);
			}};
			// 중복된 Key가 put되면 나중에 put된 value로 바뀐다.

			System.out.println("map = " + map);
			System.out.println("map.entrySet() = " + map.entrySet());
			System.out.println("map.keySet() = " + map.keySet());
			System.out.println("map.values() = " + map.values());
			
		

//		timetablePanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 620));
//		timetablePanel.add(selectedDate);

//		timetablePanel.add(btn);

//		timeButtonPanel = new JPanel();
//		timeButtonPanel.setLayout(null);
//		timetablePanel.add(timeButtonPanel);
//		timeButtonPanel.setBounds(400, 10 ,10,10);
//		b2 = new JButton();
//		b2.setBounds(730, 190, 50, 50);
//		
//		ButtonPanel = new JPanel();
//		ButtonPanel.setLayout(null);
//		ButtonPanel.setLocation(720, 180);
//		ButtonPanel.setSize(300, 450);
//		myPanel.add(ButtonPanel);

		b1 = new JButton("hello");
		timetablePanel.add(b1);

		// calOpPanel, calPanel을 frameSubPanelWest에 배치
		JPanel frameSubPanelWest = new JPanel();
		Dimension calOpPanelSize = calOpPanel.getPreferredSize();
		calOpPanelSize.height = 90;
		calOpPanel.setPreferredSize(calOpPanelSize);
		frameSubPanelWest.setLayout(new BorderLayout());
		frameSubPanelWest.add(calOpPanel, BorderLayout.NORTH);
		frameSubPanelWest.add(calPanel, BorderLayout.CENTER);

		// infoPanel, memoPanel을 frameSubPanelEast에 배치
		JPanel frameSubPanelEast = new JPanel();
		Dimension infoPanelSize = infoPanel.getPreferredSize();
		infoPanelSize.height = 65;
		infoPanel.setPreferredSize(infoPanelSize);
		frameSubPanelEast.setLayout(new BorderLayout());
		frameSubPanelEast.add(infoPanel, BorderLayout.NORTH);
		frameSubPanelEast.add(timetablePanel, BorderLayout.CENTER);

		Dimension frameSubPanelWestSize = frameSubPanelWest.getPreferredSize();
		frameSubPanelWestSize.width = 685;
		frameSubPanelWest.setPreferredSize(frameSubPanelWestSize);

		// 뒤늦게 추가된 bottom Panel..
		frameBottomPanel = new JPanel();
		frameBottomPanel.add(bottomInfo);

		// frame에 전부 배치
		mainFrame.setLayout(new BorderLayout());
		mainFrame.add(frameSubPanelWest, BorderLayout.WEST);
		mainFrame.add(frameSubPanelEast, BorderLayout.CENTER);
		mainFrame.add(frameBottomPanel, BorderLayout.SOUTH);
		mainFrame.setVisible(true);

		focusToday(); // 현재 날짜에 focus를 줌 (mainFrame.setVisible(true) 이후에 배치해야함)

		// Thread 작동(시계, bottomMsg 일정시간후 삭제)
		ThreadConrol threadCnl = new ThreadConrol();
		threadCnl.start();

	}

	private void focusToday() {
		if (today.get(Calendar.DAY_OF_WEEK) == 1)
			dateButs[today.get(Calendar.WEEK_OF_MONTH)][today.get(Calendar.DAY_OF_WEEK) - 1].requestFocusInWindow();
		else
			dateButs[today.get(Calendar.WEEK_OF_MONTH) - 1][today.get(Calendar.DAY_OF_WEEK) - 1].requestFocusInWindow();
	}

	private void showCal() {
		for (int i = 0; i < CAL_HEIGHT; i++) {
			for (int j = 0; j < CAL_WIDTH; j++) {
				String fontColor = "black";
				if (j == 0)
					fontColor = "red";
				else if (j == 6)
					fontColor = "blue";

				File f = new File("MemoData/" + calYear + ((calMonth + 1) < 10 ? "0" : "") + (calMonth + 1)
						+ (calDates[i][j] < 10 ? "0" : "") + calDates[i][j] + ".txt");
				if (f.exists()) {
					dateButs[i][j]
							.setText("<html><b><font color=" + fontColor + ">" + calDates[i][j] + "</font></b></html>");
				} else
					dateButs[i][j].setText("<html><font color=" + fontColor + ">" + calDates[i][j] + "</font></html>");

				JLabel todayMark = new JLabel("<html><font color=red>*</html>");
				dateButs[i][j].removeAll();
				if (calMonth == today.get(Calendar.MONTH) && calYear == today.get(Calendar.YEAR)
						&& calDates[i][j] == today.get(Calendar.DAY_OF_MONTH)) {
					dateButs[i][j].add(todayMark);
					dateButs[i][j].setToolTipText("");
				}

				if (calDates[i][j] == 0)
					dateButs[i][j].setVisible(false);
				else
					dateButs[i][j].setVisible(true);
			}
		}
	}

	private class ListenForCalOpButtons implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == todayBut) {
				setToday();
				lForDateButs.actionPerformed(e);
				focusToday();
			} else if (e.getSource() == lYearBut)
				moveMonth(-12);
			else if (e.getSource() == lMonBut)
				moveMonth(-1);
			else if (e.getSource() == nMonBut)
				moveMonth(1);
			else if (e.getSource() == nYearBut)
				moveMonth(12);

			curMMYYYYLab.setText("<html><table width=100><tr><th><font size=5>" + ((calMonth + 1) < 10 ? "&nbsp;" : "")
					+ (calMonth + 1) + " / " + calYear + "</th></tr></table></html>");
			showCal();
		}
	}

	private class listenForDateButs implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int k = 0, l = 0;
			for (int i = 0; i < CAL_HEIGHT; i++) {
				for (int j = 0; j < CAL_WIDTH; j++) {
					if (e.getSource() == dateButs[i][j]) {
						k = i;
						l = j;
					}
				}
			}

			if (!(k == 0 && l == 0))
				calDayOfMon = calDates[k][l]; // today버튼을 눌렀을때도 이 actionPerformed함수가 실행되기 때문에 넣은 부분

			cal = new GregorianCalendar(calYear, calMonth, calDayOfMon);

//			String dDayString = new String();
			int dDay = ((int) ((cal.getTimeInMillis() - today.getTimeInMillis()) / 1000 / 60 / 60 / 24));
			if (dDay == 0 && (cal.get(Calendar.YEAR) == today.get(Calendar.YEAR))
					&& (cal.get(Calendar.MONTH) == today.get(Calendar.MONTH))
					&& (cal.get(Calendar.DAY_OF_MONTH) == today.get(Calendar.DAY_OF_MONTH)))
				;
//				dDayString = "스케쥴";
//			else if (dDay >= 0)
//				dDayString = "D-" + (dDay + 1);
//			else if (dDay < 0)
//				dDayString = "D+" + (dDay) * (-1);

//				selectedDate.setText("<Html><font size=3>" + calYear + "년" + (calMonth + 1) + "월" + calDayOfMon + "일"
//						+ "&nbsp;" + "</html>");

		}
	}

	private class ThreadConrol extends Thread {
		public void run() {
			boolean msgCntFlag = false;
			int num = 0;
			String curStr = new String();
			while (true) {
				try {
					today = Calendar.getInstance();
					String amPm = (today.get(Calendar.AM_PM) == 0 ? "AM" : "PM");
					String hour;
					if (today.get(Calendar.HOUR) == 0)
						hour = "12";
					else if (today.get(Calendar.HOUR) == 12)
						hour = " 0";
					else
						hour = (today.get(Calendar.HOUR) < 10 ? " " : "") + today.get(Calendar.HOUR);
					String min = (today.get(Calendar.MINUTE) < 10 ? "0" : "") + today.get(Calendar.MINUTE);
					String sec = (today.get(Calendar.SECOND) < 10 ? "0" : "") + today.get(Calendar.SECOND);
					infoClock.setText(amPm + " " + hour + ":" + min + ":" + sec);

					sleep(1000);
					String infoStr = bottomInfo.getText();

					if (infoStr != " " && (msgCntFlag == false || curStr != infoStr)) {
						num = 5;
						msgCntFlag = true;
						curStr = infoStr;
					} else if (infoStr != " " && msgCntFlag == true) {
						if (num > 0)
							num--;
						else {
							msgCntFlag = false;
							bottomInfo.setText(" ");
						}
					}
				} catch (InterruptedException e) {
					System.out.println("Thread:Error");
				}
			}
		}
	}

}
