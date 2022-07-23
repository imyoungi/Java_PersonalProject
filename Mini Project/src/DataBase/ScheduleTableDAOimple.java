package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ScheduleTableDAOimple {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##green";
	String password = "green1234";

	private Connection con;
	private Statement stmt;
	private ResultSet rs;
//	@Override
//	public List getschedule() {
//		try {//오라클 드라이버 생성
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch(ClassNotFoundException e) {
//			System.out.println("오라클 드라이버 생성 실패");
//		}
//		//오라클 인스턴스 객체 생성
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		ResultSet rs = null;
//		
//		//오라클 인스턴스 생성
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		
//		try {
//			conn = DriverManager.getConnection(url, "c##green", "green1234");
//			
//			//쿼리 실행
//			String query = "SELECT ID" + ",SDATE" + ",DDATE"+",TITLE"
//			               +",LOCATION"+"MEMO";
//
//			//자바에서 쿼리 실행할 수 있는 stmt 객체 생성
//			stmt = conn.prepareStatement(query);
//			
//			//쿼리를 실행해 결과 rs에 담아 리턴
//			rs = stmt.executeQuery();
//			
//			while(rs.next()) {
//				ScheduleTableVo.setid(int id)
//				
//			}
//			
//		}
//	}

	public ArrayList<ScheduleTableVo> List() {
		ArrayList<ScheduleTableVo> values = new ArrayList<ScheduleTableVo>();
		try {
			connDB();

			String query = "SELECT * FROM scheduletable";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
//			rs.last();
//			System.out.println("rs.getRow() : " + rs.getRow());
//
//			if (rs.getRow() == 0) {
//				System.out.println("0 row selected...");
//			} else {
//				return true;
//			}
			while(rs.next()) {
				ScheduleTableVo vo = new ScheduleTableVo();
//				rs.getInt(1);
//				rs.getString(2);
//				rs.getString(3);
//				rs.getString(4);
//				rs.getString(5);
//				rs.getString(6);
				
				vo.setSdate(rs.getString(2));
				vo.setDdate(rs.getString(3));
				vo.setTitle(rs.getString(3));
				vo.setLocation(rs.getString(4));
				vo.setMemo(rs.getString(5));
				values.add(vo);
				
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
//				System.out.println(rs.getString(4));
//				System.out.println(rs.getString(5));
//				System.out.println(rs.getString(6));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return values;
	}

	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success.\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		ScheduleTableDAOimple dao = new ScheduleTableDAOimple();
//		dao.List();
//	}


}
