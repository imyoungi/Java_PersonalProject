package DatabaseConnVer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CrawlingDAO {
	private JdbcTemplate jdbcTemplate;

	public CrawlingDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<CrawlingVo> selectTeam() {
		String sql = "SELECT * FROM test ORDER BY POINT DESC";
		Connection conn = jdbcTemplate.getConnection();
		PreparedStatement psmt = null;
		ResultSet rs = null;

		List<CrawlingVo> result = new ArrayList<>();

		try {
			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, leageuid);
			rs = psmt.executeQuery();
			while (rs.next()) {
				CrawlingVo vo = new CrawlingVo(
						rs.getString("teamname"), 
						rs.getInt("play"), 
						rs.getInt("won"),
						rs.getInt("draw"),
						rs.getInt("loss"), 
						rs.getInt("gf"),
						rs.getInt("ga"),
						rs.getString("gd"),
						rs.getInt("point"));
				
				result.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (psmt != null) {
				try {
					psmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;

	}

	public int insertTeam(int no, String teamName, int pl, int won, int draw, int loss, int gf, int ga, String gd, int point) {
		String sql = "INSERT INTO test"
//		(\"NO\", \"NAME\",\"COACH\",\"HOMETOWN\",\"BESTPLAYER\",\"POINT\",\"PREVIOUSRANK\",\"MOMPOINT\",\"PLAY\",\"id\")"
				+ " VALUES (?,?,?,?,?,?,?,?,?,?)";

		Connection conn = jdbcTemplate.getConnection();
		PreparedStatement psmt = null;

		int result = 0;

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, no);
			psmt.setString(2, teamName);
			psmt.setInt(3, pl);
			psmt.setInt(4, won);
			psmt.setInt(5, draw);
			psmt.setInt(6, loss);
			psmt.setInt(7, gf);
			psmt.setInt(8, ga);
			psmt.setString(9, gd);
			psmt.setInt(10, point);

			result = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (psmt != null) {
				try {
					psmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return result;

	}

	public int updateScore(String teamName, String pl, String won, String draw, String loss, String gf, String ga,
			String gd, String point) {
		String sql = "UPDATE test SET " +"play= ?," + "won= ?," + "draw = ?" +
				 "loss = ?" + "gf = ?" + "ga = ?" +"gd = ?" +"point = ?"+"WHERE teamanme =?";
		System.out.println(sql);
		Connection conn = jdbcTemplate.getConnection();
		PreparedStatement psmt = null;
		int result = 0;

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pl);
			psmt.setString(2, won);
			psmt.setString(3, draw);
			psmt.setString(4, loss);
			psmt.setString(5, gf);
			psmt.setString(6, ga);
			psmt.setString(7, gd);
			psmt.setString(8, point);

			result = psmt.executeUpdate();
			System.out.println("Team" + teamName + " update 완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (psmt != null) {
				try {
					psmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;

	}

}
