package DatabaseConnVer;

import java.util.List;

import SimpleVer.Bundesinfo;
import SimpleVer.DetailInfo;
import SimpleVer.Eplinfo;
import SimpleVer.Laligainfo;
import SimpleVer.Ligue1info;
import SimpleVer.SerieAinfo;

public class FotmobMain {

	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		FotmobDAO dao = new FotmobDAO(jdbcTemplate);
		Eplinfo epl = new Eplinfo();
		Laligainfo laliga = new Laligainfo();
		Bundesinfo bundes = new Bundesinfo();
		SerieAinfo serie = new SerieAinfo();
		Ligue1info ligue1 = new Ligue1info();

//		UFEASurveyService ss = new UFEASurveyService(dao);
//		

//		
		List<FotmobVo> data = dao.selectTeam();
		for (FotmobVo vo : data) {
			System.out.println(vo);
		}

		DetailInfo[] detail_ligue1 = new DetailInfo[18];
		System.out.println(detail_ligue1.length);
		for (int i = 0; i < detail_ligue1.length; i++) {
			detail_ligue1[i] = new DetailInfo(); // 객체배열 생성
		}
		for (int i = 0; i < detail_ligue1.length; i++) {
			detail_ligue1[i].name = ligue1.Teams[i];
			detail_ligue1[i].coach = ligue1.Coach[i];
			detail_ligue1[i].hometown = ligue1.Hometown[i];
			detail_ligue1[i].previousrank = ligue1.PreviousRank[i];
			detail_ligue1[i].play = 9;
			detail_ligue1[i].point = epl.makescore(9);
			detail_ligue1[i].mompoint = epl.makeMomPoint();
			detail_ligue1[i].bestplayer = ligue1.bestplayer[i];

			String name = detail_ligue1[i].name;
			String coach = detail_ligue1[i].coach;
			String hometown = detail_ligue1[i].hometown;
			String bestplayer = detail_ligue1[i].bestplayer;
			int point = detail_ligue1[i].point;
			String previousrank = detail_ligue1[i].previousrank;
			double mompoint = detail_ligue1[i].mompoint;
			int play = 9;
			int leagueid = 5;

			dao.insertTeam(name, coach, hometown, bestplayer, point, previousrank, mompoint, play, leagueid);

			data = dao.selectTeam();

		}
		System.out.println("insert완료");
//		int i = 1;
//		for (FotmobVo vo : data) {
//			System.out.println(i++ + "위" + vo);
//		}

//		ss.vote(1);
//		ss.vote(1);
//		ss.vote(19);
//		ss.vote(8);
//		ss.vote(2);
//		
//		list = ss.ListAll(); // dao가 아닌 service사용 

	}

}
