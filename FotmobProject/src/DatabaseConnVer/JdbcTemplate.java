package DatabaseConnVer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTemplate {

	public JdbcTemplate() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 검색 성공! ");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public Connection getConnection() {
		String user = "admin";
		String password = "GkdudRkddls1419!!";
		String jdbcurl = "jdbc:oracle:thin:@k44pt3du0dcrpdba_high?TNS_ADMIN=/Users/user/Downloads/Wallet_K44PT3DU0DCRPDBA";
		Connection conn = null;

//		try {
//			conn = DriverManager.getConnection(jdbcurl, user, password);
//			System.out.println("접속성공 ");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		try {
			conn = DriverManager.getConnection(jdbcurl, user, password);
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;

	}
}