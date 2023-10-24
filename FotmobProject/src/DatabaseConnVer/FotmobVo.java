package DatabaseConnVer;

public class FotmobVo implements Comparable<FotmobVo> { 
	int leagueid;
	String name;
	String coach;
	String hometown;
	String bestplayer;
	int point;
	String previousrank;
	double mompoint;
	int play;

	public FotmobVo() {

	}

	public FotmobVo(String name, String coach, String hometown, String bestplayer, int point,
			String previousrank, double mompoint, int play, int leagueid) {
		super();
		this.name = name;
		this.coach = coach;
		this.hometown = hometown;
		this.bestplayer = bestplayer;
		this.point = point;
		this.previousrank = previousrank;
		this.mompoint = mompoint;
		this.play = play;
		this.leagueid = leagueid;
	}
	
	public FotmobVo(String name, String coach, String hometown, String bestplayer, int point,
			String previousrank, double mompoint, int play) {
		super();
		this.name = name;
		this.coach = coach;
		this.hometown = hometown;
		this.bestplayer = bestplayer;
		this.point = point;
		this.previousrank = previousrank;
		this.mompoint = mompoint;
		this.play = play;
	}


	public int getLeagueid() {
		return leagueid;
	}

	public void setLeagueid(int leagueid) {
		this.leagueid = leagueid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getBestplayer() {
		return bestplayer;
	}

	public void setBestplayer(String bestplayer) {
		this.bestplayer = bestplayer;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getPreviousrank() {
		return previousrank;
	}

	public void setPreviousrank(String previousrank) {
		this.previousrank = previousrank;
	}

	public double getMompoint() {
		return mompoint;
	}

	public void setMompoint(double mompoint) {
		this.mompoint = mompoint;
	}

	public int getPlay() {
		return play;
	}

	public void setPlay(int play) {
		this.play = play;
	}

	@Override
	public String toString() {
		return name + " [" + "played(경기수) : " + play + ", points(승점)=" + point + "]";
	}

	public String allContent() {
		return name + " [" + "played(경기수)=" + play + ", points=" + point + ", coach=" + coach + ", hometown=" + hometown
				+ ", bestplayer(평점)=" + bestplayer + "(" + mompoint + ")" + ", previousrank=" + previousrank + "]";
	}

	@Override
	public int compareTo(FotmobVo o) {
		return o.getPoint() - getPoint();

	}

}
