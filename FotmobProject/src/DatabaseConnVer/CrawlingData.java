package DatabaseConnVer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingData {
	public static ArrayList<String> allList = new ArrayList<>(); // String
	public static ArrayList<Integer> scoreList = new ArrayList<>(); // int
	public static ArrayList<String> nameList = new ArrayList<>();

	public static void main(String[] args) {
		String laligaurl = "https://namu.wiki/w/%EB%9D%BC%EB%A6%AC%EA%B0%80/2023-24%20%EC%8B%9C%EC%A6%8C";
		String eplurl = "https://namu.wiki/w/%ED%94%84%EB%A6%AC%EB%AF%B8%EC%96%B4%20%EB%A6%AC%EA%B7%B8/2023-24%20%EC%8B%9C%EC%A6%8C";
		String bundesurl = "https://namu.wiki/w/%EB%B6%84%EB%8D%B0%EC%8A%A4%EB%A6%AC%EA%B0%80/2023-24%20%EC%8B%9C%EC%A6%8C";
		String serieurl = "https://namu.wiki/w/%EC%84%B8%EB%A6%AC%EC%97%90%20A/2023-24%20%EC%8B%9C%EC%A6%8C?from=%EC%84%B8%EB%A6%AC%EC%97%90%20A%202324#s-4";
		String ligue1url = "https://namu.wiki/w/%EB%A6%AC%EA%B7%B8%201/2023-24%20%EC%8B%9C%EC%A6%8C";

		String[] adress = { eplurl, laligaurl, bundesurl, serieurl, ligue1url};
		// 라리가, 분데스리가 추출 방법 동일

		for (int i = 0; i < adress.length; i++) {
		try {

			Document doc2 = Jsoup.connect(adress[i]).get();
//			Elements elem2 = doc2.select("div[class=\"imso-hide-overflow C1gYkd\"]"); //1~5등 이름
//			Elements elem2 = doc2.select("div[class=\"jXpA9e Ui5IUc\"]");//1~5등 이름+정보(WU8wvaGd)
			Elements elem2 = doc2.select("div[class=\"WU8wvaGd\"]");
			for (Element e : elem2.select("td")) {
				if (e.className().equals("cIflhYhI")) {
					continue;
				}
				allList.add(e.text());

				if (e.text().equals("")) {
					allList.remove(e.text());
				}

//					System.currentTimeMillis();
			}
			List<String> list = allList.subList(51,231); // ArrayList 범위 값 가져오기 : List로 변환해야 함 
			for(String i : list) {
				System.out.print(i+", ");
			}
			System.out.println(allList.size());
			
//				if (i == 3 || i == 4) {
//					for (Element e : elem2.select("span")) {
//						allList.remove(e.text());
//
//					}
//				}
//				for (Element e : elem2.select("text-align:left")) {

//
//				}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	// String html = "<html><head><title>First parse</title></head>"
//				+ "<body><p>Parsed HTML into a doc.</p></body></html>";
//		Document doc = Jsoup.parse(html);
//		System.out.println(doc.parser());

}
//}
