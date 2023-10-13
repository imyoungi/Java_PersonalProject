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
		Eplinfo pl = new Eplinfo();
		System.out.println("- SIMPLE FOTMOB PROGRAM -" + "\r\n");

		while (true) {
			System.out.println("리그를 선택하세요[종료:0]" + "\r\n");
			pl.selectMenu();

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
				int play = pl.epl_makeplay();

				for (int i = 0; i < detail.length; i++) {
					detail[i] = new DetailInfo(); // 객체배열 생성

				}

				for (int i = 0; i < detail.length; i++) {
					detail[i].name = Eplinfo.EplTeams[i];
					detail[i].coach = Eplinfo.EplCoach[i];
					detail[i].hometown = Eplinfo.EplHometown[i];
					detail[i].previousrank = Eplinfo.EplPreviousRank[i];
					detail[i].play = play;
					detail[i].point = pl.epl_makescore(play);
					detail[i].mompoint = pl.makeMomPoint();
					detail[i].bestplayer = Eplinfo.bestplayer[i];
//				System.out.println(detail[i].allContent());
				}

				int countRank = 0;
				List<DetailInfo> ToSort = Arrays.asList(detail);
				Collections.sort(ToSort);

				for (DetailInfo i : ToSort) {
					countRank++;
					System.out.println(countRank + "위 " + i + " ");
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
				HashMap<Integer, String> laliga = new HashMap<>();
				laliga.put(1, "레알 마드리드");//
				laliga.put(2, "지로나 FC");
				laliga.put(3, "FC 바르셀로나");//
				laliga.put(4, "클루브 아틀레티코 데 마드리드");//
				laliga.put(5, "아틀레틱 클루브");
				laliga.put(6, "카디스 CF");
				laliga.put(7, "레알 베티스 발롬피에");
				laliga.put(8, "레알 소시에다드");
				laliga.put(9, "CA 오사수나");
				laliga.put(10, "데포르티보 알라베스");
				laliga.put(11, "발렌시아 CF");
				laliga.put(12, "라요 바예카노");
				laliga.put(13, "RC 셀타 데 비고");
				laliga.put(14, "헤타페 CF");
				laliga.put(15, "비야레알 CF");
				laliga.put(16, "그라나다 CF");
				laliga.put(17, "RCD 마요르카");
				laliga.put(18, "UD 라스팔마스");
				laliga.put(19, "UD 알메리아");
				laliga.put(20, "세비야 FC");

//			laliga.forEach((key, value) -> {
//				System.out.println(key + " : " + value);
//			});

				System.out.println("팀을 선택하세요!");
				teamnum = sc.nextInt();

				if (teamnum > 22) {
					System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
					teamnum = sc.nextInt();
					System.out.print("selected " + laliga.get(teamnum));
				} else {
					System.out.print("selected " + laliga.get(teamnum));
					teamnum += 4;
					System.out.println(teamnum);
//					
				}
				break;

//			
			case 3:
				HashMap<Integer, String> bundes = new HashMap<>();
				bundes.put(1, "FC 바이에른 뮌헨");//
				bundes.put(2, "VfB 슈투트가르트");
				bundes.put(3, "RB 라이프치히");
				bundes.put(4, "FC 우니온 베를린");
				bundes.put(5, "TSG 1899 호펜하임");
				bundes.put(6, "VfL 볼프스부르크");
				bundes.put(7, "SC 프라이부르크");
				bundes.put(8, "보루시아 도르트문트");
				bundes.put(9, "아인트라흐트 프랑크푸르트");
				bundes.put(10, "SV 베르더 브레멘");
				bundes.put(11, "FC 아우크스부르크");
				bundes.put(12, "VfL 보훔");
				bundes.put(13, "FC 쾰른");
				bundes.put(14, "FC 하이덴하임");
				bundes.put(15, "보루시아 묀헨글라트바흐");
				bundes.put(16, "FSV 마인츠 05");//
				bundes.put(17, "다름슈타트");
//
//			bundes.forEach((key, value) -> {
//				System.out.println(key + " : " + value);
//			});
				System.out.println();
				System.out.println("팀을 선택하세요!");
				System.out.println();
				System.out.println("팀을 선택하세요!");
				teamnum = sc.nextInt();
				if (teamnum > 17) {
					System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
					teamnum = sc.nextInt();
					System.out.print("selected " + bundes.get(teamnum));
				} else {
					System.out.print("selected " + bundes.get(teamnum));
				}
				break;

//			
//			
			case 4:
				HashMap<Integer, String> serie = new HashMap<>();
				serie.put(1, "FC 인테르나치오날레 밀라노");
				serie.put(2, "AC 밀란");
				serie.put(3, "유벤투스 FC");
				serie.put(4, "US 레체");
				serie.put(5, "아탈란타 BC");
				serie.put(6, "SSC 나폴리");
				serie.put(7, "엘라스 베로나 FC");
				serie.put(8, "ACF 피오렌티나");
				serie.put(9, "볼로냐 FC 1909");
				serie.put(10, "프로시노네 칼초");
				serie.put(11, "토리노 FC");
				serie.put(12, "SS 라치오");
				serie.put(13, "US 사수올로 칼초");
				serie.put(14, "몬차");
				serie.put(15, "제노아 CFC");
				serie.put(16, "스포티바 살레르니타나");
				serie.put(17, "우디네세 칼초");
				serie.put(18, "AS 로마");
				serie.put(19, "칼리아리 칼초");
				serie.put(20, "엠폴리 FC");

//			serie.forEach((key, value) -> {
//				System.out.println(key + " : " + value);
//			});
				System.out.println();
				System.out.println("팀을 선택하세요!");
				teamnum = sc.nextInt();
				if (teamnum > 20) {
					System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
					teamnum = sc.nextInt();
					System.out.print("selected " + serie.get(teamnum));
				} else {
					System.out.print("selected " + serie.get(teamnum));
				}
				break;

//			
			case 5:
				HashMap<Integer, String> ligue1 = new HashMap<>();
				ligue1.put(1, "AS 모나코 FC");
				ligue1.put(2, "파리 생제르맹 FC");//
				ligue1.put(3, "올랭피크 드 마르세유");
				ligue1.put(4, "스타드 랭스");
				ligue1.put(5, "릴 OSC");
				ligue1.put(6, "스타드 브레스투아 29");
				ligue1.put(7, "스타드 렌 FC");
				ligue1.put(8, "OGC 니스");
				ligue1.put(9, "RC 스트라스부르 알자스");
				ligue1.put(10, "르아브르 AC");
				ligue1.put(11, "FC 로리앙");
				ligue1.put(12, "툴루즈 FC");
				ligue1.put(13, "FC 메스");
				ligue1.put(14, "몽펠리에 에로 SC");
				ligue1.put(15, "FC 낭트");
				ligue1.put(16, "클레르몽");
				ligue1.put(17, "RC 랑스");
				ligue1.put(18, "올랭피크 리옹");

//			ligue1.forEach((key, value) -> {
//				System.out.println(key + " : " + value);
//			});
				System.out.println();
				System.out.println("팀을 선택하세요!");
				teamnum = sc.nextInt();
				if (teamnum > 18) {
					System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
					teamnum = sc.nextInt();
					System.out.print("selected " + ligue1.get(teamnum));
				} else {
					System.out.print("selected " + ligue1.get(teamnum));
				}
				break;

			}
		}

//	}

//	public void setNum(int num) {
//		this.num = num;
//	}

	}
}
