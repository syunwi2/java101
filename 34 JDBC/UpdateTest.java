package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "SCOTT";
		String pw = "TIGER";
		
		//===== 1. 드라이버 로딩 =====
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//===== 2. 연결, 커넥션 맺기 =====
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(url, id, pw);
			String sql = "update dept set dname = ?, loc = ? where deptno = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, "인사");
			pstmt.setString(2, "제주");
			pstmt.setInt(3, 50);
			
			int n = pstmt.executeUpdate();
			
			System.out.println(n + "개가 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

		
	}

}

