package DatabaseConVer;

class time {
	private int hour;
	private int minute;
	private float second;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {

		if (hour < 0 || hour > 23)
			return;
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}

	public float getSecond() {
		return second;
	}

	public void setSecond(float second) {
		if (second < 0 || second > 59)
			return;
		this.second = second;
	}

}

public class timeTest {
	public static void main(String[] args) {

		time t = new time();
		t.setHour(25);
		t.setMinute(66);
		t.setSecond(23);
		System.out.println(t.getHour()+"시"+t.getMinute()+"분");

	}
}
