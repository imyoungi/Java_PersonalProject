package DatabaseConnVer;

public class CrawlingVo {
	String teamName;
	int pl; // 경기
	int won;
	int loss;
	int draw; // 동점
	int gf;// 득점
	int ga;// 실점
	String gd;// 득실차
	int point;

	public CrawlingVo(String teamName, int pl, int won, int loss, int draw, int gf, int ga, String gd, int point) {
		super();
		this.teamName = teamName;
		this.pl = pl;
		this.won = won;
		this.loss = loss;
		this.draw = draw;
		this.gf = gf;
		this.ga = ga;
		this.gd = gd;
		this.point = point;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getPl() {
		return pl;
	}

	public void setPl(int pl) {
		this.pl = pl;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}

	public int getLoss() {
		return loss;
	}

	public void setLoss(int loss) {
		this.loss = loss;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public int getGf() {
		return gf;
	}

	public void setGf(int gf) {
		this.gf = gf;
	}

	public int getGa() {
		return ga;
	}

	public void setGa(int ga) {
		this.ga = ga;
	}

	public String getGd() {
		return gd;
	}

	public void setGd(String gd) {
		this.gd = gd;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}
