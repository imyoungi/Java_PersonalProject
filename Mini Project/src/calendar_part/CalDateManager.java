package calendar_part;

import java.util.Calendar;

public class CalDateManager { // 달력구현
	static final int Cal_width = 7;
	final static int Cal_height = 6; // 7*6배열선언

	int CalDates[][] = new int[6][7];
	int CalYear;
	int CalMonth;
	int CalDayOfMon;

	final int CalLastDateOfMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// 월별 마지막일 지정
	int CalLastDate;
	Calendar today = Calendar.getInstance();
	Calendar cal;

	public CalDateManager() {
		setToday();
	}

	public void setToday() {// 당일 년도,월,일 얻기
		CalYear = today.get(Calendar.YEAR);
		CalMonth = today.get(Calendar.MONTH);
		CalDayOfMon = today.get(Calendar.DAY_OF_MONTH);
		makeCalData(today);

	}

	private void makeCalData(Calendar cal) { // 매월 1일의 위치(요일, 시작점)
		int Cal1st = (cal.get(Calendar.DAY_OF_WEEK) + 7 
				- (cal.get(Calendar.DAY_OF_MONTH)) % 7) % 7;
		if (CalMonth == 1) {
			CalLastDate = CalLastDateOfMonth[CalMonth] + leapCheck(CalYear);

		}else {
			CalLastDate = CalLastDateOfMonth[CalMonth];
			for(int i=0;i<Cal_height;i++) {
				for(int j=0;j<Cal_width;j++) {
					CalDates[i][j] = 0; //달력[][]배열 0으로 초기화
					
				}
				
			}
			
			
		}

	}

	private int leapCheck(int Year) { //윤년(4년에 1번)인지 체크하는 함수
		if(Year%4==0) {
			return 1;
		}else return 0;
	}

}
