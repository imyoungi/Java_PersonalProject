package SimpleVer;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Simplefotmob {
	private static int menunum;
	private static int teamnum;
	static int count = 0;
	static HashMap<Integer, String> map = new HashMap<>();

	public static void main(String[] args) {
		Eplinfo epl = new Eplinfo();
		Laligainfo laliga = new Laligainfo();
		Bundesinfo bundes = new Bundesinfo();
		SerieAinfo serie = new SerieAinfo();
		Ligue1info ligue1 = new Ligue1info();

		System.out.println("- SIMPLE FOTMOB PROGRAM -" + "\r\n");

		while (true) {
			System.out.println("리그를 선택하세요[종료:0]" + "\r\n");
			epl.selectMenu();

			Scanner sc = new Scanner(System.in);
			menunum = sc.nextInt();
			if (menunum == 0) {
				System.out.println("종료합니다.");
				sc.close();
				break;
			}
			switch (menunum) {
			case 1:
				DetailInfo[] detail = new DetailInfo[20];
				System.out.println("객체배열 개수 :" + detail.length);
//				int play = epl.makeplay();

				for (int i = 0; i < detail.length; i++) {
					detail[i] = new DetailInfo(); // 객체배열 생성

				}

				for (int i = 0; i < detail.length; i++) {
					detail[i].name = Eplinfo.EplTeams[i];
					detail[i].coach = Eplinfo.EplCoach[i];
					detail[i].hometown = Eplinfo.EplHometown[i];
					detail[i].previousrank = Eplinfo.EplPreviousRank[i];
					detail[i].play = epl.makeplay();
					detail[i].point = epl.makescore(detail[i].play);
					detail[i].mompoint = epl.makeMomPoint();
					detail[i].bestplayer = Eplinfo.bestplayer[i];
				}

				int eplConut = 0;
				List<DetailInfo> ToSort = Arrays.asList(detail);
				Collections.sort(ToSort);

				for (DetailInfo i : ToSort) {
					eplConut++;
					System.out.println(eplConut + "위 " + i + " ");
				}
				System.out.println();

				for (int i = 0; i < detail.length; i++) {
					System.out.println(i + 1 + " : " + detail[i].name);
				}

				while (true) {
					System.out.println();
					System.out.println("팀을 선택하세요![종료:0 / 리그선택:77]");
					teamnum = sc.nextInt();

					if (teamnum > 0 && teamnum < 21) {
						System.out.print("selected " + detail[teamnum - 1].name + "\r\n");
						System.out.println(detail[teamnum - 1].allContent());
					} else if (teamnum == 0) {
						sc.close();
						return;
					} else if (teamnum == 77) {
						break;

					} else
						System.out.println("다시 입력하세요");
				}

				break;

			case 2:
				DetailInfo[] detail_laliga = new DetailInfo[20];
				System.out.println("객체배열 개수 :" + detail_laliga.length);
//				int play_laliga = epl.makeplay();

				for (int i = 0; i < detail_laliga.length; i++) {
					detail_laliga[i] = new DetailInfo(); // 객체배열 생성

				}

				for (int i = 0; i < detail_laliga.length; i++) {
					detail_laliga[i].name = laliga.Teams[i];
					detail_laliga[i].coach = laliga.Coach[i];
					detail_laliga[i].hometown = laliga.Hometown[i];
					detail_laliga[i].previousrank = laliga.PreviousRank[i];
					detail_laliga[i].play = epl.makeplay();
					detail_laliga[i].point = epl.makescore(detail_laliga[i].play);
					detail_laliga[i].mompoint = epl.makeMomPoint();
					detail_laliga[i].bestplayer = laliga.bestplayer[i];
//				System.out.println(detail[i].allContent());
				}

				int laligaCount = 0;
				List<DetailInfo> ToSort1 = Arrays.asList(detail_laliga);
				Collections.sort(ToSort1);

				for (DetailInfo i : ToSort1) {
					laligaCount++;
					System.out.println(laligaCount + "위 " + i + " ");
				}
				System.out.println();

				for (int i = 0; i < detail_laliga.length; i++) {
					System.out.println(i + 1 + " : " + detail_laliga[i].name);
				}

				while (true) {
					System.out.println();
					System.out.println("팀을 선택하세요![종료:0 / 리그선택:77]");
					teamnum = sc.nextInt();

					if (teamnum > 0 && teamnum < 21) {
						System.out.print("selected " + detail_laliga[teamnum - 1].name + "\r\n");
						System.out.println(detail_laliga[teamnum - 1].allContent());
					} else if (teamnum == 0) {
						sc.close();
						return;
					} else if (teamnum == 77) {
						break;

					} else
						System.out.println("다시 입력하세요");
				}

				break;

//			
			case 3:
				DetailInfo[] detail_bundes = new DetailInfo[18];
//				System.out.println(detail_bundes.length);
				for (int i = 0; i < detail_bundes.length; i++) {
					detail_bundes[i] = new DetailInfo(); // 객체배열 생성
				}
				for (int i = 0; i < detail_bundes.length; i++) {
					detail_bundes[i].name = bundes.Team[i];
					detail_bundes[i].coach = bundes.Coach[i];
					detail_bundes[i].hometown = bundes.Hometown[i];
					detail_bundes[i].previousrank = bundes.PreviousRank[i];
					detail_bundes[i].play = bundes.makeplay();
					detail_bundes[i].point = epl.makescore(detail_bundes[i].play);
					detail_bundes[i].mompoint = epl.makeMomPoint();
					detail_bundes[i].bestplayer = bundes.bestplayer[i];
				}
				int bundesCount = 0;
				List<DetailInfo> bundesSort = Arrays.asList(detail_bundes);
				Collections.sort(bundesSort);

				for (DetailInfo i : bundesSort) {
					bundesCount++;
					System.out.println(bundesCount + "위 " + i + " ");
				}
				System.out.println();

				for (int i = 0; i < detail_bundes.length; i++) {
					System.out.println(i + 1 + " : " + detail_bundes[i].name);
				}

				while (true) {
					System.out.println();
					System.out.println("팀을 선택하세요![종료:0 / 리그선택:77]");
					teamnum = sc.nextInt();

					if (teamnum > 0 && teamnum < 21) {
						System.out.print("selected " + detail_bundes[teamnum - 1].name + "\r\n");
						System.out.println(detail_bundes[teamnum - 1].allContent());
					} else if (teamnum == 0) {
						sc.close();
						return;
					} else if (teamnum == 77) {
						break;

					} else
						System.out.println("다시 입력하세요");
				}

				break;

//			
//			
			case 4:
				DetailInfo[] detail_serie = new DetailInfo[20];
				System.out.println(detail_serie.length);
				for (int i = 0; i < detail_serie.length; i++) {
					detail_serie[i] = new DetailInfo(); // 객체배열 생성
				}
				for (int i = 0; i < detail_serie.length; i++) {
					detail_serie[i].name = serie.Teams[i];
					detail_serie[i].coach = serie.Coach[i];
					detail_serie[i].hometown = serie.Hometown[i];
					detail_serie[i].previousrank = serie.PreviousRank[i];
					detail_serie[i].play = epl.makeplay();
					detail_serie[i].point = epl.makescore(detail_serie[i].play);
					detail_serie[i].mompoint = epl.makeMomPoint();
					detail_serie[i].bestplayer = serie.bestplayer[i];
				}
				int serieCount = 0;
				List<DetailInfo> SerieSort = Arrays.asList(detail_serie);
				Collections.sort(SerieSort);

				for (DetailInfo i : SerieSort) {
					serieCount++;
					System.out.println(serieCount + "위 " + i + " ");
				}
				System.out.println();
				for (int i = 0; i < detail_serie.length; i++) {
					System.out.println(i + 1 + " : " + detail_serie[i].name);
				}
				while (true) {
					System.out.println();
					System.out.println("팀을 선택하세요![종료:0 / 리그선택:77]");
					teamnum = sc.nextInt();

					if (teamnum > 0 && teamnum < 20) {
						System.out.print("selected " + detail_serie[teamnum - 1].name + "\r\n");
						System.out.println(detail_serie[teamnum - 1].allContent());
					} else if (teamnum == 0) {
						sc.close();
						return;
					} else if (teamnum == 77) {
						break;

					} else
						System.out.println("다시 입력하세요");
				}

				break;

//			
			case 5:
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
					detail_ligue1[i].play = epl.makeplay();
					detail_ligue1[i].point = epl.makescore(detail_ligue1[i].play);
					detail_ligue1[i].mompoint = epl.makeMomPoint();
					detail_ligue1[i].bestplayer = ligue1.bestplayer[i];
				}

				int ligue1Count = 0;
				List<DetailInfo> Ligue1Sort = Arrays.asList(detail_ligue1);
				Collections.sort(Ligue1Sort);

				for (DetailInfo i : Ligue1Sort) {
					ligue1Count++;
					System.out.println(ligue1Count + "위 " + i + " ");
				}
				System.out.println();
				for (int i = 0; i < detail_ligue1.length; i++) {
					System.out.println(i + 1 + " : " + detail_ligue1[i].name);
				}
				while (true) {
					System.out.println();
					System.out.println("팀을 선택하세요![종료:0 / 리그선택:77]");
					teamnum = sc.nextInt();

					if (teamnum > 0 && teamnum < 19) {
						System.out.print("selected " + detail_ligue1[teamnum - 1].name + "\r\n");
						System.out.println(detail_ligue1[teamnum - 1].allContent());
					} else if (teamnum == 0) {
						sc.close();
						return;
					} else if (teamnum == 77) {
						break;

					} else
						System.out.println("다시 입력하세요");
				}

				break;

			}
		}

	}
}
