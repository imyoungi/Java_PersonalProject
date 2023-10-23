package SimpleVer;

import java.util.Random;

public class Ligue1info {
	static Random random = new Random();
	DetailInfo detail_ligue1 = new DetailInfo();
	Simplefotmob simplefm = new Simplefotmob();

	public String[] Teams = { "AS MONACO", "BRESTSTADE BRESTOIS 29", "CLERMONTCLERMONT FOOT 63", "FC LORIENTFC LORIENT",
			"FC METZFC METZ", "FC NANTESFC NANTES", "HAVRE ACHAVRE ATHLETIC CLUB", "LOSCLOSC LILLE",
			"MONTPELLIERMONTPELLIER HÉRAULT SC", "OGC NICEOGC NICE", "OLOLYMPIQUE LYONNAIS", "OMOLYMPIQUE DE MARSEILLE",
			"PSGPARIS SAINT-GERMAIN", "RC LENSRC LENS", "REIMSSTADE DE REIMS", "RENNESSTADE RENNAIS FC",
			"STRASBOURGRC STRASBOURG ALSACE", "TOULOUSE FCTOULOUSE FC" };

	public String[] Coach = { "아디 휘터", "에릭 로이", "파스칼 가스티앙", "레지스 르브리", "라슬로 뵐뢰니", "피에르 아리스투이", "루카 엘스네르", "파울루 폰세카",
			"미셸 데르 자카리안", "프란체스코 파리올리", "파비오 그로소", "젠나로 가투소", "루이스 엔리케", "프랑크 에스", "윌리엄 스틸", "브뤼노 제네시오", "파트리크 비에이라",
			"카를레스 마르티네스" };

	public String[] Hometown = { "Stade Louis II", "Stade Francis-Le Blé", "Stade Gabriel Montpied",
			"Stade du Moustoir", "Stade Municipal Saint-Symphorien", "Stade de La Beaujoire", "Stade Océane",
			"Stade Pierre-Mauroy", "Stade de la Mosson", "Allianz Riviera", "Groupama Stadium", "Orange Vélodrome",
			"Parc des Princes", "Stade Bollaert-Delelis", "Stade de Reims", "Stade Rennais FC", "Stade de la Meinau",
			"Stadium Municipal de Toulouse", };

	public String[] PreviousRank = { "6", "14", "8", "10", "1부승격(2위)", "16", "1부승격(1위)", "5", "12", "9", "7", "3", "1",
			"2", "11", "4", "15", "13" };

	public String[] Member_MONACO = { "라도스와프 마예츠키", "반데르송", "기예르모 마리판", "모하메드 카마라", "데니스 자카리아", "엘리세 벤 세기르", "엘리엇 마타조",
			"마이론 보아두", "위삼 벤예데르", "카이우 엔리케", "이스마일 자콥스", "필리프 쾬", "알렉산드르 골로빈", "미나미노 타쿠미", "유수프 포파나", "마그네스 아클리우슈",
			"무함마드 살리수", "일란 오쿠", "루벤 아길라르", "크레핀 디아타", "폴라린 발로건", "크리슬랑 마치마", "브렐 엠볼로", "얀 리나르", "젤송 마르틴스", "숭구투 마가사",
			"윌프리드 싱고", };

	public String[] Member_BRESTOIS = { "브래들리 로코", "릴리앙 브라시에", "브렌당 샤르도네", "하리스 벨케블라", "폴 라스네", "뤼시앵 아구메", "이르뱅 카르도나",
			"스티브 무니에", "세바스티앙 시부아", "데니스 뱅", "카라모코 뎀벨레", "라피키 사이드", "로맹 파브르", "줄리앙 포쉬리에", "크리스토프 에레유", "로맹 델카스티요",
			"제레미 르두아롱", "위고 마녜티", "양가 음보크", "유수프 바지", "그레구아르 쿠데르", "노에 소우", "마르코 비조트", "마흐디 카마라", };

	public String[] Member_CLERMONT = { "니콜슨", "가스티엥", "케이타", "엘바 라샤니 ", "부토바", "무하메드 참 사라체비치", "메흐디 제파네", "짐 알레비나",
			"알리두 세이두", "막시밀리아노 코프리에즈", "은디아예", "버카니", "마우러", "체이크 우마르 코나테", "요한 매그닌", "플로랑 오지에", "고날론스", "펠마르드", "디아우",
			"그레존 키예이", "마테우시 비에테스카", };

	public String[] Member_LORIENT = { "알프레드 고미스", "이고르 시우바", "몬타사르 탈비", "뱅자맹 멘디", "로랑 아베르젤", "스테판 디아라", "봉케 이노센트",
			"다를랭 용과", "쥘리앵 라포르트", "캉탱 부아스가르", "바모 메이테", "쥘리앵 퐁소", "요안 카틀린", "제던 칼룰루", "뱅상 르고프", "시리네 두쿠레", "레두안 부를레스",
			"테오 르브리", "이봉 음보고", "아딜 아우치체", "테디 바르투시", "케니 나제라", };

	public String[] Member_METZ = { "조르지스 미카우타제", "셰이크 티디안느 사발리", "조엘 아소로", "마티외 우돌", "유세프 마지즈", "에스투피", "테타 ", "장 자크",
			"칸데 ", "카마라 ", "은두퀴디", "잘로 ", "아타 ", "콜린 ", "반 덴 케르크호프", "트라오레", "오우키자", };

	public String[] Member_NANTES = { "나단 제제", "니콜라스 팔로이스", "더글라스", "데니스 페트리치", "라미네 디악", "레미 데샹", "로빈 보이진", "마르퀴뇨스",
			"마커스 코코", "마티스 에블린", "모스타파 모하메드", "모제스 시몬", "모하메드 아치 부아클린", "무사 시소코", "바스티엥 뫼피유", "사무엘 무투사미", "스트레다이르 아푸아",
			"아드손", "알방 라퐁", "야니스 음벰바", "에라이 죄메르트", "이냐시오 가나고", "자우엔 하잠", "장 샤를 카스텔레토", "장 케빈 뒤베른", "조 로익 아파마", "카데르 밤바",
			"쿠엔틴 멀린", "파비엥 센톤제", "페드로 치리벨라", "플로랑 몰레", "휴고 바르벳", };

	public String[] Member_LEHAVRE = { "고티에 요리스", "나빌 알리위", "놀란 음벰바", "달레르 쿠자예프", "라술 은디아예", "로이치 네고", "마티유 고겔링",
			"모크레인 벤토우미", "모하메드 바요", "모하메드 코네", "사무엘 그랑시르", "아루나 상강테", "아서 데마스", "알로이스 콘파", "알리우 티아르", "압둘라예 투레",
			"앙투안 주주", "앤디 로그보", "야신 케흐타", "에마누엘 사비", "에티엔 유트 킨쿠에", "오사마 타르갈린", "왈리드 엘 하잠", "요니고미스", "요안 살미에", "이사 수마레",
			"조수에 카지미르", "치크 둠비아", "칸데 디아와라", "크리스토퍼 오페리", };

	public String[] Member_LILLE = { "가브리엘 구드문드손", "나빌 벤탈렙", "도스 산토스 이스마일리", "레니 요로", "레미 카벨라", "루카스 슈발리에", "리산드루 올메타",
			"바포데 디아키테", "벤자민 안드레", "비토 마노네", "사무엘 움티티", "아담 야쿠베흐", "아담 우나스", "아담 파이즈", "아론 말루다", "아민 메수사", "아킴 제다드카",
			"알란 비르지니우스", "알렉산드루 히베이루", "앙헬 고메즈", "에돈 제그로바", "오스만 투레", "유수프 야즈즈", "이그나시오 미라몬", "이반 카발레이로", "조나단 데이빗",
			"톰 네그렐", "티아고 디알로", "티아구 산토스", "하콘 하랄드손", };

	public String[] Member_MONTPELLIER = { "아르노 노르딘", "디미트리 베르토드", "레오 르로이", "루카스 민카렐리 데이빈", "마마두 사코", "막심 에스테브",
			"무사 알 타마리", "베치르 오베라기치", "벤야민 르콤트", "벨민 디자레비치", "부바카르 키키", "사샤 들라예", "아코르 애덤스", "야니스 게르무체", "야니스 알리 이수푸",
			"엔조 차토", "와비 카즈리", "요리스 쇼타르", "이시아가 실라", "조르당 페리", "카릴 파야드", "켈빈 예보아", "크리스토퍼 줄리엔", "테오 셍뜨류스", "테지 사바니에",
			"팔라예 사코", };

	public String[] Member_NICE = { "파블로 로사리오", "테렘 모피", "테디 불렌디", "케프렌 튀랑 울리엔", "조르단 로톰바", "제레미 보가", "장 클레르 토디보",
			"이샴 부다위", "유수프 은다이시미예", "유세프 아탈", "에반 게상", "앙투안 멘디", "알리우 발드", "알렉시스 클로드 모리스", "알렉시 베카 베카", "아요브 암라우이",
			"아미두 덤부야", "소피앙 디옵", "살바토레 시리구", "본핌 단테", "바드르딘 부아나니", "모건 샌슨", "멜빈 바드", "마르친 불카", "로망 페라드", "레다 벨라햔느",
			"다우다 트라오레", "가에탕 라보르드", };

	public String[] Member_LYONNAIS = { "앙토니 로페스", "시날리 디오망데", "니콜라스 탈리아피코", "데얀 로브렌", "막상스 카케레", "아민 사르", "알렉상드르 라카제트",
			"엔히키 시우바 밀라그레스", "라얀 셰르키", "샤엘 쿰베디", "클린톤 마타", "조안 르페낭", "모하메드 엘 아우쉬", "레미 리우", "케인 보네비", "제피뉴", "두예 찰레타차르",
			"코랑탱 톨리소", };

	public String[] Member_MARSEILLE = { "노암 마요카", "레난 로디", "레오 주슬랭", "레오나르도 발레르디", "로게르지오 냐코시", "루벤 블랑코", "미쉘 무리요",
			"바모 메이테", "발렌틴 론져", "비토르 카르발류", "빌랄 나디르", "사무엘 지고", "시몬 은가판도우에튼부", "아마이 카프리스", "아민 하릿", "아제딘 우나히",
			"알렉상드르 툰카디", "엠란 소글로", "이스마일라 사르", "일리만 은디아예", "제프리 콘도그비아", "젤레 반 넥", "조나단 클라우스", "조르당 베레투", "찬셀 음벰바",
			"파우 사바타", "파페 알라산 게예", "프랑수아 레지스 무게", "피에르 에머릭 오바메양", "호아킨 코레아", };

	public String[] Member_PSGPARIS = { "케일러 나바스", "아슈라프 하키미", "프레스넬 킴펨베", "마누엘 우가르테", "마르키뉴스", "킬리안 음바페", "파비안 루이스",
			"곤살루 하무스", "우스만 뎀벨레", "마르코 아센시오", "다닐루 페레이라", "세르히오 리코", "비티냐", "이강인", "뤼카 에르난데스", "랑달 콜로 무아니", "누누 멘데스",
			"노르디 무키엘레", "셰르 은두르", "카를로스 솔레르", "브래들리 바르콜라", "알렉상드르 르텔리에", "레뱅 퀴르자와", "워렌 자이르에머리", "밀란 슈크리니아르", "위고 에키티케",
			"아르나우 테나스", "잔루이지 돈나룸마" };

	// 랑스
	public String[] Member_LENS = { "파리녜스 ", "마차도 ", "단조 ", "소토카 ", " 와히 ", "페레이라 다코스타 ", "퓔지니", "메디나 ", "코르테스 ",
			"디우프 ", "마와사 ", "아이다라 ", "사이드 ", "그하딧", "후사노프 ", "멘디 ", "토마손 ", "삼바 ", "판도르", };

	// 랭스
	public String[] Member_REIMS = { "조셉 오쿠무", "카모리 둠비아", "막심 부시", "유니스 압딜하미드", "이토 준야", "모하메드 다라미", "테디 퇴마", "나타나엘 음부쿠",
			"레다 카드라", "마셜 무네치", "나카무라 케이토", "조슈아 윌슨에스브랜드", "아조르 마투시와", "우마르 디아키테", "에마뉘엘 아그바두", "티볼트 드 스메트", "아다마 보장",
			"니콜라 페네토", "토마 포케", "셰이크 케이타", "예반 디우프", "아르버르 제넬리", };

	// 렌
	public String[] Member_RENNAIS = { "고티에 갈롱", "아드리앵 트뤼페르", "아르투르 테아테", "마르탱 테리에", "밥티스트 산타마리아", "아르노 칼리뮈앙도", "루도빅 블라",
			"뱅자맹 부리조", "크리스토퍼 우", "주누엘 벨로시앙", "아민 구이리", "플라비앵 테", "네마냐 마티치", "로렌츠 아시뇽", "와흐메드 오마리", "엔조 르페", "스티브 만단다",
			"겔라 두에", "데지레 두에", "이브라힘 살라", "셰카", "로맹 살랭", };

	public String[] Member_STRASBOURG = { "마츠 셀스", "프레데릭 길베르", "토마 들렌", "카롤 필라", "뤼카 페랭", "장외드 아올루", "제시 데밍게", "케빈 가메이로",
			"엠마누엘 에메가", "모이스 사히 디온", "레보 모티바", "사이두 소우", "사닌 프르치치", "주니어 음왕가", "하비브 디아라", "제르지노 니암시", "앙젤루 가브리에우",
			"아바카르 실라", "스티븐 바세야", "딜란 바콰", "이브라히마 시소코", "마르뱅 세나야", "이스마엘 두쿠레", "알렉상드르 피에르", "알라 벨라루치", "막심 바스티앙",
			"에두아르드 소볼", };

	public String[] Member_TOULOUSE = { "히뫼르 ", "니콜라이센", "데슬레르 ", "젠로우 ", "코스타 ", "아부클랄 ", "시에로", "시소코 ", " 겔라베르 ", "카만지 ",
			"베그라위 ", "헤우 ", "수아소 ", "잔덴 ", "슈미트 ", " 방그레 ", "스퀴태 ", "디아라 ", "카세레스 ", "크번 ", "차이비", "도밍게스 ", " 라콤베 ",
			"오나이우 ", "레스트 ", "플레밍스 ", };
	
	public String[] bestplayer = {Member_MONACO[random.nextInt(Member_MONACO.length)],
			Member_BRESTOIS[random.nextInt(Member_BRESTOIS.length)],
			Member_CLERMONT[random.nextInt(Member_CLERMONT.length)],
			Member_LORIENT[random.nextInt(Member_LORIENT.length)],
			Member_METZ[random.nextInt(Member_METZ.length)],
			Member_NANTES[random.nextInt(Member_NANTES.length)],
			Member_LEHAVRE[random.nextInt(Member_LEHAVRE.length)],
			Member_LILLE[random.nextInt(Member_LILLE.length)],
			Member_MONTPELLIER[random.nextInt(Member_MONTPELLIER.length)],
			Member_NICE[random.nextInt(Member_NICE.length)],
			Member_LYONNAIS[random.nextInt(Member_LYONNAIS.length)],
			Member_MARSEILLE[random.nextInt(Member_MARSEILLE.length)],
			Member_PSGPARIS[random.nextInt(Member_PSGPARIS.length)],
			Member_LENS[random.nextInt(Member_LENS.length)],
			Member_REIMS[random.nextInt(Member_REIMS.length)],
			Member_RENNAIS[random.nextInt(Member_RENNAIS.length)],
			Member_STRASBOURG[random.nextInt(Member_STRASBOURG.length)],
			Member_TOULOUSE[random.nextInt(Member_TOULOUSE.length)],};

}
