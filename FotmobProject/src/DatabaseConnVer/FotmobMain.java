package DatabaseConnVer;

import java.util.List;

import SimpleVer.DetailInfo;
import SimpleVer.Eplinfo;
import SimpleVer.Laligainfo;

public class FotmobMain {

	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		FotmobDAO dao = new FotmobDAO(jdbcTemplate);
		Eplinfo pl = new Eplinfo();
		Laligainfo laliga = new Laligainfo();

//		UFEASurveyService ss = new UFEASurveyService(dao);
//		

//		
		List<FotmobVo> data = dao.selectTeam();
		for (FotmobVo vo : data) {
			System.out.println(vo);
		}

		DetailInfo[] detail_laliga = new DetailInfo[20];
		System.out.println(detail_laliga.length);
		for (int i = 0; i < detail_laliga.length; i++) {
			detail_laliga[i] = new DetailInfo(); // 객체배열 생성
		}
		for (int i = 0; i < detail_laliga.length; i++) {
			detail_laliga[i].name = laliga.Teams[i];
			detail_laliga[i].coach = laliga.Coach[i];
			detail_laliga[i].hometown = laliga.Hometown[i];
			detail_laliga[i].previousrank = laliga.PreviousRank[i];
			detail_laliga[i].play = 9;
			detail_laliga[i].point = pl.epl_makescore(9);
			detail_laliga[i].mompoint = pl.makeMomPoint();
			detail_laliga[i].bestplayer = laliga.bestplayer[i];
			
			String name = detail_laliga[i].name;
			String coach = detail_laliga[i].coach;
			String hometown = detail_laliga[i].hometown;
			String bestplayer = detail_laliga[i].bestplayer;
			int point = detail_laliga[i].point;
			String previousrank = detail_laliga[i].previousrank;
			double mompoint = detail_laliga[i].mompoint;
			int play = 9;
			int leagueid = 2;

			dao.insertTeam(name, coach, hometown, bestplayer, 
					point, previousrank, mompoint, play, leagueid);
//			System.out.println(name);

			data = dao.selectTeam();
		}
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
