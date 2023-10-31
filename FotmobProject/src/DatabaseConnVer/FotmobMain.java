package DatabaseConnVer;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import SimpleVer.Eplinfo;

public class FotmobMain {

	static int rank = 0;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		FotmobDAO dao = new FotmobDAO(jdbcTemplate);
		Eplinfo epl = new Eplinfo();

		System.out.println("- SIMPLE FOTMOB PROGRAM(DBVer) -" + "\r\n");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.조회" + "\r\n" + "2.업데이트(관리자)" + "\r\n" + "3.추가(관리자)" + "\r\n" + "4.삭제(관리자)" + "\r\n");
			int mnum = sc.nextInt(); // 메뉴넘버
			int tnum = 0; // 팀 넘버

			while (true) {
				if (mnum == 1) {
					epl.selectMenu();
					System.out.println("리그를 선택하세요.");
					int lnum = sc.nextInt(); // 리그넘버

					switch (lnum) {
					case 1:
						while (true) {
							List<FotmobVo> epl_data = dao.selectTeam(lnum);
							for (FotmobVo vo : epl_data) {
								rank++;
								System.out.println(rank + "위 " + vo);
							}
							System.out.println("팀을 선택하세요.");

							tnum = sc.nextInt();
							System.out.println("selected_ " + epl_data.get(tnum - 1).name + "\r\n"
									+ epl_data.get(tnum - 1).allContent() + "\r\n"); // 이게 왜 되는거냐'_'

							rank = 0; // 순위 초기화

							System.out.println("이동 옵션_a:팀 선택 *:종료");
							String snum = sc.next();// shift 넘버

							if (snum.equals("a")) {
								while (true) {
									System.out.println("팀 번호를 입력하세요(0:리그 선택으로 돌아가기)");
									tnum = sc.nextInt();
									if (tnum == 0) {
										System.out.println("<리그선택으로 이동>");
										break;
									} else
										System.out.println("selected_ " + epl_data.get(tnum - 1).name + "\r\n"
												+ epl_data.get(tnum - 1).allContent() + "\r\n"); // 이게 왜 되는거냐'_'

								}
								break;

							} else if (snum.equals("*")) {
								sc.close();
								System.out.println("종료합니다.");
								return;

							} else
								break;

						}
						break;

					case 2:
						while (true) {
							List<FotmobVo> laliga_data = dao.selectTeam(lnum);
							for (FotmobVo vo : laliga_data) {
								rank++;
								System.out.println(rank + "위 " + vo);
							}
							System.out.println("팀을 선택하세요.");

							tnum = sc.nextInt();
							System.out.println("selected_ " + laliga_data.get(tnum - 1).name + "\r\n"
									+ laliga_data.get(tnum - 1).allContent() + "\r\n"); // 이게 왜 되는거냐'_'

							rank = 0; // 순위 초기화

							System.out.println("이동 옵션_a:팀 선택 *:종료");
							String snum = sc.next();// shift 넘버

							if (snum.equals("a")) {
								while (true) {
									System.out.println("팀 번호를 입력하세요(0:리그 선택으로 돌아가기)");
									tnum = sc.nextInt();
									if (tnum == 0) {
										System.out.println("<리그선택으로 이동>");
										break;
									} else
										System.out.println("selected_ " + laliga_data.get(tnum - 1).name + "\r\n"
												+ laliga_data.get(tnum - 1).allContent() + "\r\n"); // 이게 왜 되는거냐'_'

								}
								break;

							} else if (snum.equals("*")) {
								sc.close();
								System.out.println("종료합니다.");
								return;

							} else
								break;

						}
						break;

					case 3:
						while (true) {
							List<FotmobVo> bundes_data = dao.selectTeam(lnum);
							for (FotmobVo vo : bundes_data) {
								rank++;
								System.out.println(rank + "위 " + vo);
							}
							System.out.println("팀을 선택하세요.");

							tnum = sc.nextInt();
							System.out.println("selected_ " + bundes_data.get(tnum - 1).name + "\r\n"
									+ bundes_data.get(tnum - 1).allContent() + "\r\n"); // 이게 왜 되는거냐'_'

							rank = 0; // 순위 초기화

							System.out.println("이동 옵션_a:팀 선택 *:종료");
							String snum = sc.next();// shift 넘버

							if (snum.equals("a")) {
								while (true) {
									System.out.println("팀 번호를 입력하세요(0:리그 선택으로 돌아가기)");
									tnum = sc.nextInt();
									if (tnum == 0) {
										System.out.println("<리그선택으로 이동>");
										break;
									} else
										System.out.println("selected_ " + bundes_data.get(tnum - 1).name + "\r\n"
												+ bundes_data.get(tnum - 1).allContent() + "\r\n"); // 이게 왜 되는거냐'_'

								}
								break;

							} else if (snum.equals("*")) {
								sc.close();
								System.out.println("종료합니다.");
								return;

							} else
								break;

						}
						break;
					case 4:
						while (true) {
							List<FotmobVo> serie_data = dao.selectTeam(lnum);
							for (FotmobVo vo : serie_data) {
								rank++;
								System.out.println(rank + "위 " + vo);
							}
							System.out.println("팀을 선택하세요.");

							tnum = sc.nextInt();
							System.out.println("selected_ " + serie_data.get(tnum - 1).name + "\r\n"
									+ serie_data.get(tnum - 1).allContent() + "\r\n"); // 이게 왜 되는거냐'_'

							rank = 0; // 순위 초기화

							System.out.println("이동 옵션_a:팀 선택 *:종료");
							String snum = sc.next();// shift 넘버

							if (snum.equals("a")) {
								while (true) {
									System.out.println("팀 번호를 입력하세요(0:리그 선택으로 돌아가기)");
									tnum = sc.nextInt();
									if (tnum == 0) {
										System.out.println("<리그선택으로 이동>");
										break;
									} else
										System.out.println("selected_ " + serie_data.get(tnum - 1).name + "\r\n"
												+ serie_data.get(tnum - 1).allContent() + "\r\n"); // 이게 왜 되는거냐'_'

								}
								break;

							} else if (snum.equals("*")) {
								sc.close();
								System.out.println("종료합니다.");
								return;

							} else
								break;

						}
						break;
					case 5:
						while (true) {
							List<FotmobVo> ligue1_data = dao.selectTeam(lnum);
							for (FotmobVo vo : ligue1_data) {
								rank++;
								System.out.println(rank + "위 " + vo);
							}
							System.out.println("팀을 선택하세요.");

							tnum = sc.nextInt();
							System.out.println("selected_ " + ligue1_data.get(tnum - 1).name + "\r\n"
									+ ligue1_data.get(tnum - 1).allContent() + "\r\n"); // 이게 왜 되는거냐'_'

							rank = 0; // 순위 초기화

							System.out.println("이동 옵션_a:팀 선택 *:종료");
							String snum = sc.next();// shift 넘버

							if (snum.equals("a")) {
								while (true) {
									System.out.println("팀 번호를 입력하세요(0:리그 선택으로 돌아가기)");
									tnum = sc.nextInt();
									if (tnum == 0) {
										System.out.println("<리그선택으로 이동>");
										break;
									} else
										System.out.println("selected_ " + ligue1_data.get(tnum - 1).name + "\r\n"
												+ ligue1_data.get(tnum - 1).allContent() + "\r\n"); // 이게 왜 되는거냐'_'

								}
								break;

							} else if (snum.equals("*")) {
								sc.close();
								System.out.println("종료합니다.");
								return;

							} else
								break;

						}
						break;

					default:
						System.out.println("리그를 다시 선택하세요");
						break;
					}

				} else if (mnum == 2) {
//					List<FotmobVo> data = dao.updateScore(tnum, tnum, null, tnum, tnum);
					
					Scanner sc2 = new Scanner(System.in);
					int point = sc2.nextInt();
					int play = sc2.nextInt();
					String bestplayer = sc2.next();
					Double mompoint = sc2.nextDouble();
					int no = sc2.nextInt();
					
					dao.updateScore(point, play, bestplayer, mompoint, no);
//					System.out.println("No "+no+"update 완료");
					

				}
				// else
//				System.out.println("ID : ");
//			String id = sc.next();
//			System.out.println("PW : ");
//			String pw = sc.next();

			}
//		

//		List<FotmobVo> data = dao.selectTeam();
//		for (FotmobVo vo : data) {
//			System.out.println(vo);
//		}

//		DetailInfo[] detail_ligue1 = new DetailInfo[18];
//		System.out.println(detail_ligue1.length);
//		for (int i = 0; i < detail_ligue1.length; i++) {
//			detail_ligue1[i] = new DetailInfo(); // 객체배열 생성
//		}
//		for (int i = 0; i < detail_ligue1.length; i++) {
//			detail_ligue1[i].name = ligue1.Teams[i];
//			detail_ligue1[i].coach = ligue1.Coach[i];
//			detail_ligue1[i].hometown = ligue1.Hometown[i];
//			detail_ligue1[i].previousrank = ligue1.PreviousRank[i];
//			detail_ligue1[i].play = 9;
//			detail_ligue1[i].point = epl.makescore(9);
//			detail_ligue1[i].mompoint = epl.makeMomPoint();
//			detail_ligue1[i].bestplayer = ligue1.bestplayer[i];
//
//			String name = detail_ligue1[i].name;
//			String coach = detail_ligue1[i].coach;
//			String hometown = detail_ligue1[i].hometown;
//			String bestplayer = detail_ligue1[i].bestplayer;
//			int point = detail_ligue1[i].point;
//			String previousrank = detail_ligue1[i].previousrank;
//			double mompoint = detail_ligue1[i].mompoint;
//			int play = 9;
//			int leagueid = 5;
//
//			dao.insertTeam(name, coach, hometown, bestplayer, point, previousrank, mompoint, play, leagueid);

//		data = dao.selectTeam();

		}
//		System.out.println("insert완료");
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
