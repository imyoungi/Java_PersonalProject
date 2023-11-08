package DatabaseConnVer;

public class CrawlingVo {
	int no;
	String teamName;
	int pl; // 경기
	int won;
	int draw; // 동점
	int loss;
	int gf;// 득점
	int ga;// 실점
	String gd;// 득실차
	int point;

	public CrawlingVo() {

	}
	
	public CrawlingVo(String teamName, int pl, int won, int draw, int loss, int gf, int ga, String gd,
			int point) {
		super();
		this.teamName = teamName;
		this.pl = pl;
		this.won = won;
		this.draw = draw;
		this.loss = loss;
		this.gf = gf;
		this.ga = ga;
		this.gd = gd;
		this.point = point;
	}

	

	public CrawlingVo(int no, String teamName, int pl, int won, int draw, int loss, int gf, int ga, String gd,
			int point) {
		super();
		this.no = no;
		this.teamName = teamName;
		this.pl = pl;
		this.won = won;
		this.draw = draw;
		this.loss = loss;
		this.gf = gf;
		this.ga = ga;
		this.gd = gd;
		this.point = point;
	}





	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
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



	@Override
	public String toString() {
		return teamName + " " + pl + "   " + won + "   " + loss + "   " + draw
				+ "   " + gf + "   " + ga + "   " + gd + "   " + point;
	}

}
