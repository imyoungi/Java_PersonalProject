package DatabaseConnVer;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingTest1 {
	public static void main(String[] args) {
		String url = "https://namu.wiki/w/%ED%8B%80:2023-24%20%EC%8B%9C%EC%A6%8C%20%ED%94%84%EB%A6%AC%EB%AF%B8%EC%96%B4%20%EB%A6%AC%EA%B7%B8%20%EC%88%9C%EC%9C%84%ED%91%9C";
		
		
		try {
			Document doc = Jsoup.connect(url).get();
//			System.out.println(doc + "----doc 여기까지");
			Elements elem = doc.select("div[class=\"cIflhYhI\"]");
			for (Element e : elem.select("div")) {
				System.out.println(e.text());
			}
			System.out.println("종료");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
