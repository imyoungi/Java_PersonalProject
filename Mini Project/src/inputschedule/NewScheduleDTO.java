package inputschedule;

public class NewScheduleDTO {
	private String sdate;
	private String ddate;
	private String title;
	private String location;
	private String memo;
	
	public String getsdate() {
		return sdate;
	}
	public void setsdate(String sdate) {
		this.sdate = sdate;
	}
	public String getddate() {
		return ddate;
	}
	public void setddate(String ddate) {
		this.ddate = ddate;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public String getlocation() {
		return location;
	}
	public void setlocation(String location) {
		this.location = location;
	}
	public String getmemo() {
		return memo;
	}
	public void setmemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "MemberDTO [sdate=" + sdate + ", ddate=" + ddate + ", title=" + title + ", location=" + location
				+ ", memo=" + memo + "]";
	}
	
	
	
	

}
