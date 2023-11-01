package DatabaseConnVer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingTest1 {
//	ArrayList<String> fianl = new ArrayList<String>();

	public static void main(String[] args) {
		String url = "https://namu.wiki/w/%ED%8B%80:2023-24%20%EC%8B%9C%EC%A6%8C%20%ED%94%84%EB%A6%AC%EB%AF%B8%EC%96%B4%20%EB%A6%AC%EA%B7%B8%20%EC%88%9C%EC%9C%84%ED%91%9C";

//		String html = "<html><head><title>First parse</title></head>"
//				+ "<body><p>Parsed HTML into a doc.</p></body></html>";
//		Document doc = Jsoup.parse(html);
//		System.out.println(doc.parser());
//0, 10,20
		try {
			ArrayList<String> list = new ArrayList<>();
			Document doc2 = Jsoup.connect(url).get();
//			System.out.println(doc + "----doc 여기까지");
			Elements elem = doc2.select("div[class=\"cIflhYhI\"]");
			for (Element e : elem.select("div")) {
				list.add(e.text());
//				Parser title = doc2.parser();
//						System.out.println(title);
			}
			System.out.println(list);
			for (int i = 0; i < 12; i++) {
				list.remove(0);

			}
			int num = list.size();
			
			for (int i = num; i > num-7; i--) {
				list.remove(num-7);
			}
			System.out.println(list);

//			for (int i = 0; i < list.size()-1; i++) {
//				int number = list.get(i).charAt(0);
//				if(number<48 && number >57) {
//					continue;
//				}
//				else if(list.get(i).equals(list.get(i + 1))) {
//					list.remove(i);
//				}
				System.out.println(list);
				for(int i=0;i<list.size();i++) {
					list.remove("");
				}
			
//			}
			for(int i=0;i<20;i++) {
				if(i==0){
					list.remove(0);
				}else
				list.remove(i*10);
				System.out.println(list.size());
			}
			
			
			
			for(int i=0;i<list.size();i+=10) {
				System.out.println(list.get(i));
			}
			
			for(int i=0;i<20;i++) {
				if(i==0){
					list.remove(0);
				}else
				list.remove(i*10-i);
				System.out.println(list.size());
			}

			System.out.println(list);
//			System.out.println(list.size());
//			System.out.println("종료");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
//팀
//			경기
//			승
//			무
//			패
//			득점
//			실점
//			득실차
//			승점
		}

	}
}
