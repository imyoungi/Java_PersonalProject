package inputschedule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class NewScheduleDAO {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "c##green";
	private static final String password = "green1234";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	public NewScheduleDAO() {

	}
	
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success.\n");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

//	public Connection getconn() {
//		Connection con = null;
//
//		try {
//			Class.forName(driver);
//			con = DriverManager.getConnection(url,user,password);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return con;
//	}

	public NewScheduleDTO getMemberDTO(String title) {
		NewScheduleDTO dto = new NewScheduleDTO();

//		Connection con = null; // 연결
		PreparedStatement ps = null; // 명령
//		ResultSet rs = null; // 결과

		try {
//			con = getconn();
			connDB();
			
			String sql = "select * from scheduletable where id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);

			rs = ps.executeQuery();

			if (rs.next()) {
				dto.setsdate(rs.getString("sdate"));
				dto.setddate(rs.getString("ddate"));
				dto.settitle(rs.getString("title"));
				dto.setlocation(rs.getString("location"));
				dto.setmemo(rs.getString("memo"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

	public boolean insertMember(NewScheduleDTO dto) {
		boolean ok = false;

//		Connection con = null;
		PreparedStatement ps = null;

		try {
			connDB();
//			con = getconn();
//			String sql = "Insert into tb_member(" + "sequence.nextval, sdate, ddate, title, location, memo"
//					+ "values(?,?,?,?,?,?)";
			
			String sql = "Insert into scheduletable(id, sdate, ddate, title, location, memo)"
					+"values(newschedule.nextval,to_date(?,'yyyy/mm/dd HH24:MI'),"
					+ "to_date(?,'yyyy/mm/dd HH24:MI'),?,?,?)";
			
			System.out.println(sql);
			
//			System.out.println(dto.getsdate());
//			System.out.println(dto.getddate());
			
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getsdate());
			ps.setString(2, dto.getddate());
			ps.setString(3, dto.gettitle());
			ps.setString(4, dto.getlocation());
			ps.setString(5, dto.getmemo());
			int r = ps.executeUpdate();

			if (r > 0) {
				System.out.println("저장성공");
			} else {
				System.out.println("저장실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}
// insertMember

	public void userSelectAll(DefaultTableModel model) {

//		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
//			con = getconn();
			String sql = "select * from scheduletable order by name asc";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			// DefaultTableModel에 있는 데이터 지우기
			for (int i = 0; i < model.getRowCount();) {
				model.removeRow(0);
			}

			while (rs.next()) {
				Object data[] = { rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5) };

				model.addRow(data);

			}

		} catch (SQLException e) {
			System.out.println(e + "userSelectAll fail");
		} finally {

			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			if (ps != null)
				try {
					ps.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
