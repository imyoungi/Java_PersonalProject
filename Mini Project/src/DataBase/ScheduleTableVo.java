package DataBase;

public class ScheduleTableVo { // 테이블의 row 정보를 담는 클래스

//	private int id;
	private String sdate;
	private String ddate;
	private String title;
	private String location;
	private String memo;

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public String getDdate() {
		return ddate;
	}

	public void setDdate(String ddate) {
		this.ddate = ddate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

//	public int getid() {
//		return id;
//	}
//	public void setid(int id) {
//		this.id = id;
//	}
	
}
