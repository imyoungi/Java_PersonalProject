package SimpleVer;

import java.util.Random;

public class Eplinfo {

	static Random random = new Random();
	DetailInfo detail = new DetailInfo();
	Simplefotmob simplefm = new Simplefotmob();

	public double makeMomPoint() {
		float point = (float) Math.random() * 5 + 6;
		double mompoint = Math.round(point * 100) / 100.0;
		if (mompoint > 10.0) {
			mompoint = mompoint - 1;
		}
		return mompoint;

	}

	int epl_makeplay() {
		int play = (int) (Math.random() * 38) + 1;
		return play;
	}

	public int epl_makescore(int play) { // 승리(3), 무승부(1), 패(0)
		int count = 0;

		for (int i = 0; i < play; i++) {
			int score = (int) (Math.random() * 4) + 0;
			if (score == 2) {
				score = score - 1;
			}
			count += score;
		}
		return count;

	}

	void selectMenu() {
		String[] menu = { "1. Premier League", "2. LaLiga", "3. Bundesligga", "4. SerieA", "5. Ligue 1" };
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}

	}


	public static String[] EplTeams = { "Mancity", "Tottenham", "Arsenal", "West Ham United", "Liverpool",
			"Brighton & Hove Albion", "Crystal Palace", "Brentford", "Nottingham Forest", "Aston Villa",
			"Manchester United", "Chelsea", "Fulham", "Newcastle United", "Wolves", "AFC Bournemouth",
			"Sheffield United", "Everton", "Luton Town", "Burnley" };

	public static String[] EplCoach = { "펩 과르디올라", "엔제 포스테코글루", "미켈 아르테타", "데이비드 모이스", "위르겐 클롭", "로베르토 데 제르비", "호지슨 로이",
			"토마스 프랑크", "스티브 쿠퍼", "우나이 에메리", "에릭 텐 하흐", "마우리시오 포체티노", "마르쿠 실바", "에디 하우", "게리오닐", "안도니 이라올라", "폴 헤킹버텀",
			"숀 다이치", "롭 에드워드", "뱅상 콤파니" };

	public static String[] EplHometown = { "Etihad Stadium", "Tottenhamhotspur Stadium", "Emirates Stadium", "London Stadium",
			"Anfield", "팔머 스타디움", "Selhurst Park Stadium", "브렌트퍼드 커뮤니티 스타디움", "시티 그라운드", "빌라 파크", "올드 트래퍼드", "스탬퍼드 브리지",
			"크레이븐 코티지", "세인트 제임스 파크", "Molineux Stadium", "바이탈리티 스타디움", "브래몰 레인", "구디슨 파크", "케닐워스 로드", "터프 무어" };

	public static String[] EplPreviousRank = { "1", "8", "2", "14", "5", "6", "11", "9", "16", "14", "3", "12", "10", "4",
			"13", "15", "EFL 챔피언십 2위 (승격)", "17", "EFL 챔피언십 3위 (승격)", "EFL 챔피언십 1위 (승격)" };

	static String[] Member_Mancity = { "카일 워커", "후벵 디아스", "캘빈 필립스", "존 스톤스", "나단 아케", "마테오 코바치치", "엘링 홀란드", "잭 그릴리시",
			"제레미 도쿠", "잭 스테판", "로드리", "케빈 더 브라위너", "슈테판 오르테가", "훌리안 알바레스", "베르나르두 실바", "세르히오 고메스", "요슈코 그바르디올",
			"마누엘 아칸지", "마테우스 누네스", "에데르송", "스콧 카슨", "필 포든", "리코 루이스" };

	static String[] Member_Tottenham = { "에머슨 로얄", "굴리엘모 비카리오", "이반 페리시치", "에릭 다이어", "크리스티안 로메로", "지오바니 로 셀소",
			"라이언 세세뇽", "프레이저 포스터", "데얀 쿨루세프스키", "페드로 포로", "솔로몬 매너", "파페 마타르 사르", "로드리고 벤탕쿠르", "벤 데이비스", "애슐리 필립스",
			"알레호 벨리즈", "미키 반 데 벤", "우도기", "브랜든 오스틴", "알피 화이트먼", "세르히오 레길론", "조 로돈", "제드 스펜스", "자페트 탕강가", "탕기 은돔벨레",
			"위고 요리스", "올리버 스킵", "피에르 에밀 회비에르", "손흥민", "이브 비소우마", "히샤를리송", "제임스 매디슨", "브라이언 길" };

	static String[] Member_Arsenal = { "아론 램스데일", "칼 헤인", "세드릭 소아레스", "올렉산드르 진첸코", "토미야스 다케히로", "벤 화이트", "가브리엘",
			"쥬리엔 팀버", "윌리엄 살리바", "야쿠브 키위오르", "조르지뉴", "모하메드 엘네니", "토마스 파티", "마틴 외데가르드", "데클란 라이스", "에밀 스미스 로우",
			"파비오 비에이라", "레안드로 트로사르", "가브리엘 제수스", "리스 넬슨", "카이 하베르츠", "에드워드 은케티아", "부카요 사카", "가브리엘 마르티넬리" };

	static String[] Member_Brentford = { "다니엘 벤틀리", "호세 사", "톰 킹", "크레이그 도슨", "맷 도허티", "조니", "넬슨 세메도", "산티아고 부에노",
			"맥스 킬먼", "라얀 아이트 누리", "토티 고메스", "휴고 부에노", "마리오 레미나", "장 리크너 벨레 가르드", "브루노 조르다오", "토마스 도일", "부바카르 트라오레",
			"조 호지,", "존 고메스", "파블로 사라비아", "다니엘 포덴스", "황희찬", "피터 손자", "사사 칼라이지치", "마테우스 쿠냐", "파비오 실바", "엔소 곤잘레스" };

	static String[] Member_Liverpool = { "알리송", "고메스", "와타루", "반 데이크", "코나테", "티아고", "밀너", "도미니크", "피르미누", "살라", "아드리안",
			"헨더슨", "체임벌린", "존스", "엘리엇", "디오구", "치미카스", "램지", "디아스", "로버트슨", "누녜스", "카르발류", "마티프", "켈러허", "알렉산더아널드", };

	static String[] Member_WestHam = { "파비안스키", "리드", "크레스웰", "발부에나", "사발레타", "스카마카", "펠리피 안데르송", "에르난데스", "란시니",
			"스노드그래스", "아드리안", "오비앙", "산체스", "노블", "윌셔", "오그본나", "디옵", "프레더릭스", "마쉬아퀴", "안토니오", "쿨렌", "트로트", "옥스포드",
			"홀랜드", "파스크", "라이스", };

	static String[] Member_Brighton = { "바르트 페르브뤼헌", "타리크 램프티", "이고르 줄리우", "아담 웹스터", "루이스 덩크 ", "제임스 밀너", "솔리 마치",
			"마흐무드 다후드", "주앙 페드루", "훌리오 엔시소", "빌리 길모어", "파스칼 그로스 ", "애덤 럴라나", "야쿠프 모더", "스테벤 알자테", "대니 웰벡", "안디 제키리",
			"카를로스 발레바", "미토마 가오루", "제이슨 스틸", "시몽 아딩그라", "에반 퍼거슨", "얀 폴 판 헤케", "페르비스 에스투피냔", "안수 파티 ", "요엘 펠트만", "톰 맥길",
			"파쿤도 부오나노테" };

	static String[] Member_Crystal = { "스페로니", "워드", "판안홀트", "밀리보예비치", "톰킨스", "댄", "마이어", "쇨로트", " 자하", " 사코", " 헤네시",
			" 슐루프", " 벤테케", " 매카서", " 위컴", " 수아레", " 카이카이", " 사코", " 로킬로", " 루메카", " 야흐", " 켈리", " 커비", " 펀천",
			" 리데발트", };

	static String[] Member_NottinghamForest = { "맷 터너", "줄리앙 비앙코네", "누노 타바레스 ", "조 워럴", "오렐 망갈라", "이브라힘 상가레", "니코 윌리엄스",
			"셰이쿠 쿠야테", "타이워 아워니이", "모건 깁스화이트", "크리스 우드", "안드레이 산투스 ", "웨인 헤네시", "캘럼 허드슨오도이", "해리 토폴로", "니콜라스 도밍게스",
			"알렉스 마이튼", "펠리피", "무사 니아카테", "존조 셸비", "안토니 엘랑가", "라이언 예이츠 ", "오디세아스 블라호디모스", "세르주 오리에", "엠마누엘 데니스",
			"스콧 매케나", "디보크 오리기", "다닐루", "곤살로 몬티엘 ", "윌리 볼리", "앤드루 오모바미델레", "이선 호바스", "조지 셸비", "무릴루", "브란돈 아길레라",
			"올라 아이나", };

	static String[] Member_Aston = { "에밀리아노 마르티네즈 ", "매티 캐시", "지에구 카를루스 ", "에즈리 콘사", "타이론 밍스", "더글라스 루이스", "존 맥긴 ",
			"유리 틸레만스", "베르트랑 트라오레", "에밀리아노 부엔디아", "올리 왓킨스", "뤼카 디뉴", "파우 토레스", "알렉스 모레노", "캘럼 체임버스", "클레망 랑글레 ",
			"무사 디아비", "니콜로 차니올로 ", "필리페 쿠티뉴", "존 듀란", "로빈 올센", "코트니 하우스", "레온 베일리", "레안더르 덴동커르", "제이콥 램지", "부바카르 카마라",
			"팀 이로그부남", };

	static String[] Member_Everton = { "조던 픽포드", "네이선 패터슨", "마이클 킨", "제임스 타코우스키 ", "드와이트 맥닐", "아마두 오나나", "도미닉 캘버트루인",
			"아르나우트 단주마 ", "데마라이 그레이", "주앙 버지니아", "베투", "압둘라예 두쿠레", "애슐리 영", "비탈리 미콜렌코", "델레 알리", "안드레 고메스", "벤 고드프리",
			"셰이머스 콜먼 ", "이드리사 게예", "유세프 체르미티", "잭 해리슨 ", "앤디 로너건", "제러드 브랜스웨이트", "제임스 가너", "빌리 크렐린", "루이스 도빈", };

	static String[] Member_ManchesterUnited = { "알타이 바이은드르", "빅토르 린델뢰프", "소피안 암라바트 ", "해리 매과이어", "리산드로 마르티네스",
			"메이슨 마운트", "브루누 페르난드스 ", "앙토니 마르시알", "마커스 래시퍼드", "라스무스 호일룬", "티렐 말라시아", "크리스티안 에릭센", "세르히오 레길론 ", "아마드 디알로",
			"알레한드로 가르나초", "카제미루", "라파엘 바란", "디오구 달로", "안토니", "톰 히턴", "루크 쇼", "앙드레 오나나", "제이든 산초", "파쿤도 펠리스트리",
			"애런 완비사카", "도니 판 더 베이크", "조니 에번스", "스콧 맥토미니", };

	static String[] Member_Chelsea = { "로베르트 산체스", "악셀 디사시", "마르크 쿠쿠레야", "브누아 바디아실", "티아고 실바", "라힘 스털링", "엔소 페르난데스",
			"미하일로 무드리크", "노니 마두에케", "마커스 베티넬리", "트레보 찰로바", "니콜라 작송", "레슬리 우고추쿠", "카니 추쿠에메카", "크리스토페르 은쿤쿠", "아르만도 브로야",
			"콜 파머", "벤 칠웰 ", "코너 갤러거", "리스 제임스 ", "모이세스 카이세도", "리바이 콜윌", "말로 귀스토", "조르제 페트로비치", "이안 마천", "웨슬리 포파나",
			"로메오 라비아", "루카스 베리스트룀", "에디 비치", "말랑 사르", "데이비드 워싱턴", };

	static String[] Member_Fulham = { "마레크 로다크", "케니 테테", "캘빈 배시", "토신 아다라비오요", "해리슨 리드", "라울 히메네스", "해리 윌슨", "톰 케어니 ",
			"아다마 트라오레", "팀 림 ", "바비 데코르도바리드", "베른트 레노", "안드레아스 페레이라", "호드리구 무니즈", "윌리안", "티모티 카스타뉴", "스테벤 벤다", "주앙 팔리냐",
			"사샤 루키치", "카를루스 비니시우스", "이사 디오프", "안토니 로빈슨", "타이리스 프랑수아", "루크 해리스", "앨릭스 이워비", "포데 발로투레 ", };

	static String[] Member_NewcastleUnited = { "마르틴 두브라우카", "로리스 카리우스", "닉 포프", "마크 길레스피", "키런 트리피어 ", "폴 더밋", "스벤 보트만",
			"파비안 셰어", "자말 라셀스 ", "맷 타겟", "에밀 크라프트", "하비에르 망키요", "루이스 홀", "티노 리브라멘토", "댄 번", "조엘린통", "산드로 토날리", "맷 리치",
			"하비 반스", "제이콥 머피", "미겔 알미론", "조 윌록", "엘리엇 앤더슨", "션 롱스태프", "브루누 기마랑이스", "루이스 마일리", "칼럼 윌슨", "앤서니 고든",
			"알렉산데르 이사크", };

	static String[] Member_Wolves = { "다니엘 벤틀리", "호세 사", "톰 킹", "크레이그 도슨", "맷 도허티", "조니", "넬슨 세메도", "산티아고 부에노", "맥스 킬먼",
			"라얀 아이트 누리", "토티 고메스", "휴고 부에노", "마리오 레미나", "장 리크너 벨레 가르드", "브루노 조르다오", "토마스 도일", "부바카르 트라오레", "조 호지,",
			"존 고메스", "파블로 사라비아", "다니엘 포덴스", "황희찬", "피터 손자", "사사 칼라이지치(Sasa Kalajdzic)", "마테우스 쿠냐", "파비오 실바",
			"엔소 곤잘레스" };

	static String[] Member_Bournemouth = { "네투 ", "라이언 프레더릭스", "케르케즈 밀로시", "루이스 쿡", "로이드 켈리", "크리스 메펌 ", "데이비드 브룩스 ",
			"조 로스웰", "도미닉 솔란케", "라이언 크리스티", "당고 와타라", "대런 랜돌프", "앨릭스 스콧", "애덤 스미스 ", "마커스 태버니어", "타일러 애덤스",
			"저스틴 클라위버르트", "이오누츠 라두 ", "키퍼 무어", "하메드 트라오레", "앙투안 세메뇨", "마르코스 세네시", "개빈 킬케니", "일랴 자바르니", "필리프 빌링",
			"맥스 에런스", "캐머런 플레인", "에밀리아노 마르콘데스", "루이스 시니스테라 ", };

	static String[] Member_SheffieldUnited = { "애덤 데이비스", "조지 발독", "맥스 로우", "존 플렉", "오스턴 트러스티", "크리스 바샴", "리안 브루스터",
			"구스타보 하머르", "올리버 맥버니", "캐머런 아처", "베니 트라오레", "존 이건 ", "루크 토머스 ", "아넬 아메드호지치", "올리버 노우드", "이스마일라 쿨리발리",
			"웨스 포더링엄", "잭 로빈슨", "제이든 보글", "비니시우스 소자", "톰 데이비스", "벤 오스본", "아니스 벤 슬리만", "야세르 라루시 ", "제임스 매카티 ", "윌리암 오술라",
			"리스 노링턴데이비스", "안드레 브룩스", "대니얼 제비슨", "요르단 아미사", "질리 부야부", "사이 사치데프", };

	static String[] Member_LutonTown = { "제임스 셰이", "게이브리얼 오쇼", "댄 포츠", "톰 로키어 ", "마스 안데르센", "로스 바클리", "치도지 오그베네",
			"루크 베리", "칼턴 모리스", "컬리 우드로우", "일라이저 아데바요", "이사 카보레 ", "마블러스 나캄바", "타히트 총", "리스 버크", "펠리 러독 음판주", "조던 클라크",
			"제이콥 브라운", "팀 크륄", "토마스 카민스키", "라이언 자일스", "아마리 벨", "맷 메이시", "알피 다우티", "테덴 멘기", "글렌 리", "알베르 삼비 로콩가 ", };

	static String[] Member_Burnley = { "제임스 트래퍼드", "다라 오셰이", "찰리 테일러", "잭 코크 ", "조던 바이어", "CJ 이건라일리", "요한 베르그 그뷔드뮌손",
			"조쉬 브라운힐 ", "제이 로드리게스", "마누엘 벤손", "코너 로버츠", "네이선 레드먼드", "사네르 베르게", "라일 포스터", "얄마르 에크달", "아나스 자루리",
			"데니스 프란키", "에런 램지", "비티뉴", "조시 컬렌", "제키 암두니", "사뮈엘 바스티앵", "다르코 추를리노프", "아민 알다킬", "로렌스 비구루", "루카 콜레오쇼",
			"야콥 브룬 라르센 ", "아네스 델크루아", "마이클 오바페미", "윌송 오도베르", "아리야네트 무리치", "한노아 마셍고", "마이크 트레소르 은다이시미예 " };

	
	public static String[] bestplayer = {
			Member_Mancity[random.nextInt(Member_Mancity.length)],
			Member_Tottenham[random.nextInt(Member_Tottenham.length)],
			Member_Arsenal[random.nextInt(Member_Arsenal.length)],
			Member_WestHam[random.nextInt(Member_WestHam.length)],
			Member_Liverpool[random.nextInt(Member_Liverpool.length)],
			Member_Brighton[random.nextInt(Member_Brighton.length)],
			Member_Crystal[random.nextInt(Member_Crystal.length)],
			Member_Brentford[random.nextInt(Member_Brentford.length)],
			Member_NottinghamForest[random.nextInt(Member_NottinghamForest.length)],
			Member_Aston[random.nextInt(Member_Aston.length)],
			Member_ManchesterUnited[random.nextInt(Member_ManchesterUnited.length)],
			Member_Chelsea[random.nextInt(Member_Chelsea.length)], 
			Member_Fulham[random.nextInt(Member_Fulham.length)],
			Member_NewcastleUnited[random.nextInt(Member_NewcastleUnited.length)],
			Member_Wolves[random.nextInt(Member_Wolves.length)],
			Member_Bournemouth[random.nextInt(Member_Bournemouth.length)],
			Member_SheffieldUnited[random.nextInt(Member_SheffieldUnited.length)],
			Member_Everton[random.nextInt(Member_Everton.length)],
			Member_LutonTown[random.nextInt(Member_LutonTown.length)],
			Member_Burnley[random.nextInt(Member_Burnley.length)], };
}
