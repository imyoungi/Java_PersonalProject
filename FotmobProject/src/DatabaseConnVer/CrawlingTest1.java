package DatabaseConnVer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrawlingTest1 {
	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		CrawlingDAO dao = new CrawlingDAO(jdbcTemplate);

		CrawlingData.main(args); // 데이터 크롤링

		List<CrawlingVo> resultTable = new ArrayList<>();
		CrawlingVo[] Craw = new CrawlingVo[20];
		System.out.println("객체배열 개수 :" + Craw.length);
//		System.out.println(CrawlingData.list);
		int rank = 1;
		
		for (int i = 0; i < Craw.length; i++) {
			Craw[i] = new CrawlingVo();
		} // 객체배열 생성

		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴_1) 조회   2) 업데이트 ");
		int menu = sc.nextInt();
		if (menu == 1) {
			System.out.println("순위 " + "Name " + " Play(경기수) " + " Won " + " Loss " + " Draw "
					+ " GF(득점) " + " GA(실점) " + " GD(득실차) " + " Point(승점)");
			resultTable = dao.selectTeam();
			
			for (CrawlingVo vo : resultTable) {
				System.out.println(rank++ + "위 " + vo);
			}

		} else
			for (int i = 0; i < 20; i++) {
				Craw[i].no = 1;
				Craw[i].teamName = CrawlingData.nameList.get(i);
				Craw[i].pl = CrawlingData.scoreList.get(i * 7);
				Craw[i].won = CrawlingData.scoreList.get(i * 7 + 1);
				Craw[i].loss = CrawlingData.scoreList.get(i * 7 + 2);
				Craw[i].draw = CrawlingData.scoreList.get(i * 7 + 3);
				Craw[i].gf = CrawlingData.scoreList.get(i * 7 + 4);
				Craw[i].ga = CrawlingData.scoreList.get(i * 7 + 5);
				Craw[i].gd = CrawlingData.nameList.get(i + 20);
				Craw[i].point = CrawlingData.scoreList.get(i * 7 + 6);
				System.out.println(Craw[i].teamName);

				int no = Craw[i].no;
				String teamName = Craw[i].teamName;
				int pl = Craw[i].pl;
				int won = Craw[i].won;
				int loss = Craw[i].loss;
				int draw = Craw[i].draw;
				int gf = Craw[i].gf;
				int ga = Craw[i].ga;
				String gd = Craw[i].gd;
				int point = Craw[i].point;

				dao.insertTeam(no, teamName, pl, won, draw, loss,gf, ga, gd, point);

				for (CrawlingVo vo : resultTable) {
					System.out.println(rank++ + "위 " + vo);
				}
			}
	}

}
